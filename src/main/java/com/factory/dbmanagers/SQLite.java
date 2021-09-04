package com.factory.dbmanagers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 * Responsable de generar conexiones y desconexiones a SQLite
 */
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
}
