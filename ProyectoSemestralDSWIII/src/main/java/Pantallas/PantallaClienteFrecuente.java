package Pantallas;
import javax.swing.*;

public class PantallaClienteFrecuente extends JFrame {
    public PantallaClienteFrecuente() {
        setTitle("Cliente Frecuente");
        setSize(500,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("¡Bienvenido, cliente frecuente!");
        add(label);
    }
}




