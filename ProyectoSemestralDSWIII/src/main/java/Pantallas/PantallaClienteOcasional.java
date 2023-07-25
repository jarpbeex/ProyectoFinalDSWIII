package Pantallas;
import javax.swing.*;

public class PantallaClienteOcasional extends JFrame {
    public PantallaClienteOcasional() {
        setTitle("Cliente Ocasional");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("¡Bienvenido, cliente ocasional!");
        add(label);
    }
}



