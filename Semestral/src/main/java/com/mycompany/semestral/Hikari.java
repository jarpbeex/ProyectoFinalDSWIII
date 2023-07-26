
package com.mycompany.semestral;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Hikari {
    private static HikariConfig configuracion=new HikariConfig();
    private static HikariDataSource dataS;
    static{
        configuracion.setJdbcUrl("jdbc:mariadb://localhost:3306/gestion_clientes");
        configuracion.setUsername("estudiantes");
        configuracion.setPassword("jorjorxdlol12");
        configuracion.addDataSourceProperty("cachePrepStmts", true);
        configuracion.addDataSourceProperty("prepStmtCacheSize", 250);
        configuracion.addDataSourceProperty("prepStmtCacheSqlLimit", true);
        dataS=new HikariDataSource(configuracion);
       
        }
            public static Connection getConection() throws SQLException{
            return dataS.getConnection();
    }
            private Hikari(){
          
    }
}
