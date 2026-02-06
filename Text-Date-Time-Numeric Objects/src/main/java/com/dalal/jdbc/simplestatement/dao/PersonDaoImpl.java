package com.dalal.jdbc.simplestatement.dao;

import com.dalal.jdbc.simplestatement.connection.ConnectionSingleton;
import com.dalal.jdbc.simplestatement.entites.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    private static Connection connection = ConnectionSingleton.getConnection();
    private static Statement statement = null;

    @Override
    public void addPerson(Person person) {
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePersonById(int id) {

    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() throws SQLException {
        String query = "select * from personnes";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Person> persons = new ArrayList<>();
        while (resultSet.next()) {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setFirstName(resultSet.getString("firstName"));
            person.setLastName(resultSet.getString("lastName"));
            person.setAge(resultSet.getInt("age"));
            persons.add(person);
        }
        return persons;
    }
}
