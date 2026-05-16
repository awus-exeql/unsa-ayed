package taller04;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUIs {


	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mi Primer GUI");
		JLabel etiqueta;
		etiqueta = new JLabel();
		etiqueta.setText("Hola Mejor Mundo!");
		frame.setLayout(new BorderLayout());
		frame.add(etiqueta, BorderLayout.CENTER);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		frame.setVisible(true);

	}

}
