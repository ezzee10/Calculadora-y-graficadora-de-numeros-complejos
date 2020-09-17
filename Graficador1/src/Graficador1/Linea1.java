package Graficador1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;

public class Linea1 {
	private Punto1 punto1;
	private Punto1 punto2;
	private int numDeLinea;


	public Linea1(double x1, double y1, double x2, double y2, int numero_de_linea) {

		this.punto1 = new Punto1(x1*4, y1*4);
		this.punto2 = new Punto1(x2*4, y2*4);
		this.numDeLinea = numero_de_linea;
		
	}

	public void dibujar(Graphics2D g) {
		
		if(numDeLinea == 1){
			
		g.setColor(Color.BLUE);
		g.setFont(new Font("SansSerif", Font.BOLD, 15));
		g.drawString(punto2.toString(), (int) punto2.get_x() + 2, (int) punto2.get_y() - 2);
		Line2D linea = new Line2D.Double(punto1.get_x(), punto1.get_y(), punto2.get_x(), punto2.get_y());
		g.draw(linea);
		
		}else if(numDeLinea == 2){
			
			g.setColor(Color.RED);
			g.setFont(new Font("SansSerif", Font.BOLD, 15));
			g.drawString(punto2.toString(), (int) punto2.get_x() + 2, (int) punto2.get_y() - 2);			
			Line2D linea = new Line2D.Double(punto1.get_x(), punto1.get_y(), punto2.get_x(), punto2.get_y());
			g.draw(linea);
			
		}else if(numDeLinea == 3){
			
			g.setColor(Color.GREEN);
			g.setFont(new Font("SansSerif", Font.BOLD, 15));
			
			g.drawString(punto2.toString(), (int) punto2.get_x() + 2, (int) punto2.get_y() - 2);
			Line2D linea = new Line2D.Double(punto1.get_x(), punto1.get_y(), punto2.get_x(), punto2.get_y());
			g.draw(linea);
		}
		
	}
}
