package Pantallas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Main extends JFrame implements ActionListener {
 

	    private JButton btnClienteVIP;
	    private JButton btnClienteFrecuente;
	    private JButton btnClienteOcasional;
	    private JButton btnProductos;
	    

	    public Main() {
	        setTitle("Gestion de Clientes");
	        setSize(800, 700);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        btnClienteVIP = new JButton("Cliente VIP");
	        btnClienteFrecuente = new JButton("Cliente Frecuente");
	        btnClienteOcasional = new JButton("Cliente Ocasional");
	        btnProductos = new JButton("Productos");

	        btnClienteVIP.addActionListener(this);
	        btnClienteFrecuente.addActionListener(this);
	        btnClienteOcasional.addActionListener(this);
	        btnProductos.addActionListener(this);

	        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
	        panel.add(btnClienteVIP);
	        panel.add(btnClienteFrecuente);
	        panel.add(btnClienteOcasional);
	        panel.add(btnProductos);

	        add(panel);
	    }

	   
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnClienteVIP) {
	            PantallaClienteVIP pantallaVIP = new PantallaClienteVIP();
	            pantallaVIP.setVisible(true);
	        } else if (e.getSource() == btnClienteFrecuente) {
	            PantallaClienteFrecuente pantallaFrecuente = new PantallaClienteFrecuente();
	            pantallaFrecuente.setVisible(true);
	        } else if (e.getSource() == btnClienteOcasional) {
	            PantallaClienteOcasional pantallaOcasional = new PantallaClienteOcasional();
	            pantallaOcasional.setVisible(true);
	   
	      } else if (e.getSource()==btnProductos) {
	    	  Productos productos =new Productos();
	    	  productos.setVisible(true);
	      }
	  }
	        
	    

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new Main().setVisible(true);
	            }
	        });
	    }
	}




