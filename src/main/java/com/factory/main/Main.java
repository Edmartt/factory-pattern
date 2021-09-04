package com.factory.main;
import com.factory.dbmaangers_factory.Instances;
import com.factory.dbmaangers_factory.InstanceSQLite;
import com.factory.dbmanagers.iDatabaseManager;
import com.factory.dbmaangers_factory.Factory;

public class Main {

    public static void main(String... args) {
        Factory factory = new Factory();
        Instances managerInstance = new InstanceSQLite();
        iDatabaseManager db_connector = factory.getDBManager(managerInstance, DbManagerList.SQLITE);
        db_connector.getConnection();
    }
}