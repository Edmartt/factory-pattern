package com.factory.dbmanagers;

import java.sql.Connection;

public interface iDatabaseManager {
    
    Connection getConnection();
    void closeConnection();

}
