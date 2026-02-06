package com.dalal.jdbc.simplestatement.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String url = "jdbc:mysql://localhost:3306/personDB?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final java.sql.Connection connection;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    static java.sql.Connection getConnection() {
        return connection;
    }


}
