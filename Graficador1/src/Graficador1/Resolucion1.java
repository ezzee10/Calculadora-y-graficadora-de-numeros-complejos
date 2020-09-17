package Graficador1;

public class Resolucion1 {
	
	private int alto;
	private int ancho;
	
	public Resolucion1() {
		this.ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		this.alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		
		if(ancho>alto) {
			this.ancho = alto;
		}else {
			this.alto = ancho;
		}
	}
	
	public int get_ancho() {
		return ancho;
	
	}
	
	public int get_alto() {
		return alto;
	
	}

	

}
