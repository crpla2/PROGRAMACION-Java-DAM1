package Examen1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pregunta1 extends JFrame {
	Container panel;
	JButton btnComprobar;
	JTextField txtExpresion;
	JLabel lbl1;

	public Pregunta1() {

		panel = getContentPane();
		panel.setLayout((null));
		lbl1 = new JLabel("Expresión");

		lbl1.setBounds(50, 20, 60, 20);
		panel.add(lbl1);

		txtExpresion = new JTextField(5);
		txtExpresion.setBounds(120, 20, 90, 20);
		panel.add(txtExpresion);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(110, 60, 110, 20);
		panel.add(btnComprobar);
		btnComprobar.addActionListener(new OyenteBoton());
		setSize(320, 150);
		setTitle("Validador Binario");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Pregunta1 ventana = new Pregunta1();

	}

//	class OyenteBoton implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			String exp = txtExpresion.getText();
//			if (e.getSource() == btnComprobar) {
//				if (exp.matches("[0-1]{8}")) {
//					JOptionPane.showMessageDialog(panel, exp + " es un número binario de 8 bits", "resultado",
//							JOptionPane.INFORMATION_MESSAGE);
//				} else {
//					JOptionPane.showMessageDialog(panel, exp + " no es un número binario de 8 bits", "resultado",
//							JOptionPane.INFORMATION_MESSAGE);
//				}
//			}
//
//		}
//	}
	//solucion Albreto
	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
					
				if (txtExpresion.getText().matches("[0|1]{8}")) {
					JOptionPane.showMessageDialog(panel, txtExpresion.getText() + " es un número binario de 8 bits", "resultado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(panel, txtExpresion.getText() + " no es un número binario de 8 bits", "resultado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}

		}
	
}
