package Calculadora;

public class Funcion {
	
	private Complejo a;
	private Complejo b;
	private Complejo c;
	
	public Funcion(Complejo a, Complejo b, Complejo c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean comprobacion(){
		if(a.obtenerReal()<=16 && b.obtenerReal()<=16 && c.obtenerReal() <=16 && a.obtenerReal()>=-17 && 
		   b.obtenerReal()>=-17 && c.obtenerReal()>=-17 && a.obtenerImaginario()<=8 && b.obtenerImaginario() <=8 && 
		   c.obtenerImaginario()<=8 && a.obtenerImaginario() >= -9 && b.obtenerImaginario() >=-9 && c.obtenerImaginario() >=-9){
			return true;
		}else{
			return false;
		}
	}

}
