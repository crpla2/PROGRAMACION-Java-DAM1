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

public class Ejercicio04 extends JFrame {
	Container panel;
	public JButton botonValidar;
	
	public JTextField Usuario, Contraseña;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio04() {
		super("Sumar y restar reales");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Usuario");
		etiqueta2 = new JLabel("Contraseña");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		Usuario = new JTextField(5);
		Usuario.setBounds(50, 20, 45, 20);
		panel.add(Usuario);
		Contraseña = new JTextField(6);
		Contraseña.setBounds(50, 50, 45, 20);
		panel.add(Contraseña);

		botonValidar = new JButton("+");
		botonValidar.setBounds(40, 90, 45, 20);
		panel.add(botonValidar);

		botonRestar = new JButton("-");
		botonRestar.setBounds(90, 90, 45, 20);
		panel.add(botonRestar);

		calculo = new JTextField(6);
		calculo.setBounds(150, 90, 45, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonValidar.addActionListener(new OyenteBoton());
		botonRestar.addActionListener(new OyenteBoton());

		setSize(300, 200);
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

			if (e.getSource() == botonValidar) {
				if ((!esNumeroReal(Usuario.getText())) || (!esNumeroReal(Contraseña.getText()))) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Usuario.getText()) + Double.parseDouble(Contraseña.getText());
				}
			} else {
				if ((!esNumeroReal(Usuario.getText())) || (!esNumeroReal(Contraseña.getText()))) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores introducidos no es un número real.\n"
							+ "Por favor corrijalo y vuelva a intentarlo", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = Double.parseDouble(Usuario.getText()) - Double.parseDouble(Contraseña.getText());
				}
			}
			try {
				resultado = Math.rint(resultado * 100) / 100;
				calculo.setText(resultado.toString());
			} catch (NullPointerException e1) {
			}
		}
	}

	public static void main(String args[]) {
		Ejercicio03 ventana = new Ejercicio03();
	}

}
