package com.dalal.jdbc.preparedstatement.presentation;

import com.dalal.jdbc.preparedstatement.controller.UserController;
import com.dalal.jdbc.preparedstatement.entities.User;
import com.dalal.jdbc.preparedstatement.repository.UserDaoImp;
import com.dalal.jdbc.preparedstatement.service.UserServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPrepared {

    public static User readUser() {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        user.setUsername(sc.next());
        System.out.println("Enter password: ");
        user.setPassword(sc.next());
        return user;
    }

    public static void template(String title) {
        System.out.println("*********************************");
        System.out.println("\t\t" + title);
        System.out.println("*********************************");
    }
    public static void main(String[] args) throws SQLException {
        UserController userController = new UserController(new UserServiceImpl(new UserDaoImp()));
        template("AJOUTER UTILISATEUR");
        User user = readUser();
        userController.createUser(user);

    }
}
