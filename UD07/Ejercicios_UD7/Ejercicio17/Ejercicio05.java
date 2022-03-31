package Ejercicio17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio05 extends JFrame {

	Container panel;
	public JButton botonSumar, botonMultiplicar, botonDividir, botonRestar, exit, creditos;

	public JTextField Num1, Num2, calculo;
	JLabel Dato1, Dato2, Resultado, ImgCalculadora;

	public Ejercicio05() {
		super("Calculadora");
		panel = getContentPane();
		panel.setLayout((null));
		
		Dato1 = new JLabel("Dato 1:");
		Dato1.setBounds(10, 120, 60, 20);
		panel.add(Dato1);
		
		Dato2 = new JLabel("Dato 2:");
		Dato2.setBounds(10, 150, 60, 20);
		panel.add(Dato2);
		
		Resultado = new JLabel("Resultado:");
		Resultado.setBounds(10, 180, 60, 20);
		panel.add(Resultado);
		
		ImgCalculadora = new JLabel("");
		ImgCalculadora.setBounds(102, 2, 200, 80);
		ImageIcon iconoCalculadora = new ImageIcon("07_04_Ud7/imagenes/calculadora.jpg");
		ImgCalculadora.setIcon(iconoCalculadora);
		add(ImgCalculadora);	
		
		Num1 = new JTextField(5);
		Num1.setBounds(102, 120, 80, 20);
		panel.add(Num1);
		
		Num2 = new JTextField(6);
		Num2.setBounds(102, 150, 80, 20);
		panel.add(Num2);

		botonSumar = new JButton("+");
		botonSumar.setBounds(200, 120, 45, 20);
		panel.add(botonSumar);

		botonRestar = new JButton("-");
		botonRestar.setBounds(200, 150, 45, 20);
		panel.add(botonRestar);

		botonMultiplicar = new JButton("X");
		botonMultiplicar.setBounds(200, 180, 45, 20);
		panel.add(botonMultiplicar);

		botonDividir = new JButton("/");
		botonDividir.setBounds(200, 210, 45, 20);
		panel.add(botonDividir);

		exit = new JButton("");
		exit.setBounds(102, 210, 45, 45);
		panel.add(exit);
		ImageIcon iconoExit = new ImageIcon("07_04_Ud7/imagenes/puerta.jpg");
		exit.setIcon(iconoExit);

		creditos = new JButton("");
		creditos.setBounds(102, 260, 45, 45);
		panel.add(creditos);
		ImageIcon iconoCreditos = new ImageIcon("07_04_Ud7/imagenes/hombre.png");
		creditos.setIcon(iconoCreditos);

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
		creditos.addActionListener(new OyenteBoton());

		setSize(380, 400);
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
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonRestar) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) - Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonMultiplicar) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) * Double.parseDouble(Num2.getText());
				}
			}
			if (e.getSource() == botonDividir) {
				if ((!esNumeroReal(Num1.getText())) || (!esNumeroReal(Num2.getText()))) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Num1.getText()) / Double.parseDouble(Num2.getText());
				}
			}if (e.getSource() == exit) {
				 System.exit(0);
			}if (e.getSource() == creditos) {
				JOptionPane.showMessageDialog(null, "Programa realizado por Carlos Rodrigo Pla", "Créditos", JOptionPane.INFORMATION_MESSAGE);
			}

			try {
				resultado = Math.rint(resultado * 100) / 100;
				calculo.setText(resultado.toString());
			} catch (NullPointerException e1) {
			}
		}
	}

	public static void main(String args[]) {
		Ejercicio05 ventana = new Ejercicio05();
	}

}
