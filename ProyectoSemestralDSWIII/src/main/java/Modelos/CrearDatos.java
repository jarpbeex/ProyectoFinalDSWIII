/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Entidades.Cliente;
import Entidades.Compra;
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
public class CrearDatos {
    public Boolean crearCliente(Cliente cliente){

        try(Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement("INSERT INTO CLIENTES(nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)");){
                statement.setString(1, cliente.getNombre());
                statement.setString(2, cliente.getCedula());
                statement.setString(8, cliente.getCiudad());
                statement.setString(9, cliente.getCorregimiento());
                statement.setString(4, cliente.getGenero());
                statement.setString(7, cliente.getProvincia());
                statement.setString(6, cliente.getTelefono());
                statement.setString(10, cliente.getTipo_cliente());
                statement.setString(3, cliente.getFecha_nacimiento());
                statement.setString(5, cliente.getCorreo());
                int fila=statement.executeUpdate();
                System.out.println("La fila insertada fue la fila "+fila);
                 return true;
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(Error ex){
            return false;
        }
    }
    
    public Boolean crearCompras(Compra compra){

        try(Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement
            ("INSERT INTO compras (codigo_compra, cedula, cantidad_productos, costo_total, itbms_cobrado)"
                        + "VALUES(?, ?, ?, ?, ?)");){
                statement.setString(1, compra.getCodigoCompra());
                statement.setString(2, compra.getCedula());
                statement.setInt(3, compra.getProductosComprados());
                statement.setDouble(4, compra.getCostoTotal());
                statement.setDouble(5, compra.getItbmsCobrado());
                int fila=statement.executeUpdate();
                System.out.println("La fila insertada fue la fila "+fila);
                 return true;
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(Error ex){
            return false;
        }
    }
    
    public static void modificar(JTable campoT, String nombre, String fecha_nacimiento, String genero,
            String correo, String telefono, String provincia, String ciudad, String corregimiento, String tipo_cliente, String fila){
        
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("UPDATE clientes SET "
                    + "nombre = ?, fecha_nacimiento = ?, genero = ?, correo = ?, telefono = ?, provincia = ?,"
                    + "ciudad = ?, corregimiento = ?, tipo_cliente = ? WHERE cedula = ?");){
            
            statement.setString(1, nombre);
            statement.setString(2, fecha_nacimiento);
            statement.setString(3, genero);
            statement.setString(4, correo);
            statement.setString(5, telefono);
            statement.setString(6, provincia);
            statement.setString(7, ciudad);
            statement.setString(8, corregimiento);
            statement.setString(9, tipo_cliente);
            statement.setString(10, fila);
            
            
            int filaAct = statement.executeUpdate();
            System.out.println("La fila insertada fue la fila "+filaAct);
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){}
    }
    
    public static void modificarCompras(JTable campoT, String codigo_compra, String cedula, int cantidad,
            double total, double itbms){
        
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("UPDATE compras SET "
                    + "cedula = ?, cantidad_productos = ?, costo_total = ?, itbms_cobrado = ? WHERE codigo_compra = ?");){
            
            statement.setString(5, codigo_compra);
            statement.setString(1, cedula);
            statement.setInt(2, cantidad);
            statement.setDouble(3, total);
            statement.setDouble(4, itbms);
            
            
            int filaAct = statement.executeUpdate();
            System.out.println("La fila insertada fue la fila "+filaAct);
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){}
    }
    
    public static void buscarParaModificar(JTable campoT, String cedula){
        
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("SELECT * FROM clientes WHERE cedula = ?");){

            statement.setString(1, cedula);

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
            model.addColumn("Tipo de cliente");
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
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){}
    }
    
    public static void buscarParaModificarCompras(JTable campoT, String cedula){
        
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("SELECT * FROM compras WHERE cedula = ?");){

            statement.setString(1, cedula);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Numero de compra");
            model.addColumn("Cedula");
            model.addColumn("Cantidad de productos");
            model.addColumn("Costo total");
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
            model.addRow(datos);
        }
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){}
    }
    
    
    public static void eliminar(String cliente){
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("DELETE FROM compras WHERE cedula = ?");){
            statement.setString(1, cliente);
            int fila=statement.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){}   
    }
    
    public static void eliminarCompras(String compra){
        
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("DELETE FROM compras WHERE codigo_compra = ?");){
            
            statement.setString(1, compra);
            
            int fila=statement.executeUpdate();
            System.out.println("La fila insertada fue la fila "+fila);
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Error ex){
      }
    }
    
    
    public static void buscarXCedula(String cedula, JTable campoT){
              Cliente clientes=new Cliente();
            try(Connection conn=Hikari.getConnection();
                PreparedStatement statement=conn.prepareStatement("SELECT * FROM clientes WHERE cedula = ?");){
                statement.setString(1, cedula);
                ResultSet resultados=statement.executeQuery();
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
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   
    public static void buscarXNombre(String nombre, JTable campoT){
        Cliente clientes=new Cliente();
        try(Connection conexion = Hikari.getConnection();
            PreparedStatement statement = conexion.prepareStatement("SELECT * FROM clientes WHERE nombre = ?");){
            statement.setString(1, nombre);
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
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
     
    public static void buscarXCiudad(String ciudad, JTable campoT){
              Cliente clientes=new Cliente();
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("SELECT * FROM clientes WHERE ciudad=?");){
            statement.setString(1, ciudad);
            ResultSet resultados=statement.executeQuery();
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
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
     public static void buscarXTipoCliente(String tipo_cliente, JTable campoT){
              Cliente clientes=new Cliente();
        try(Connection conn=Hikari.getConnection();
            PreparedStatement statement=conn.prepareStatement("SELECT * FROM clientes WHERE tipo_cliente = ?");){
            statement.setString(1, tipo_cliente);
            ResultSet resultados=statement.executeQuery();
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
        }catch (SQLException ex) {
            Logger.getLogger(CrearDatos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
