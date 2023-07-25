/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class ControlDatos {
    public Boolean insertar(Cliente newCliente) {
        String consulta = "INSERT INTO clientes(cedula, nombre, fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {

            statement.setString(1, newCliente.getNombre());
            statement.setString(2, newCliente.getCedula());
            statement.setString(3, newCliente.getFecha_nacimiento());
            statement.setString(4, newCliente.getGenero());
            statement.setString(5, newCliente.getCorreo());
            statement.setString(6, newCliente.getTelefono());
            statement.setString(7, newCliente.getProvincia());
            statement.setString(8, newCliente.getCiudad());
            statement.setString(9, newCliente.getCorregimiento());
            statement.setString(10, newCliente.getTipo_cliente());

            int fila = statement.executeUpdate();
            System.out.println("La cantidad de filas afectadas fueron: " + fila);
            return true;

        }catch (SQLException ex){
            Logger.getLogger(ControlDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
