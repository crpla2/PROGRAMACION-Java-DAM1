package Ejercicio17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio10 extends JFrame {

	Container panel;
	
	public JMenuBar menu;
	public JMenuItem botonSumar, botonMultiplicar, botonDividir,
					 botonRestar, exit, about;
	public JMenu oper, apli;
	public JTextField Num1, Num2, calculo;
	JLabel Dato1, Dato2, Resultado, ImgCalculadora;

	public Ejercicio10() {
		super("Calculadora");
		panel = getContentPane();
		panel.setLayout((null));
		Dato1 = new JLabel("Dato 1:");
		Dato2 = new JLabel("Dato 2:");
		Resultado = new JLabel("Resultado:");
		ImgCalculadora = new JLabel("");
		ImgCalculadora.setBounds(102, 2, 200, 80);
		
		menu= new JMenuBar();
		setJMenuBar(menu);
		
		oper= new JMenu("Operaciones");
		menu.add(oper);
		apli= new JMenu("Aplicación");
		menu.add(apli);
		
		botonSumar =new JMenuItem("Sumar");
		oper.add(botonSumar);
		botonRestar =new JMenuItem("Restar");
		oper.add(botonRestar);
		botonMultiplicar =new JMenuItem("Multiplicar");
		oper.add(botonMultiplicar);
		botonDividir =new JMenuItem("Dividir");
		oper.add(botonDividir);
		
		exit= new JMenuItem("Salir");
		apli.add(exit);
		about= new JMenuItem("Abour");
		apli.add(about);
		
		
		ImageIcon iconoCalculadora = new ImageIcon("07_04_Ud7/imagenes/calculadora.jpg");
		ImgCalculadora.setIcon(iconoCalculadora);
		add(ImgCalculadora);
		
		Dato1.setBounds(10, 120, 60, 20);
		panel.add(Dato1);
		
		Dato2.setBounds(10, 150, 60, 20);
		panel.add(Dato2);
		
		Resultado.setBounds(10, 180, 60, 20);
		panel.add(Resultado);
		
		Num1 = new JTextField(5);
		Num1.setBounds(102, 120, 80, 20);
		panel.add(Num1);
		
		Num2 = new JTextField(6);
		Num2.setBounds(102, 150, 80, 20);
		panel.add(Num2);

		calculo = new JTextField(6);
		calculo.setBounds(102, 180, 80, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		
		botonSumar.addActionListener(new OyenteBoton());
		botonRestar.addActionListener(new OyenteBoton());
		botonMultiplicar.addActionListener(new OyenteBoton());
		botonDividir.addActionListener(new OyenteBoton());
		
		exit.addActionListener(new OyenteBoton());
		about.addActionListener(new OyenteBoton());
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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

			if (e.getSource() == botonSumar) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(panel, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonRestar) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(panel, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) - Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonMultiplicar) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(panel, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) * Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonDividir) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(panel, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) / Double.parseDouble(Num2.getText());
				}
			}if (e.getSource() == exit) {
				 System.exit(0);
			}if (e.getSource() == about) {
				JOptionPane.showMessageDialog(panel, "Programa realizado por Carlos Rodrigo Pla", "Créditos", JOptionPane.INFORMATION_MESSAGE);
			}

			try {
				resultado = Math.rint(resultado * 100) / 100;
				calculo.setText(resultado.toString());
			} catch (NullPointerException e1) {
			}
		}
	}

	public static void main(String args[]) {
		Ejercicio10 ventana = new Ejercicio10();
	}

}
