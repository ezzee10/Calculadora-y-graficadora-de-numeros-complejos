package Graficador1;

import java.text.DecimalFormat;

public class Punto1 {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	DecimalFormat formato = new DecimalFormat("0.00");

	
	public Punto1(double x, double y) {
		super();
		this.x2 = x;
		this.y2 = y;
		this.x1 = (((double)Ventana1.ANCHO/2)-4) + x;
		this.y1 = (((double) Ventana1.ALTO/2)-24) + ((-1)* (y));
	}

	public double get_x() {
		return x1;
	}
	public void set_x(double x1) {
		this.x1 = x1;
	}
	public double get_y() {
		return y1;
	}
	public void set_y(double y1) {
		this.y1 = y1;
	}
	
	public String toString(){
			return " z= "+formato.format(this.x2/4)+ " + " +formato.format(this.y2/4)+ " i ";
		}
}
