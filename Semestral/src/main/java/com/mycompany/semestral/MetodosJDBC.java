
package com.mycompany.semestral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodosJDBC {
    
    public Boolean crear(Clientes clientes){
        
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("INSERT INTO CLIENTES(nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");){
                statement.setString(1, clientes.getNombre());
                statement.setString(2, clientes.getCedula());
                statement.setString(8, clientes.getCiudad());
                statement.setString(9, clientes.getCorregimiento());
                statement.setString(4, clientes.getGenero());
                statement.setString(7, clientes.getProvincia());
                statement.setString(6, clientes.getTelefono());
                statement.setString(10, clientes.getTipoCliente());
                statement.setString(3, clientes.getFechaNacimiento());
                statement.setString(5, clientes.getCorreo());
                int fila=statement.executeUpdate();
                System.out.println("La fila insertada fue la fila "+fila);
                 return true;
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(Error ex){
            return false;
      }
            
    }
    
    public Boolean modificar(Clientes clientes){
        
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("UPDATE SET nombre=?, genero=?, correo=?, telefono=? WHERE cedula=? ");){
                statement.setString(1, clientes.getNombre());
                statement.setString(4, clientes.getGenero());
                statement.setString(6, clientes.getTelefono());
                statement.setString(5, clientes.getCorreo());
                int fila=statement.executeUpdate();
                System.out.println("La fila insertada fue la fila "+fila);
                 return true;
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(Error ex){
            return false;
      }
            
    }
    
    public Boolean eliminar(Clientes clientes){
        
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("DELETE FROM clientes WHERE cedula=? ");){
                statement.setString(1, clientes.getCedula());
                int fila=statement.executeUpdate();
                System.out.println("La fila insertada fue la fila "+fila);
                 return true;
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(Error ex){
            return false;
      }
            
            
    }
    
    public Clientes buscarXCedula(String cedula){
              Clientes clientes=new Clientes();
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("SELECT nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente"
                        + "FROM clientes WHERE cedula=?");){
                statement.setString(1, cedula);
                ResultSet resultados=statement.executeQuery();
                while(resultados.next()){
                    clientes.setNombre(resultados.getString("nombre"));
                    clientes.setCedula(resultados.getString("cedula"));
                    clientes.setFechaNacimiento(resultados.getString("fecha_nacimiento"));
                    clientes.setGenero(resultados.getString("genero"));
                    clientes.setCorreo(resultados.getString("correo"));
                    clientes.setTelefono(resultados.getString("telefono"));
                    clientes.setProvincia(resultados.getString("provincia"));
                    clientes.setCiudad(resultados.getString("ciudad"));
                    clientes.setCorregimiento(resultados.getString("corregimiento"));
                    clientes.setTipoCliente(resultados.getString("tipo_cliente"));
                }
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
        }
            return clientes;
            
    }
   
     public Clientes buscarXNombre(String nombre){
              Clientes clientes=new Clientes();
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("SELECT nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente"
                        + "FROM clientes WHERE cedula=?");){
                statement.setString(1, nombre);
                ResultSet resultados=statement.executeQuery();
                while(resultados.next()){
                    clientes.setNombre(resultados.getString("nombre"));
                    clientes.setCedula(resultados.getString("cedula"));
                    clientes.setFechaNacimiento(resultados.getString("fecha_nacimiento"));
                    clientes.setGenero(resultados.getString("genero"));
                    clientes.setCorreo(resultados.getString("correo"));
                    clientes.setTelefono(resultados.getString("telefono"));
                    clientes.setProvincia(resultados.getString("provincia"));
                    clientes.setCiudad(resultados.getString("ciudad"));
                    clientes.setCorregimiento(resultados.getString("corregimiento"));
                    clientes.setTipoCliente(resultados.getString("tipo_cliente"));
                }
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
        }
            return clientes;
            
    }
     
      public Clientes buscarXCiudad(String ciudad){
              Clientes clientes=new Clientes();
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("SELECT nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente"
                        + "FROM clientes WHERE cedula=?");){
                statement.setString(1, ciudad);
                ResultSet resultados=statement.executeQuery();
                while(resultados.next()){
                    clientes.setNombre(resultados.getString("nombre"));
                    clientes.setCedula(resultados.getString("cedula"));
                    clientes.setFechaNacimiento(resultados.getString("fecha_nacimiento"));
                    clientes.setGenero(resultados.getString("genero"));
                    clientes.setCorreo(resultados.getString("correo"));
                    clientes.setTelefono(resultados.getString("telefono"));
                    clientes.setProvincia(resultados.getString("provincia"));
                    clientes.setCiudad(resultados.getString("ciudad"));
                    clientes.setCorregimiento(resultados.getString("corregimiento"));
                    clientes.setTipoCliente(resultados.getString("tipo_cliente"));
                }
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
        }
            return clientes;
            
    }
    
     public Clientes buscarXTipoCliente(String tipo_cliente){
              Clientes clientes=new Clientes();
            try(Connection conn=Hikari.getConection();
                PreparedStatement statement=conn.prepareStatement("SELECT nombre, cedula,fecha_nacimiento, genero, correo, telefono, provincia, ciudad, corregimiento, tipo_cliente"
                        + "FROM clientes WHERE cedula=?");){
                statement.setString(1, tipo_cliente);
                ResultSet resultados=statement.executeQuery();
                while(resultados.next()){
                    clientes.setNombre(resultados.getString("nombre"));
                    clientes.setCedula(resultados.getString("cedula"));
                    clientes.setFechaNacimiento(resultados.getString("fecha_nacimiento"));
                    clientes.setGenero(resultados.getString("genero"));
                    clientes.setCorreo(resultados.getString("correo"));
                    clientes.setTelefono(resultados.getString("telefono"));
                    clientes.setProvincia(resultados.getString("provincia"));
                    clientes.setCiudad(resultados.getString("ciudad"));
                    clientes.setCorregimiento(resultados.getString("corregimiento"));
                    clientes.setTipoCliente(resultados.getString("tipo_cliente"));
                }
        }catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
        }
            return clientes;
            
    }
     
     
      
}
