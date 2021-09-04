package com.factory.dbmaangers_factory;

import com.factory.dbmanagers.iDatabaseManager;
import com.factory.main.DbManagerList;

public class Factory {
    /**
     * 
     * @param ins Instancia del gestor de bd relacional deseado
     * @param manager Enum que representa el nombre del gestor de BD
     * @return Instancia del gestor deseado que generara la conexión a la BD
     */
    public iDatabaseManager getDBManager(Instances ins, DbManagerList manager){
        return ins.returnInstance(manager);
    }
}