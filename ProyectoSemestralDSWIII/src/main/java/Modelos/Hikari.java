/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author josue
 */
public class Hikari {
    private static final HikariConfig configuracion = new HikariConfig();
    private static final HikariDataSource dataS;

    static {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("C:/Users/josue/Desktop/ProyectoFinalDSWIII-main (1)/ProyectoFinalDSWIII-main/database.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        configuracion.setJdbcUrl(properties.getProperty("db.url"));
        configuracion.setUsername(properties.getProperty("db.username"));
        configuracion.setPassword(properties.getProperty("db.password"));
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