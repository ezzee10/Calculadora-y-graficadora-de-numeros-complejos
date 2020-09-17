package Graficador1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelDibujo1 extends JPanel {

	private double coordenada1, coordenada2, coordenada3, coordenada4,coordenada5, coordenada6;
	Punto1 punto1, punto2;

	public PanelDibujo1(double c1, double c2, double c3, double c4, double c5,
			double c6) {
		this.coordenada1 = c1;
		this.coordenada2 = c2;
		this.coordenada3 = c3;
		this.coordenada4 = c4;
		this.coordenada5 = c5;
		this.coordenada6 = c6;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		Plano1 plano = new Plano1(Ventana1.ANCHO, Ventana1.ALTO);
		plano.dibujar(g2);
		Linea1 linea = new Linea1(0, 0, coordenada1, coordenada2, 1);
		linea.dibujar(g2);
		Linea1 linea2 = new Linea1(0, 0, coordenada3, coordenada4, 2);
		linea2.dibujar(g2);
		Linea1 linea3 = new Linea1(0, 0, coordenada5, coordenada6, 3);
		linea3.dibujar(g2);
	}
}
