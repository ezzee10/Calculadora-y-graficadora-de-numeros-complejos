package Calculadora;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Graficador.Ventana;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Determinante2x2 {

	private JFrame frmDeterminantex;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblIngreseElDeterminante;
	private JLabel lblReal;
	private JLabel lblReal_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnEnviar;
	private JLabel lblImaginario;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel lblI;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel lblResultado;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_13;
	private Determinante2x2 window;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Determinante2x2 window = new Determinante2x2();
					window.frmDeterminantex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
	}

	
	/**
	 * Create the application.
	 */
	public Determinante2x2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeterminantex = new JFrame();
		frmDeterminantex.setResizable(false);
		frmDeterminantex.setAlwaysOnTop(true);
		frmDeterminantex.setTitle("Determinante 2x2");
		frmDeterminantex.setBounds(100, 100, 441, 296);
		frmDeterminantex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeterminantex.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(49, 61, 53, 20);
		frmDeterminantex.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 61, 53, 20);
		frmDeterminantex.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(49, 109, 53, 20);
		frmDeterminantex.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 109, 53, 20);
		frmDeterminantex.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(230, 61, 53, 20);
		frmDeterminantex.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(310, 61, 53, 20);
		frmDeterminantex.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(230, 109, 53, 20);
		frmDeterminantex.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(310, 109, 53, 20);
		frmDeterminantex.getContentPane().add(textField_7);
		
		lblIngreseElDeterminante = new JLabel("Ingrese el determinante que desea calcular");
		lblIngreseElDeterminante.setBounds(110, 11, 280, 14);
		frmDeterminantex.getContentPane().add(lblIngreseElDeterminante);
		
		lblReal = new JLabel("Real");
		lblReal.setBounds(57, 48, 7, 2);
		frmDeterminantex.getContentPane().add(lblReal);
		
		lblReal_1 = new JLabel("Real");
		lblReal_1.setBounds(49, 42, 46, 14);
		frmDeterminantex.getContentPane().add(lblReal_1);
		
		label = new JLabel("Real");
		label.setBounds(49, 132, 46, 14);
		frmDeterminantex.getContentPane().add(label);
		
		label_1 = new JLabel("Real");
		label_1.setBounds(230, 132, 46, 14);
		frmDeterminantex.getContentPane().add(label_1);
		
		label_2 = new JLabel("Real");
		label_2.setBounds(230, 42, 46, 14);
		frmDeterminantex.getContentPane().add(label_2);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ventana ventana;
				String numero0= textField.getText(); //primer cuadro
				float parteReal0 = Float.parseFloat(numero0);	
				String numero1 = textField_1.getText();
				float parteImaginaria0 = Float.parseFloat(numero1);
				
				String numero2 = textField_2.getText(); //segundo cuadro
				float parteReal1 = Float.parseFloat(numero2);
				String numero3 = textField_3.getText();
				float parteImaginaria1 = Float.parseFloat(numero3);
				
				String numero4 = textField_4.getText(); //tercer cuadro
				float parteReal2 = Float.parseFloat(numero4);
				String numero5 = textField_5.getText();
				float parteImaginaria2 = Float.parseFloat(numero5);
				
				String numero6 = textField_6.getText(); //cuarto cuadro
				float parteReal3 = Float.parseFloat(numero6);
				String numero7 = textField_7.getText();
				float parteImaginaria3 = Float.parseFloat(numero7);
				
				Complejo A,B,C,D,resultado;
				
				A = new Complejo(parteReal0, parteImaginaria0);
				B = new Complejo(parteReal1, parteImaginaria1);
				C = new Complejo(parteReal2, parteImaginaria2);
				D= 	new Complejo(parteReal3, parteImaginaria3);
				resultado = new Complejo(0,0);
				resultado = resultado.determinante2x2(A, B, C, D);
				label_19.setText(("z=" + "(" + (resultado.obtenerReal())
						+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));
			}
		});
		
		btnEnviar.setBounds(165, 173, 89, 23);
		frmDeterminantex.getContentPane().add(btnEnviar);
		
		lblImaginario = new JLabel("Imaginario");
		lblImaginario.setBounds(123, 42, 67, 14);
		frmDeterminantex.getContentPane().add(lblImaginario);
		
		label_3 = new JLabel("Imaginario");
		label_3.setBounds(123, 132, 67, 14);
		frmDeterminantex.getContentPane().add(label_3);
		
		label_4 = new JLabel("Imaginario");
		label_4.setBounds(310, 132, 67, 14);
		frmDeterminantex.getContentPane().add(label_4);
		
		label_5 = new JLabel("Imaginario");
		label_5.setBounds(310, 42, 67, 14);
		frmDeterminantex.getContentPane().add(label_5);
		
		label_6 = new JLabel("+");
		label_6.setBounds(106, 64, 17, 14);
		frmDeterminantex.getContentPane().add(label_6);
		
		label_7 = new JLabel("+");
		label_7.setBounds(106, 112, 17, 14);
		frmDeterminantex.getContentPane().add(label_7);
		
		label_8 = new JLabel("+");
		label_8.setBounds(290, 64, 17, 14);
		frmDeterminantex.getContentPane().add(label_8);
		
		label_9 = new JLabel("+");
		label_9.setBounds(290, 112, 17, 14);
		frmDeterminantex.getContentPane().add(label_9);
		
		lblI = new JLabel("i");
		lblI.setBounds(180, 64, 7, 14);
		frmDeterminantex.getContentPane().add(lblI);
		
		label_10 = new JLabel("i");
		label_10.setBounds(180, 112, 17, 14);
		frmDeterminantex.getContentPane().add(label_10);
		
		label_11 = new JLabel("i");
		label_11.setBounds(370, 64, 7, 14);
		frmDeterminantex.getContentPane().add(label_11);
		
		label_12 = new JLabel("i");
		label_12.setBounds(370, 112, 7, 14);
		frmDeterminantex.getContentPane().add(label_12);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(57, 226, 73, 14);
		frmDeterminantex.getContentPane().add(lblResultado);
		
		label_19 = new JLabel("");
		label_19.setBounds(157, 226, 127, 14);
		frmDeterminantex.getContentPane().add(label_19);
		
		label_20 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/barra.png")).getImage();
		label_20.setIcon(new ImageIcon(img));
		label_20.setBounds(18, 48, 21, 87);
		frmDeterminantex.getContentPane().add(label_20);
		
		label_21 = new JLabel("");
		label_21.setBounds(23, 64, 17, 14);
		frmDeterminantex.getContentPane().add(label_21);
		
		label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(img));
		label_13.setBounds(390, 48, 21, 87);
		frmDeterminantex.getContentPane().add(label_13);
	}
}
