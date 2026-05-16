package codigoCatedra.unidad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PatronesRecursivos extends JFrame implements ItemListener {
	private String opciones[] = { "Triangulo de Sierpinski", "Cuadros anidados" };
	private JComboBox patrones = new JComboBox(opciones);
	private JComboBox niveles = new JComboBox();
	private Canvas canvas = new Canvas();
	private JPanel controles = new JPanel();

	public PatronesRecursivos() {
		setTitle("Patrones Recursivos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int k = 0; k < 11; k++)
			this.niveles.addItem(k + "");
		this.patrones.setSelectedItem(this.opciones[0]);
		this.niveles.setSelectedItem("4");
		this.canvas.setBorder(BorderFactory.createTitledBorder("Dibujando el Canvas"));
		this.controles.add(this.niveles);
		this.controles.add(this.patrones);
		getContentPane().add(this.controles, "North");
		getContentPane().add(this.canvas, "Center");
		this.niveles.addItemListener(this);
		this.patrones.addItemListener(this);
		setSize(this.canvas.WIDTH, this.canvas.HEIGHT + this.controles.getSize().width);
	}

	public void itemStateChanged(ItemEvent e) {
		this.canvas.setPatron(this.patrones.getSelectedIndex(), this.niveles.getSelectedIndex());
		repaint();
	}
}

