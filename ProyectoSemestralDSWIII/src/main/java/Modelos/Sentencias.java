/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;

/**
 *
 * @author josue
 */
public class Sentencias {
    
    public void mostrar (String tabla){
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = null;) {
            
            
            
        }catch(){
            
        }
        String sqlSentencia = "SELECT * FROM " + tabla;
    }
    
}
