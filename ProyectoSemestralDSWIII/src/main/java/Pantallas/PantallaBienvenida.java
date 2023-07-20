package Pantallas;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class PantallaBienvenida extends JFrame implements ActionListener {
	    private JButton btnContinuar;

	    public PantallaBienvenida() {
	        setTitle("Bienvenido");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        JLabel label = new JLabel("¡Bienvenido a nuestra tienda!");
	        label.setFont(new Font("Arial", Font.PLAIN, 20));

	        btnContinuar = new JButton("Continuar");
	        btnContinuar.addActionListener(this);

	        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
	        panel.add(label);
	        panel.add(btnContinuar);

	        add(panel);
	    }

	 
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnContinuar) {
	            Main Main = new Main();
	            Main.setVisible(true);
	            dispose(); 
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new PantallaBienvenida().setVisible(true);
	            }
	        });
	    }
	}


