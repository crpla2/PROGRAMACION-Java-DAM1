package Ejercicio17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio03 extends JFrame {

	Container panel;
	public JButton botonSumar;
	public JButton botonRestar;
	public JTextField Num1, Num2, calculo;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio03() {
		super("Sumar y restar reales");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Num1");
		etiqueta2 = new JLabel("Num2");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		Num1 = new JTextField(5);
		Num1.setBounds(50, 20, 45, 20);
		panel.add(Num1);
		Num2 = new JTextField(6);
		Num2.setBounds(50, 50, 45, 20);
		panel.add(Num2);
		
		botonSumar = new JButton("+");
		botonSumar.setBounds(40, 90, 45, 20);
		panel.add(botonSumar);
		
		botonRestar = new JButton("-");
		botonRestar.setBounds(90, 90, 45, 20);
		panel.add(botonRestar);
		
		calculo = new JTextField(6);
		calculo.setBounds(150, 90, 45, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonSumar.addActionListener(new OyenteBoton());
		botonRestar.addActionListener(new OyenteBoton());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Ejercicio03 ventana = new Ejercicio03();
	}
	public static boolean esNumeroReal(String c) {
		try {
			Double.parseDouble(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	class OyenteBoton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Double resultado = null;
			
			
			if(e.getSource()==botonSumar) {
				if(!esNumeroReal(Num1.getText())) {
				 JOptionPane.showMessageDialog(null,"no has introducido un número real");
				}
				else
					resultado = Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText());
				}
			else {
				if(!esNumeroReal(Num2.getText()))
				  JOptionPane.showMessageDialog(null,"no has introducido un número real");
				else
					resultado = Double.parseDouble(Num1.getText()) - Double.parseDouble(Num2.getText());
				}
			
			resultado = Math.rint(resultado * 100) / 100;
			calculo.setText(resultado.toString());
			}
		}

}


