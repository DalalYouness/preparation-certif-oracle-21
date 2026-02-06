package com.dalal.jdbc.simplestatement.dao;

import com.dalal.jdbc.simplestatement.entites.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonDao {
    public void addPerson(Person person) throws SQLException;
    public void updatePerson(Person person);
    public void deletePersonById(int id) throws SQLException;
    public Person getPersonById(int id) throws SQLException;
    public List<Person> getAllPersons() throws SQLException;
}
