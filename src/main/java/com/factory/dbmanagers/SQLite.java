package com.factory.dbmanagers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SQLite implements iDatabaseManager{
    private String DRIVER = "org.sqlite.JDBC";
    private Connection connection = null;
    PreparedStatement preparedStm = null;

    @Override
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection("jdbc:sqlite:sqlite.db");
            System.out.println("Connected to SQLite");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    public void createTables(Connection connection){
        
        String sql = "CREATE TABLE IF NOT EXISTS `users`( \n"
        + "  `id` INTEGER PRIMARY KEY AUTOINCREMENT, \n"
        + "  `name` varchar(30) NOT NULL UNIQUE,\n"
        + "  `lastname` varchar(50),\n"
        + "  `country` varchar(80) NOT NULL,\n"
        + "   `email`  varchar(80) NOT NULL)";

        try {
            preparedStm = connection.prepareStatement(sql);
             preparedStm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
