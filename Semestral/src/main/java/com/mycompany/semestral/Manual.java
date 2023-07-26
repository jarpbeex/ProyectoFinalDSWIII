
package com.mycompany.semestral;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manual {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PreparedStatement statement;
        Connection conn=null;
        String urlDB="jdbc:mariadb://localhost:3306/messi";
        String usuario="estudiante";
        String contraseña="jojo1023";
        String r;
        String c;
        try {
             conn=DriverManager.getConnection(urlDB,usuario,contraseña);
             System.out.println("Desea realizar una conuslta?");
             r=sc.next();
             if("sí".equals(r)){
                 System.out.println("Ingrese la consulta que desee realizar");
                 c=sc.next();
                  statement=conn.prepareStatement(c);
                 statement.execute();
             }else{
             }  
            
        } catch (SQLException ex) {
            Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Manual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}




