package Graficador1;
import javax.swing.JFrame;

public class Ventana1 extends JFrame{
	static Resolucion1 monitor = new Resolucion1();
	public static final int ANCHO = 1366;
	public static final int ALTO = 768;
	private PanelDibujo1 pd;
	
	//c1 = coordenada
	
	public Ventana1(double c1, double c2,double c3, double c4, double c5, double c6){
		this.configuracionVentana();
		PanelDibujo1 pd = new PanelDibujo1(c1,c2,c3,c4,c5,c6);
		super.add(pd);
	
	}
	
	public void configuracionVentana(){
		super.setTitle("Gráfico");
		super.setSize(Ventana1.ANCHO, Ventana1.ALTO);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setAlwaysOnTop(false);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
			 
	}
	
}
