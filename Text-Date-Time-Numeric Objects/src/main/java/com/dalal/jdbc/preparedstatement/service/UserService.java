package com.dalal.jdbc.preparedstatement.service;

import com.dalal.jdbc.preparedstatement.entities.User;

import java.sql.SQLException;

public interface UserService {
    void createUser(User user) throws SQLException;
}
