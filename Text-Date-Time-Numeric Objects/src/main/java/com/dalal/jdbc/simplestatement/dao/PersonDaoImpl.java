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
    private static Statement statement;

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addPerson(Person person) throws SQLException {

        String insertQuery =
                "INSERT INTO personnes (id, firstName, lastName, age) VALUES (" +
                        person.getId() + ",'" +
                        person.getFirstName() + "','" +
                        person.getLastName() + "'," +
                        person.getAge() + ")";
        int rows = statement.executeUpdate(insertQuery);
        if (rows != 1) {
            throw new SQLException("insert error");
        }
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePersonById(int id) throws SQLException {
        String deleteQuery = "DELETE FROM personnes WHERE id=" + id;
        int rowsDeleted = statement.executeUpdate(deleteQuery);
        if (rowsDeleted != 1) {
            throw new SQLException("delete error");
        }
    }

    @Override
    public Person getPersonById(int id) throws SQLException {
        Person person = new Person();
        String query = "SELECT * FROM personnes WHERE id = " + id;
        statement.executeQuery(query);
        ResultSet resultSet = statement.getResultSet();
        if (resultSet.next()) {
            person.setId(resultSet.getInt("id"));
            person.setFirstName(resultSet.getString("firstName"));
            person.setLastName(resultSet.getString("lastName"));
            person.setAge(resultSet.getInt("age"));
        }
        return person;
    }

    @Override
    public List<Person> getAllPersons() throws SQLException {
        String query = "select * from personnes";
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
