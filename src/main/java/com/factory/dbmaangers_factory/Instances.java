package com.factory.dbmaangers_factory;

import com.factory.dbmanagers.iDatabaseManager;
import com.factory.main.DbManagerList;

/**
 * Al implementar esta interfaz se libera a la clase factory
 * de los condicionales que retornan una instancia segun el gestor de BD
 *
 */
public interface Instances {
    /**
     * Retorna instancias que generan conexion a una bd según el nombre
     * del gestor que se pase como argumento.
     * @param manager Enum
     * @return instancia generadora de conexion a BD
     */
    iDatabaseManager returnInstance(DbManagerList manager);
}
