/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author josue
 */
public class Hikari {
    private static final HikariConfig configuracion = new HikariConfig();
    private static final HikariDataSource dataS;

    static {
        configuracion.setJdbcUrl("jdbc:mariadb://localhost:3307/gestion_clientes");
        configuracion.setUsername("estudiante");
        configuracion.setPassword("jorjorxdlol12");
        configuracion.addDataSourceProperty("cachePrepStms", true);
        configuracion.addDataSourceProperty("prepStmsCacheSize", 250);
        configuracion.addDataSourceProperty("prepStmsCacheSqlLimit", 2048);

        dataS = new HikariDataSource(configuracion);
    }

    public static Connection getConnection() throws SQLException {
        return dataS.getConnection();
    }

    // Esta vacio para que no se cree una instancia.
    private Hikari() {
    }
}
