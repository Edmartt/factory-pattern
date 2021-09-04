package com.factory.dbmaangers_factory;

import com.factory.dbmanagers.Mariadb;
import com.factory.dbmanagers.iDatabaseManager;
import com.factory.main.DbManagerList;

/**
 * Genera instancias de la MariaDB
 */
public class InstanceMaria implements Instances{

    @Override
    public iDatabaseManager returnInstance(DbManagerList manager) {
        if (manager != DbManagerList.MARIADB) {
            return null;
        }
        return new Mariadb();
    }
}