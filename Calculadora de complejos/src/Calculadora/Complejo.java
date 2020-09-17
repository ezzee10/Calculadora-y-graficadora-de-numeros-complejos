package Calculadora;

public class Complejo {

	private float real;
	private float imaginario;

	// Constructor//
	public Complejo(float parteReal, float parteImaginaria) {
		this.real = parteReal;
		this.imaginario = parteImaginaria;
	}

	// getter
	public float obtenerReal() {
		return real;
	}

	// getter
	public float obtenerImaginario() {
		return imaginario;
	}

	// setter
	public void setearReal(float parteReal) {
		real = parteReal;
	}

	// setter
	public void setearImaginario(float parteImaginaria) {
		imaginario = parteImaginaria;
	}

	public Complejo suma(Complejo b) {

		Complejo resultado;// creo una variable de tipo Complejo//
		resultado = new Complejo(0, 0);
		resultado.setearReal(this.real + b.obtenerReal());
		resultado.setearImaginario(this.imaginario + b.obtenerImaginario());
		return resultado;
	}

	public Complejo resta(Complejo a, Complejo b) {
		Complejo resultado;
		resultado = new Complejo(0, 0);
		resultado.setearReal(a.obtenerReal() - b.obtenerReal());
		resultado.setearImaginario(a.obtenerImaginario() - b.obtenerImaginario());
		return resultado;
	}

	public Complejo multiplicacion(Complejo a, Complejo b) {
		Complejo resultado;
		resultado = new Complejo(0, 0);
		resultado.setearReal(a.obtenerReal() * b.obtenerReal() + (a.obtenerImaginario() * b.obtenerImaginario() * (-1)));
		resultado.setearImaginario(a.obtenerReal() * b.obtenerImaginario() + a.obtenerImaginario() * b.obtenerReal());
		return resultado;
	}

	public Complejo division(Complejo b) {
		Complejo resultado;
		resultado = new Complejo(0, 0);
		if((b.obtenerReal() == 0) && (b.obtenerImaginario()==0)){
			throw new ArithmeticException("No se admite dividir entre 0");
		}
		float numeradorReal = this.real * b.obtenerReal() + this.imaginario * b.obtenerImaginario();
		float denominadorReal = (float) (Math.pow(b.obtenerReal(), 2) + Math.pow(b.obtenerImaginario(), 2));
		resultado.setearReal(numeradorReal / denominadorReal);
		resultado.setearImaginario((this.real * b.obtenerImaginario() * (-1) + this.imaginario * b.obtenerReal())/denominadorReal);
		return resultado;
	}
	
	public Complejo determinante2x2(Complejo a, Complejo b, Complejo c, Complejo d) {
		Complejo resultado = new Complejo(0,0);
		Complejo primeraCuenta = new Complejo(0,0);
		Complejo segundaCuenta = new Complejo(0,0);
		primeraCuenta = primeraCuenta.multiplicacion(a,d);
		segundaCuenta = segundaCuenta.multiplicacion(b,c);
		resultado = resultado.resta(primeraCuenta, segundaCuenta);
		return resultado;
	}
	
	public Complejo suma3Complejos(Complejo a, Complejo b, Complejo c) {
		Complejo resultado;
		resultado = new Complejo(0, 0);
		resultado.setearReal(a.obtenerReal() + b.obtenerReal() + c.obtenerReal());
		resultado.setearImaginario(a.obtenerImaginario() + b.obtenerImaginario()+ c.obtenerImaginario());
		return resultado;
	}
	
	public Complejo multiplicar3Complejos(Complejo a, Complejo b, Complejo c) {
		
		Complejo resultado = new Complejo(0,0);
		Complejo resultado2 = new Complejo(0,0);
		resultado.setearReal(a.obtenerReal() * b.obtenerReal() + (a.obtenerImaginario() * b.obtenerImaginario() * (-1)));
		resultado.setearImaginario(a.obtenerReal() * b.obtenerImaginario() + a.obtenerImaginario() * b.obtenerReal());
		resultado2.setearReal(resultado.obtenerReal()*c.obtenerReal() + (resultado.obtenerImaginario()*c.obtenerImaginario()*(-1)));
		resultado2.setearImaginario(resultado.obtenerReal() * c.obtenerImaginario() + resultado.obtenerImaginario() * c.obtenerReal());
		
		return resultado2;
	}
	
	
	public Complejo determinante3x3(Complejo a, Complejo b, Complejo c, Complejo d, Complejo e, Complejo f, Complejo g, Complejo h, Complejo i) {
		Complejo resultado       = new Complejo(0,0);
		Complejo primeraSuma     = new Complejo(0,0);
		Complejo segundaSuma     = new Complejo(0,0);
		Complejo primeraDiagonal = new Complejo(0,0);
		Complejo segundaDiagonal = new Complejo(0,0);
		Complejo terceraDiagonal = new Complejo(0,0);
		Complejo cuartaDiagonal  = new Complejo(0,0);
		Complejo quintaDiagonal  = new Complejo(0,0);
		Complejo sextaDiagonal   = new Complejo(0,0);
		primeraDiagonal = primeraDiagonal.multiplicar3Complejos(a, e, i);
		segundaDiagonal = segundaDiagonal.multiplicar3Complejos(d, h, c);
		terceraDiagonal = terceraDiagonal.multiplicar3Complejos(g, b, f);
		cuartaDiagonal  = cuartaDiagonal.multiplicar3Complejos(c, e, g);
		quintaDiagonal = quintaDiagonal.multiplicar3Complejos(f, h, a);
		sextaDiagonal = sextaDiagonal.multiplicar3Complejos(i,b,d);
		primeraSuma = resultado.suma3Complejos(primeraDiagonal, segundaDiagonal, terceraDiagonal);
		segundaSuma = resultado.suma3Complejos(cuartaDiagonal, quintaDiagonal, sextaDiagonal );
		resultado = resultado.resta(primeraSuma, segundaSuma);
		return resultado;
	}
	
	
}


