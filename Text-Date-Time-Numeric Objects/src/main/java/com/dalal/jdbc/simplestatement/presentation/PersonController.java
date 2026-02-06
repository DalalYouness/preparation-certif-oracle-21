package com.dalal.jdbc.simplestatement.presentation;

import com.dalal.jdbc.simplestatement.entites.Person;
import com.dalal.jdbc.simplestatement.service.PersonService;

import java.sql.SQLException;
import java.util.List;

public class PersonController {
    private PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void AllPersons() throws SQLException {
        System.out.println("All Persons");
        List<Person> allPersons = personService.getAllPersons();
        System.out.println("**************************");
        for (Person person : allPersons) {
            System.out.println(person);
        }
        System.out.println("**************************");
    }
    public void addPerson(Person person) throws SQLException {
        if (person == null) return;
        personService.addPerson(person);
    }
    public Person getPersonById(int id) throws SQLException {
        if (id <= 0) return null;
        return personService.getPersonById(id);
    }
    public void updatePerson(Person person) throws SQLException {
        if (person == null) return;
        personService.updatePerson(person);
    }
}
