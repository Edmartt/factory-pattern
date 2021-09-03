package com.factory.main;

import com.factory.dbmaangers_factory.Factory;
import com.factory.dbmanagers.iDatabaseManager;

public class Main {

    public static void main(String... args) {
        Factory factory = new Factory();
        iDatabaseManager db_connector = factory.getDBManager(DbManagerList.SQLITE);
        db_connector.getConnection();
    }
}