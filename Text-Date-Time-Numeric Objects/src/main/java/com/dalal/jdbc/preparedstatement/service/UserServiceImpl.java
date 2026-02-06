package com.dalal.jdbc.preparedstatement.service;

import com.dalal.jdbc.preparedstatement.entities.User;
import com.dalal.jdbc.preparedstatement.repository.UserDao;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) throws SQLException {
        if(user == null){
            return;
        }
        userDao.create(user);
    }
}
