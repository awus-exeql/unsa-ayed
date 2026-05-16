package taller04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiFrame2 extends JFrame {
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private Container contenedor;
	private JTextField txtValora, txtValorb, txtRtdo;
	private JButton boton;
	private JPanel panelDatos, panelBoton;
	
	public MiFrame2(){
		setTitle("Sumar enteros");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(2, 1));
		armarPanelDatos();
		armarPanelBoton();
	}
	
	private void armarPanelDatos(){
		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(3,2));
		//completar
	}
	
	private void armarPanelBoton(){
		panelBoton = new JPanel();
		boton = new JButton("Sumar");
		//completar
	}
	
}
