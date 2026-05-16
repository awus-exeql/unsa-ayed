package patronesRecursivos;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	private static final int TRIANGULO = 0, CUADROS = 1;
	public static final int WIDTH = 620, HEIGHT = 600;

	private final int CUADROH = 150, CUADROV = 100, CUADROLADO = 300, CUADRODELTA = 10;

	private final int TS_P1X = 50;
	private final int TS_P1Y = 400;
	private final int TS_P2X = 550;
	private final int TS_P2Y = 400;
	private final int TS_P3X = 300;
	private final int TS_P3Y = 50;

	private int patron = 0;
	private int nivel = 4;

	public Canvas() {
		setSize(WIDTH, HEIGHT);
	}

	public void setPatron(int patron, int nivel) {
		this.patron = patron;
		this.nivel = nivel;
	}

	public void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.drawRect(0, 0, WIDTH, HEIGHT);
		g.setColor(getForeground());
		switch (this.patron) {
		case TRIANGULO:
			dibujarTriangulo(g, this.nivel, TS_P1X, TS_P1Y, TS_P2X, TS_P2Y, TS_P3X, TS_P3Y);
			break;
		case CUADROS:
			dibujarCuadro(g, this.nivel, CUADROH, CUADROV, CUADROLADO, CUADRODELTA);
			break;
		}
	}

	/**
	 * dibujarTriangulo()---dibuja recursivamente los
	 * Triángulos de Sierpinski
	 * siendo los puntos (p1X, p1Y), (p2X, p2Y), (p3X, p3Y)
	 * los vértices de los triángulos internos.
	 * nivel (>= 0) es el parámetro de recursión (base case: nivel 0)
	 */
	private void dibujarTriangulo(Graphics g, int nivel, int p1X, int p1Y,
			int p2X, int p2Y, int p3X, int p3Y) {
		g.drawLine(p1X, p1Y, p2X, p2Y);
		g.drawLine(p2X, p2Y, p3X, p3Y);
		g.drawLine(p3X, p3Y, p1X, p1Y);
		if (nivel > 0) {
			int q1X = (p1X + p2X) / 2;
			int q1Y = (p1Y + p2Y) / 2;
			int q2X = (p1X + p3X) / 2;
			int q2Y = (p1Y + p3Y) / 2;
			int q3X = (p2X + p3X) / 2;
			int q3Y = (p2Y + p3Y) / 2;
			dibujarTriangulo(g, nivel - 1, p1X, p1Y, q1X, q1Y, q2X, q2Y);
			dibujarTriangulo(g, nivel - 1, p2X, p2Y, q1X, q1Y, q3X, q3Y);
			dibujarTriangulo(g, nivel - 1, p3X, p3Y, q2X, q2Y, q3X, q3Y);
		}
	}

	/**
	 * dibujarCuadro()---dibuja recursivamente un patrón
	 * de cuadros anidados
	 * con la esquina superior izq en (locX, locY) 
	 * y con la longitud dada por lado
	 * nivel (>= 0) es el parámetro de recursión (caso base: nivel 0)
	 * delta se utiliza para ajustar la longitud del lado.
	 */
	private void dibujarCuadro(Graphics g, int nivel,
			int locX, int locY, int lado, int delta) {
		g.drawRect(locX, locY, lado, lado);
		if (nivel > 0) {
			int newLocX = locX + delta;
			int newLocY = locY + delta;
			dibujarCuadro(g, nivel - 1, newLocX, newLocY,
					lado - 2 * delta, delta);
		}
	}
}

