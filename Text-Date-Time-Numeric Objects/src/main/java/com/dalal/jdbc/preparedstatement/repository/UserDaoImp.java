package com.dalal.jdbc.preparedstatement.repository;

import com.dalal.jdbc.preparedstatement.entities.User;
import com.dalal.jdbc.simplestatement.connection.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class UserDaoImp implements UserDao{
    private Connection connection = ConnectionSingleton.getConnection();


    public UserDaoImp() throws SQLException {
    }

    @Override
    public void create(User user) throws SQLException {
        String insertQuery = "insert into users (username,mot_de_passe) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
      /*preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2,user.getPassword());*/
        //or
        preparedStatement.setObject(1,user.getUsername(), Types.VARCHAR);
        preparedStatement.setObject(2,user.getPassword(), Types.VARCHAR);
        preparedStatement.executeUpdate();
    }
}
