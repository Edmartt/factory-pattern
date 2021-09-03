package com.factory.dbmaangers_factory;

import com.factory.dbmanagers.Mariadb;
import com.factory.dbmanagers.SQLite;
import com.factory.dbmanagers.iDatabaseManager;
import com.factory.main.DbManagerList;

public class Factory {
    
    public iDatabaseManager getDBManager(DbManagerList dbManager){
        if (dbManager == null){
            return null;
        }
        if(dbManager == DbManagerList.MARIADB){
            return new Mariadb();
        }else if(dbManager == DbManagerList.SQLITE){
            return new SQLite();
        }
        return null;
    }
}
