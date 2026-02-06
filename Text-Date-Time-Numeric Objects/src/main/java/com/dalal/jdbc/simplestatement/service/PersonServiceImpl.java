package com.dalal.jdbc.simplestatement.service;

import com.dalal.jdbc.simplestatement.dao.PersonDao;
import com.dalal.jdbc.simplestatement.dao.PersonDaoImpl;
import com.dalal.jdbc.simplestatement.entites.Person;

import java.sql.SQLException;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;
    //dependency injection
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void addPerson(Person person) throws SQLException {
        if (person == null) return;
        personDao.addPerson(person);
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePersonById(int id) throws SQLException {
        Person person = personDao.getPersonById(id);
        if (person == null) return;
        personDao.deletePersonById(id);
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() throws SQLException {
        return personDao.getAllPersons();
    }
}
