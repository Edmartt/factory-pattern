package com.factory.dbmanagers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements iDatabaseManager{
    String username = "";
    String password = "";
    String database = "";
    String DRIVER = "org.mariadb.jdbc.Driver";
    String URL = "jdbc:mariadb://localhost:3306/"+database;
    Connection connection = null;

    @Override
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connected to MariaDB");
        } catch (SQLException e) {
            e.printStackTrace();
        }  catch (ClassNotFoundException e){
            e.printStackTrace();
        }      
        return connection;
    }

    @Override
    public void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    } 
}
