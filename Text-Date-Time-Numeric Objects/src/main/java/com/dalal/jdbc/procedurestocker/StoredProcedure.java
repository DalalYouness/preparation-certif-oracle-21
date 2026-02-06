package com.dalal.jdbc.procedurestocker;

import com.dalal.jdbc.simplestatement.connection.ConnectionSingleton;

import com.dalal.jdbc.simplestatement.entites.Person;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoredProcedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionSingleton.getConnection();
        String storedProcedure = "{call listPersonne()}";
        CallableStatement callableStatement = connection.prepareCall(storedProcedure);
        ResultSet listPersonnes = callableStatement.executeQuery();
       List<Person> listPersonne = new ArrayList<>();
        while (listPersonnes.next()) {
           Person person = new Person();
           person.setId(listPersonnes.getInt("id"));
           person.setFirstName(listPersonnes.getString("firstName"));
           person.setLastName(listPersonnes.getString("lastName"));
           person.setAge(listPersonnes.getInt("age"));
           listPersonne.add(person);
        }

        listPersonne.forEach(System.out::println);
    }
}
