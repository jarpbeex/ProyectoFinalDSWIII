/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class MostrarDatos {
    
    public static void MostrarDatos (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Fecha de nacimiento");
            model.addColumn("Genero");
            model.addColumn("Correo");
            model.addColumn("Telefono");
            model.addColumn("Provincia");
            model.addColumn("Ciudad");
            model.addColumn("Corregimiento");
            model.addColumn("Status");
            campoT.setModel(model);
            
            String [] datos = new String[10];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void MostrarDatosVIP (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Fecha de nacimiento");
            model.addColumn("Genero");
            model.addColumn("Correo");
            model.addColumn("Telefono");
            model.addColumn("Provincia");
            model.addColumn("Ciudad");
            model.addColumn("Corregimiento");
            model.addColumn("Status");
            model.addColumn("Nombre de Asesor");
            campoT.setModel(model);
            
            String [] datos = new String[11];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                
                String nombreAsesor = rs.getString(11);
                datos[10] = nombreAsesor;
                
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void MostrarDatosFProductos (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Producto Frecuente");

            campoT.setModel(model);
            
            String [] datos = new String[3];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void MostrarDatosFDescuento (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Descuento");

            campoT.setModel(model);
            
            String [] datos = new String[3];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);              
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void MostrarDatosAsesor (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Asesor");

            campoT.setModel(model);
            
            String [] datos = new String[3];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);              
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void MostrarDatosCredito (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Credito");

            campoT.setModel(model);
            
            String [] datos = new String[3];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);              
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void MostrarDatosCompra (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Codigo de compra");
            model.addColumn("Cedula");
            model.addColumn("Cantidad de productos");
            model.addColumn("Costo Total");
            model.addColumn("ITBMS Cobrado");
            campoT.setModel(model);
            
            String [] datos = new String[10];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void MostrarComprasPromedio (JTable campoT, String cedula) {
        String consulta = "SELECT nombre, AVG(costo_total) AS Promedio FROM compras JOIN clientes ON compras.cedula = clientes.cedula WHERE clientes.cedula = ?";
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            statement.setString(1, cedula);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Promedio de todas las compras");
            campoT.setModel(model);

            String [] datos = new String[2];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                model.addRow(datos);
            }
            
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void MostrarDatosProductos (JTable campoT, String consulta) {
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);) {
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Codigo de barra");
            model.addColumn("Nombre producto");
            model.addColumn("Precio estandar");
            model.addColumn("Precio de descuento");
            campoT.setModel(model);
            
            String [] datos = new String[10];
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        }catch (SQLException ex){
            Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
