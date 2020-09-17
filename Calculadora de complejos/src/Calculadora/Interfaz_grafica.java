package Calculadora;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JComboBox;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import Graficador.Ventana;
import Graficador1.Ventana1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Interfaz_grafica {

	private JFrame frmMen;
	private JLabel label;
	private static Scanner consola = new Scanner(System.in);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JCheckBox check;

	public static void main(String[] args) {
		Interfaz_grafica window = new Interfaz_grafica();
		window.frmMen.setVisible(true);
	}

	public Interfaz_grafica() {
		initialize();
	}

	@SuppressWarnings("unchecked")
	private void initialize() {

		frmMen = new JFrame();
		frmMen.setTitle("Men\u00FA");
		frmMen.setBounds(100, 100, 752, 437);
		frmMen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMen.getContentPane().setLayout(null);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		comboBox.setBounds(305, 52, 175, 100);
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Suma", "Resta", "Multiplicación", "División",
						"Determinante 2x2", "Determinante 3x3",
						"Graficar un complejo" }));
		frmMen.getContentPane().add(comboBox);

		label = new JLabel("Elija la operaci\u00F3n que desee realizar:");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(222, 11, 330, 30);
		frmMen.getContentPane().add(label);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Complejo complejo1, complejo2, resultado;
				DecimalFormat formato1 = new DecimalFormat("0.00");
				float real, imaginario, real1, imaginario1;
				String numero0, numero1, numero2, numero3;
				Ventana ventana;
				Ventana1 ventana1;
				Funcion comprobarGrafico;

				int index = (comboBox.getSelectedIndex()) + 1;

				switch (index) {

				case 1:
					numero0 = textField.getText();
					real = Float.parseFloat(numero0);
					numero1 = textField_1.getText();
					imaginario = Float.parseFloat(numero1);
					complejo1 = new Complejo(real, imaginario);

					numero2 = textField_2.getText();
					real1 = Float.parseFloat(numero2);
					numero3 = textField_3.getText();
					imaginario1 = Float.parseFloat(numero3);
					complejo2 = new Complejo(real1, imaginario1);

					resultado = complejo1.suma(complejo2);

					label.setText(("z=" + "(" + (resultado.obtenerReal())
							+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));

					if (check.isSelected()) {
						comprobarGrafico = new Funcion(complejo1, complejo2,
								resultado);
						if (comprobarGrafico.comprobacion() == true) {
							ventana = new Ventana(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						} else {
							ventana1 = new Ventana1(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						}
					}
					break;

				case 2:

					numero0 = textField.getText();
					real = Float.parseFloat(numero0);
					numero1 = textField_1.getText();
					imaginario = Float.parseFloat(numero1);
					complejo1 = new Complejo(real, imaginario);

					numero2 = textField_2.getText();
					real1 = Float.parseFloat(numero2);
					numero3 = textField_3.getText();
					imaginario1 = Float.parseFloat(numero3);
					complejo2 = new Complejo(real1, imaginario1);

					resultado = complejo1.resta(complejo1, complejo2);

					label.setText(("z=" + "(" + (resultado.obtenerReal())
							+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));

					if (check.isSelected()) {
						comprobarGrafico = new Funcion(complejo1, complejo2,
								resultado);
						if (comprobarGrafico.comprobacion() == true) {
							ventana = new Ventana(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						} else {
							ventana1 = new Ventana1(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						}
					}
					break;

				case 3:
					numero0 = textField.getText();
					real = Float.parseFloat(numero0);
					numero1 = textField_1.getText();
					imaginario = Float.parseFloat(numero1);
					complejo1 = new Complejo(real, imaginario);

					numero2 = textField_2.getText();
					real1 = Float.parseFloat(numero2);
					numero3 = textField_3.getText();
					imaginario1 = Float.parseFloat(numero3);
					complejo2 = new Complejo(real1, imaginario1);

					resultado = complejo1.multiplicacion(complejo1, complejo2);

					label.setText(("z=" + "(" + (resultado.obtenerReal())
							+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));
					if (check.isSelected()) {
						comprobarGrafico = new Funcion(complejo1, complejo2,
								resultado);
						if (comprobarGrafico.comprobacion() == true) {
							ventana = new Ventana(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						} else {
							ventana1 = new Ventana1(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						}
					}
					break;

				case 4:
					numero0 = textField.getText();
					real = Float.parseFloat(numero0);
					numero1 = textField_1.getText();
					imaginario = Float.parseFloat(numero1);
					complejo1 = new Complejo(real, imaginario);

					numero2 = textField_2.getText();
					real1 = Float.parseFloat(numero2);
					numero3 = textField_3.getText();
					imaginario1 = Float.parseFloat(numero3);
					complejo2 = new Complejo(real1, imaginario1);

					resultado = complejo1.division(complejo2);

					label.setText(("z=" + "(" + (resultado.obtenerReal())
							+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));

					if (check.isSelected()) {
						comprobarGrafico = new Funcion(complejo1, complejo2,
								resultado);
						if (comprobarGrafico.comprobacion() == true) {
							ventana = new Ventana(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						} else {
							ventana1 = new Ventana1(real, imaginario, real1,
									imaginario1, resultado.obtenerReal(),
									resultado.obtenerImaginario());
						}
					}
					break;
				case 5:

					Determinante2x2.main();
					break;

				case 6:

					Determinante3x3.main();
					break;

				case 7:

					numero0 = textField.getText();
					real = Float.parseFloat(numero0);
					numero1 = textField_1.getText();
					imaginario = Float.parseFloat(numero1);
					complejo1 = new Complejo(real, imaginario);
					Complejo vacio = new Complejo(0, 0);
					if (check.isSelected()) {
						comprobarGrafico = new Funcion(complejo1, vacio, vacio);
						if (comprobarGrafico.comprobacion() == true) {
							ventana = new Ventana(real, imaginario, 0, 0, 0, 0);
						} else {
							ventana1 = new Ventana1(real, imaginario, 0, 0, 0,
									0);
						}
					}
					break;

				case 8:
					System.out.println("Programa finalizado");

					break;

				default:
					System.out
							.println("El numero ingresado no corresponde a ninguna de las opciones"
									+ "\n");

				}
			}
		});
		btnEnviar.setBounds(305, 351, 140, 40);
		frmMen.getContentPane().add(btnEnviar);

		JLabel lblIngreseLosCoeficientes = new JLabel(
				"Ingrese los coeficientes en los recuadros siguientes para realizar la operaci\u00F3n y marque la tilde en caso de querer graficar.");
		lblIngreseLosCoeficientes.setBounds(10, 163, 700, 14);
		frmMen.getContentPane().add(lblIngreseLosCoeficientes);

		textField = new JTextField();
		textField.setBounds(290, 246, 86, 20);
		frmMen.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(442, 246, 86, 20);
		frmMen.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(107, 326, 80, 14);
		frmMen.getContentPane().add(lblResultado);

		label = new JLabel("");
		label.setBounds(219, 326, 200, 14);
		frmMen.getContentPane().add(label);

		textField_2 = new JTextField();
		textField_2.setBounds(290, 277, 86, 20);
		frmMen.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(442, 277, 86, 20);
		frmMen.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNotaSiLa = new JLabel(
				"NOTA: si la operaci\u00F3n escogida es determinantes: solo pulse el bot\u00F3n Enviar sin rellenar y si es para graficar un complejo solo rellene los 2");
		lblNotaSiLa.setBounds(10, 188, 725, 14);
		frmMen.getContentPane().add(lblNotaSiLa);

		JLabel label_1 = new JLabel("+");
		label_1.setBounds(400, 249, 14, 14);
		frmMen.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("+");
		label_2.setBounds(400, 280, 14, 14);
		frmMen.getContentPane().add(label_2);

		JLabel lblI = new JLabel("i");
		lblI.setBounds(538, 249, 14, 14);
		frmMen.getContentPane().add(lblI);

		JLabel label_3 = new JLabel("i");
		label_3.setBounds(538, 280, 14, 14);
		frmMen.getContentPane().add(label_3);

		JLabel lblPrimerNumero = new JLabel("Primer n\u00FAmero");
		lblPrimerNumero.setBounds(120, 249, 150, 14);
		frmMen.getContentPane().add(lblPrimerNumero);

		JLabel lblSegundoNmero = new JLabel("Segundo n\u00FAmero");
		lblSegundoNmero.setBounds(120, 280, 150, 14);
		frmMen.getContentPane().add(lblSegundoNmero);

		JLabel lblParteReal = new JLabel("Parte real");
		lblParteReal.setBounds(290, 231, 60, 14);
		frmMen.getContentPane().add(lblParteReal);

		JLabel lblParteImaginaria = new JLabel("Parte imaginaria");
		lblParteImaginaria.setBounds(442, 231, 150, 14);
		frmMen.getContentPane().add(lblParteImaginaria);

		JLabel lblLosPrimeros = new JLabel(
				"rellene los 2 primeros cuadros horizontales.");
		lblLosPrimeros.setBounds(10, 206, 280, 14);
		frmMen.getContentPane().add(lblLosPrimeros);

		check = new JCheckBox("Gr\u00E1fico");
		check.setFont(new Font("Tahoma", Font.PLAIN, 15));
		check.setBounds(598, 245, 97, 50);
		frmMen.getContentPane().add(check);

	}
}
