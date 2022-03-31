package Ejercicio17;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio11_incompleto extends JFrame{
	Container panel; 
	public JButton anadir ;
	public JFileChooser recuadro;
	
	public Ejercicio11_incompleto() {
		super("Lista Alumnos");
		panel=getContentPane();
		panel.setLayout((null));

		
		anadir = new JButton("Rojo:");
		anadir.setBounds(20, 20, 60, 20);
		panel.add(anadir);
		
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	

	public static void main(String[] args) {
		Ejercicio11_incompleto ventana= new Ejercicio11_incompleto(); 

	}

}
