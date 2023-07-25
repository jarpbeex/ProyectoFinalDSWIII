package Pantallas;
import javax.swing.*;
public class PantallaClienteVIP extends JFrame {
	public PantallaClienteVIP() {
		setTitle ("Cliente VIP");
		setSize (500,700);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo (null);
		JLabel label = new JLabel("¡Bienvenido, cliente VIP!");
        add(label);
    }

	}


