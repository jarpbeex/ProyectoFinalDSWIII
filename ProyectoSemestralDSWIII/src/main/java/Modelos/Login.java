/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Frames.*;
import static java.lang.String.valueOf;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author josue
 */ 

public class Login {

    public void validaUsuario(JTextField usuario, JPasswordField contraseña) {
        String consulta = "SELECT * FROM login WHERE login.usuario = (?) AND login.contraseña = (?)";
        try (Connection conexion = Hikari.getConnection();
                PreparedStatement statement = conexion.prepareStatement(consulta);){
            ResultSet resultados;
            String contra = valueOf(contraseña.getPassword());

            statement.setString(1, usuario.getText());
            statement.setString(2, contra);

            resultados = statement.executeQuery();

            if(resultados.next()){
                JOptionPane.showMessageDialog(null, "El usuario es Correcto");
                
                FrameMenu objetoMenu = new FrameMenu();
                objetoMenu.setSize(830, 450);
                objetoMenu.setVisible(true);
                
            }else {
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto, vuelva a intentar."); 
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }
}
