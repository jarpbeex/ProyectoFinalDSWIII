package RecursosAparte;

import Modelos.Hikari;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuiaDeConexion {
    public static void main(String[] args) {
        
        
        
        try (Connection conexion = Hikari.getConnection();
                Statement statement = conexion.createStatement();) {
            String query = "SELECT * FROM productos";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Obtener los valores de las columnas por nombre o índice
                String codigo_barra = resultSet.getString("codigo_barra");
                String nombre = resultSet.getString("nombre_producto");
                Double precio_estandar = resultSet.getDouble("precio_estandar");
                Double precio_descuento = resultSet.getDouble("precio_descuento");

                // Realizar cualquier operación necesaria con los datos obtenidos
                System.out.println("codigo_barra: " + codigo_barra + ", nombre: " + nombre + ", precio_estandar: " + precio_estandar + ", precio_descuento: " + precio_descuento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiaDeConexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        
    }
}
