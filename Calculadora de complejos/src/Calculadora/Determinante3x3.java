package Calculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Determinante3x3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9,textField_10,textField_11,textField_12,textField_13,textField_14,textField_15,textField_16,textField_17;
	private JLabel label_1,lblImaginario,label_2,label_3,label_4,label_5,label_6,label_7,label_8,label_9,label_10,label_11,label_12,label_13,label_14,label_15,label_16,label_17,label_18,label_19,label_20,label_21,label_22,lblResultado,lblI;
	

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Determinante3x3 frame = new Determinante3x3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Determinante3x3() {
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElDeterminante = new JLabel("Ingrese el determinante que desea calcular");
		lblIngreseElDeterminante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIngreseElDeterminante.setBounds(270, 11, 361, 22);
		contentPane.add(lblIngreseElDeterminante);
		
		textField = new JTextField();
		textField.setBounds(61, 67, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 105, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(61, 145, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(176, 67, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(176, 105, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(176, 145, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(321, 67, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(321, 105, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(321, 145, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(439, 67, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(439, 105, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(439, 145, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(593, 67, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(593, 105, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(593, 145, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(714, 67, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(714, 105, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(714, 145, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblReal = new JLabel("Real");
		lblReal.setBounds(61, 42, 46, 14);
		contentPane.add(lblReal);
		
		JLabel label = new JLabel("Real");
		label.setBounds(321, 44, 46, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("Real");
		label_1.setBounds(593, 44, 46, 14);
		contentPane.add(label_1);
		
		lblImaginario = new JLabel("Imaginario");
		lblImaginario.setBounds(176, 42, 65, 14);
		contentPane.add(lblImaginario);
		
		label_2 = new JLabel("Imaginario");
		label_2.setBounds(439, 44, 65, 14);
		contentPane.add(label_2);
		
		label_3 = new JLabel("Imaginario");
		label_3.setBounds(714, 42, 65, 14);
		contentPane.add(label_3);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(76, 233, 71, 14);
		contentPane.add(lblResultado);
		
		label_4 = new JLabel("");
		label_4.setBounds(157, 233, 275, 14);
		contentPane.add(label_4);
		
		label_5 = new JLabel("+");
		label_5.setBounds(155, 70, 15, 14);
		contentPane.add(label_5);
		
		label_6 = new JLabel("+");
		label_6.setBounds(157, 108, 15, 14);
		contentPane.add(label_6);
		
		label_7 = new JLabel("+");
		label_7.setBounds(157, 148, 15, 14);
		contentPane.add(label_7);
		
		label_9 = new JLabel("+");
		label_9.setBounds(417, 108, 15, 14);
		contentPane.add(label_9);
		
		label_8 = new JLabel("+");
		label_8.setBounds(417, 70, 15, 14);
		contentPane.add(label_8);
		
		label_10 = new JLabel("+");
		label_10.setBounds(417, 148, 15, 14);
		contentPane.add(label_10);
		
		label_11 = new JLabel("+");
		label_11.setBounds(689, 70, 15, 14);
		contentPane.add(label_11);
		
		label_12 = new JLabel("+");
		label_12.setBounds(689, 108, 15, 14);
		contentPane.add(label_12);
		
		label_13 = new JLabel("+");
		label_13.setBounds(689, 148, 15, 14);
		contentPane.add(label_13);
		
		lblI = new JLabel("i");
		lblI.setBounds(268, 70, 26, 14);
		contentPane.add(lblI);
		
		label_14 = new JLabel("i");
		label_14.setBounds(270, 108, 26, 14);
		contentPane.add(label_14);
		
		label_15 = new JLabel("i");
		label_15.setBounds(270, 148, 26, 14);
		contentPane.add(label_15);
		
		label_16 = new JLabel("i");
		label_16.setBounds(535, 70, 26, 14);
		contentPane.add(label_16);
		
		label_17 = new JLabel("i");
		label_17.setBounds(535, 108, 26, 14);
		contentPane.add(label_17);
		
		label_18 = new JLabel("i");
		label_18.setBounds(535, 148, 26, 14);
		contentPane.add(label_18);
		
		label_19 = new JLabel("i");
		label_19.setBounds(812, 70, 26, 14);
		contentPane.add(label_19);
		
		label_20 = new JLabel("i");
		label_20.setBounds(810, 108, 26, 14);
		contentPane.add(label_20);
		
		label_21 = new JLabel("i");
		label_21.setBounds(810, 148, 26, 14);
		contentPane.add(label_21);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String numero0= textField.getText(); //primer cuadro
				float parteReal0 = Float.parseFloat(numero0);	
				String numero1 = textField_3.getText();
				float parteImaginaria0 = Float.parseFloat(numero1);
				
				String numero2 = textField_1.getText(); //segundo cuadro
				float parteReal1 = Float.parseFloat(numero2);
				String numero3 = textField_4.getText();
				float parteImaginaria1 = Float.parseFloat(numero3);
				
				String numero4 = textField_2.getText(); //tercer cuadro
				float parteReal2 = Float.parseFloat(numero4);
				String numero5 = textField_5.getText();
				float parteImaginaria2 = Float.parseFloat(numero5);
				
				String numero6 = textField_6.getText(); //cuarto cuadro
				float parteReal3 = Float.parseFloat(numero6);
				String numero7 = textField_9.getText();
				float parteImaginaria3 = Float.parseFloat(numero7);
				
				String numero8 = textField_7.getText(); //quinto cuadro
				float parteReal4 = Float.parseFloat(numero8);
				String numero9 = textField_10.getText();
				float parteImaginaria4 = Float.parseFloat(numero9);
				
				String numero10 = textField_8.getText(); //sexto cuadro
				float parteReal5 = Float.parseFloat(numero10);
				String numero11 = textField_11.getText();
				float parteImaginaria5 = Float.parseFloat(numero11);
				
				String numero12 = textField_12.getText(); //septimo cuadro
				float parteReal6 = Float.parseFloat(numero12);
				String numero13 = textField_15.getText();
				float parteImaginaria6 = Float.parseFloat(numero13);
				
				String numero14 = textField_13.getText(); //octavo cuadro
				float parteReal7 = Float.parseFloat(numero14);
				String numero15 = textField_16.getText();
				float parteImaginaria7 = Float.parseFloat(numero15);
				
				String numero16 = textField_14.getText(); //noveno cuadro
				float parteReal8 = Float.parseFloat(numero16);
				String numero17 = textField_17.getText();
				float parteImaginaria8 = Float.parseFloat(numero17);
				
				Complejo A,B,C,D,E,F,G,H,I,resultado;
				
				resultado = new Complejo(0,0);
				
				A = new Complejo(parteReal0, parteImaginaria0);
				B = new Complejo(parteReal1, parteImaginaria1);
				C = new Complejo(parteReal2, parteImaginaria2);
				D= 	new Complejo(parteReal3, parteImaginaria3);
				E= 	new Complejo(parteReal4, parteImaginaria4);
				F= 	new Complejo(parteReal5, parteImaginaria5);
				G= 	new Complejo(parteReal6, parteImaginaria6);
				H= 	new Complejo(parteReal7, parteImaginaria7);
				I= 	new Complejo(parteReal8, parteImaginaria8);
				resultado = resultado.determinante3x3(A, D, G, B, E, H, C, F, I);
				//System.out.println("resultado"+resultado.obtenerReal());
				label_4.setText(("z=" + "(" + (resultado.obtenerReal())+ " + " + (resultado.obtenerImaginario()) + "i" + ")"));
			}
		});
		btnEnviar.setBounds(382, 191, 89, 23);
		contentPane.add(btnEnviar);
	}
}
