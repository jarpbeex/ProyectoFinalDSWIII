package Conexion;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionHK {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mariadb://localhost:3307/gestion_clientes");
        config.setUsername("estudiante");
        config.setPassword("jorjorxdlol12");

        HikariDataSource dataSource = new HikariDataSource(config);
        
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM productos";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Obtener los valores de las columnas por nombre o índice
                String codigo_barra  = resultSet.getString("codigo_barra");
                String nombre = resultSet.getString("nombre");
                Double precio_estandar = resultSet.getDouble("precio_estandar");
                Double precio_descuento = resultSet.getDouble("precio_descuento");

                // Realizar cualquier operación necesaria con los datos obtenidos
                System.out.println("codigo_barra: " + codigo_barra + ", nombre: " + nombre + ", precio_estandar: " + precio_estandar + ", precio_descuento: " + precio_descuento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
                
    }
}
