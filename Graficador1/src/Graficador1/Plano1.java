package Graficador1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;


public class Plano1 {
	
	private double ancho;
	private double alto;
	Resolucion1 monitor = new Resolucion1();
	
	public Plano1(double ancho, double alto){
		this.ancho = ancho;
		this.alto = alto;		
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public double getAlto() {
		return alto;
	}
	
	public void dibujar(Graphics2D g){
	
			
		for(int i = 0; i < ancho; i+=40){
			Line2D  linea = new Line2D.Double(i,0,i,alto);
		
				g.setColor(new Color(204,204,204));
				g.draw(linea);	
		}
		
		for(int i = 0; i < alto; i+=40){
			Line2D  linea = new Line2D.Double(0,i,ancho,i);
				g.setColor(new Color(204,204,204));
				g.draw(linea);			
		}
		
		g.setColor(Color.BLACK);
		Line2D linea_y = new Line2D.Double((Ventana1.ANCHO/2)-4,0,((Ventana1.ANCHO)/2)-4,Ventana1.ANCHO);	
		Line2D  linea_x = new Line2D.Double(0,(Ventana1.ALTO/2)-23,Ventana1.ANCHO,(Ventana1.ALTO/2)-23);		
		g.draw(linea_x);
		g.draw(linea_y);
		
		//creacion de los numeros de la escala numerica
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif", Font.PLAIN, 10));
		
		int contadorX = 0;
			

		for (int i = -170; i < 170; i+=10) {
			String cadena = Integer.toString(i);
			g.drawString(cadena, contadorX, 370);
			contadorX += 40;
		}
		
		int contadorPequeño = 15;
		
		for (int i = -165; i < 165; i+=10) {
			String cadena = Integer.toString(i);
			g.drawString(cadena, contadorPequeño, 360);
			contadorPequeño += 40;
		}
		

		int contadorY = 0;

		for (int i = -90; i <100; i+=10) {
			String cadena = Integer.toString((i * -1));
			if (i != 0) {
				g.drawString(cadena, 683, contadorY);
			}
			contadorY += 40;
		}
		
		int contadorPequeñoY = 22;
		
		for (int i = -85; i <95; i+=10) {
			String cadena = Integer.toString((i * -1));
			if (i != 0) {
				g.drawString(cadena, 665, contadorPequeñoY);
			}
			contadorPequeñoY += 40;
		}
		
		
	    //creacion de los nombres de los ejes
		g.setFont(new Font("SansSerif", Font.BOLD, 20));
		g.drawString("i", Ventana1.ANCHO/2-20, 20);
		g.drawString("-i", Ventana1.ANCHO/2-25, Ventana1.ALTO-35);
		g.drawString("X", Ventana1.ANCHO-20, Ventana1.ALTO/2+20);
		g.drawString("-X", 0, Ventana1.ALTO/2+20);
	}
}
