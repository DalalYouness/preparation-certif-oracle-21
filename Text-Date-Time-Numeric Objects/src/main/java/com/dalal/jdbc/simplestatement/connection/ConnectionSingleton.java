package com.dalal.jdbc.simplestatement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static final String url = "jdbc:mysql://localhost:3306/personDB?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final Connection connection;

    private ConnectionSingleton() {

    }
    static {

        try {

            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public static Connection getConnection() {
        return connection;
    }


}
