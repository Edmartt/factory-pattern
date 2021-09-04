package com.factory.dbmaangers_factory;

import com.factory.dbmanagers.SQLite;
import com.factory.dbmanagers.iDatabaseManager;
import com.factory.main.DbManagerList;

public class InstanceSQLite implements Instances{

    @Override
    public iDatabaseManager returnInstance(DbManagerList manager) {
        if (manager != DbManagerList.SQLITE) {
            return null;
        }
        return new SQLite();
       
    }
    
}
