package taller04;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiFrame extends JFrame {
	private JLabel etiqueta;
	private Container contenedor;
	
	public MiFrame(){
		setTitle("Mi Segunda GUI");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contenedor = getContentPane();
		contenedor.setLayout(new BorderLayout());
		armarPanel();
	}
	
	private void armarPanel() {
		etiqueta = new JLabel("Hola Mundillo!!");
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(etiqueta, BorderLayout.CENTER);
	}
}
