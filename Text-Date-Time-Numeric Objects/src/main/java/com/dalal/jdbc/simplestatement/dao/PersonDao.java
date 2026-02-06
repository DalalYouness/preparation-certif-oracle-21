package com.dalal.jdbc.simplestatement.dao;

import com.dalal.jdbc.simplestatement.entites.Person;

import java.util.List;

public interface PersonDao {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public void deletePersonById(int id);
    public Person getPersonById(int id);
    public List<Person> getAllPersons();
}
