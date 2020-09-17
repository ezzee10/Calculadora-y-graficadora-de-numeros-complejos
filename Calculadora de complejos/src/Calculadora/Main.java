package Calculadora;
import java.text.DecimalFormat;
import java.util.Scanner;
import Graficador.Ventana;
import Graficador1.Ventana1;

public class Main {

	private static Scanner consola = new Scanner(System.in);

	public static int Menu() {

		int operación;
		System.out.println("Elija la operación que desea realizar");
		System.out.println();
		System.out.println("1- SUMAR");
		System.out.println("2- RESTAR");
		System.out.println("3- MULTIPLICAR");
		System.out.println("4- DIVIDIR");
		System.out.println("5- DETERMINANTE 2X2");
		System.out.println("6- DETERMINANTE 3X3");
		System.out.println("7- GRAFICAR COMPLEJO");
		System.out.println("8- SALIR");
		System.out.println();
		System.out.println("Opción: ");
		operación = consola.nextInt();
		return operación;
	}
	
	public static int segundoMenu() {
		int valor;
		System.out.println("1- Sí");
		System.out.println("2- No");
		valor = consola.nextInt();
		return valor;
	}

	public static void main(String[] args) {
		
		Complejo complejo1, complejo2, resultado;
		DecimalFormat formato1 = new DecimalFormat("0.00");
		float real, imaginario, real1, imaginario1;
		int opcion;
		int valor;
		Ventana ventana;
		Ventana1 ventana1;
		Funcion comprobarGrafico;
		
		
		do {
			opcion = Menu();
		switch (opcion) {
			
		case 1:
			System.out.print("Escriba la parte real del primer número: ");
			real = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del primer número: ");
			imaginario = consola.nextFloat();
			complejo1 = new Complejo(real, imaginario);
			System.out.print("Escriba la parte real del segundo número: ");
			real1 = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del segundo número: ");
			imaginario1 = consola.nextFloat();
			complejo2 = new Complejo(real1, imaginario1);
			resultado = complejo1.suma(complejo2);
			System.out.println("\n"+ "El resultado de la suma es: z=" + "(" + resultado.obtenerReal() + " + "
						+ resultado.obtenerImaginario() + "i" + ")"+ "\n");
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			comprobarGrafico= new Funcion(complejo1, complejo2, resultado);
			if(comprobarGrafico.comprobacion()== true){
				ventana = new Ventana(real,imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}else{
				ventana1 = new Ventana1(real, imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}
			
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			break;

		case 2:
			System.out.print("Escriba la parte real del primer número: ");
			real = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del primer número: ");
			imaginario = consola.nextFloat();
			complejo1 = new Complejo(real, imaginario);
			System.out.print("Escriba la parte real del segundo número: ");
			real1 = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del segundo número: ");
			imaginario1 = consola.nextFloat();
			complejo2 = new Complejo(real1, imaginario1);
			resultado = complejo1.resta(complejo1, complejo2);
			System.out.println( "\n"+"El resultado de la resta es: z=" + "(" + resultado.obtenerReal() + " + "
						+ resultado.obtenerImaginario() + "i" + ")"+ "\n");
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			comprobarGrafico= new Funcion(complejo1, complejo2, resultado);
			if(comprobarGrafico.comprobacion()== true){
				ventana = new Ventana(real,imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}else{
				ventana1 = new Ventana1(real, imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			break;

		case 3:
			System.out.print("Escriba la parte real del primer número: ");
			real = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del primer número ");
			imaginario = consola.nextFloat();
			complejo1 = new Complejo(real, imaginario);
			System.out.print("Escriba la parte real del segundo número:  ");
			real1 = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del segundo número:");
			imaginario1 = consola.nextFloat();
			complejo2 = new Complejo(real1, imaginario1);
			resultado = new Complejo(0,0);
			resultado = resultado.multiplicacion(complejo1, complejo2);
			System.out.println( "\n"+"El resultado de la multipliación es: z=" + "(" + resultado.obtenerReal() + " + "
						+ resultado.obtenerImaginario() + "i" + ")"+ "\n");
	
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			comprobarGrafico= new Funcion(complejo1, complejo2, resultado);
			if(comprobarGrafico.comprobacion()== true){
				ventana = new Ventana(real,imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}else{
				ventana1 = new Ventana1(real, imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			break;

		case 4:
			System.out.print("Escriba la parte real del primer número: ");
			real = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del primer número: ");
			imaginario = consola.nextFloat();
			complejo1 = new Complejo(real, imaginario);
			System.out.print("Escriba la parte real del segundo número: ");
			real1 = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del segundo número: ");
			imaginario1 = consola.nextFloat();
			complejo2 = new Complejo(real1, imaginario1);
			resultado = complejo1.division(complejo2);
				System.out.println( "\n"+"El resultado de la división es: z=" + "(" + formato1.format(resultado.obtenerReal())
						+ " + " + formato1.format(resultado.obtenerImaginario()) + "i" + ")"+ "\n");
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			comprobarGrafico= new Funcion(complejo1, complejo2, resultado);
			if(comprobarGrafico.comprobacion()== true){
				ventana = new Ventana(real,imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}else{
				ventana1 = new Ventana1(real, imaginario, real1, imaginario1, resultado.obtenerReal(), resultado.obtenerImaginario());
			}
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			break;

		case 5:

			Determinante2x2.main();
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			
			break;
			
		case 6:
			
			Determinante3x3.main();
			System.out.println("\n"+ "¿Desea realizar otra operación?"+ "\n");
			valor = segundoMenu();
			if(valor == 2) {
				System.exit(1);
			}
			
			break;
			
		case 7:
			
			System.out.print("Escriba la parte real del número: ");
			real = consola.nextFloat();
			System.out.print("Escriba la parte imaginaria del número: ");
			imaginario = consola.nextFloat();
			System.out.println("\n");
			complejo1 = new Complejo(real,imaginario);
			Complejo vacio = new Complejo(0,0);
			comprobarGrafico= new Funcion(complejo1, vacio, vacio);
			if(comprobarGrafico.comprobacion()== true){
				ventana = new Ventana(real,imaginario,0,0,0,0);
			}else{
				ventana1 = new Ventana1(real, imaginario, 0, 0, 0, 0);
			}		
			break;
			
		
		case 8:
			System.out.println("Programa finalizado");
			
			break;
			
		
		default:
			System.out.println("El numero ingresado no corresponde a ninguna de las opciones" + "\n");
			
		}
		
		}while(opcion!=8);
	}
}



