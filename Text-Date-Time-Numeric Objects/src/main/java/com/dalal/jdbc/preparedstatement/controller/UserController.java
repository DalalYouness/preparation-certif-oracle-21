package com.dalal.jdbc.preparedstatement.controller;

import com.dalal.jdbc.preparedstatement.entities.User;
import com.dalal.jdbc.preparedstatement.service.UserService;

import java.sql.SQLException;

public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void createUser(User user) throws SQLException {
        userService.createUser(user);
    }
}
