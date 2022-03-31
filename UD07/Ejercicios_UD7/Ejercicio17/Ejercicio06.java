package Ejercicio17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio06 extends JFrame {

	private Container panel;
	private JComboBox combo1, combo2, combo3;
	private JLabel rojo, verde, azul;
	private JButton color;

	public Ejercicio06() {
		super("Practicando con combos");
		panel = getContentPane();
		panel.setLayout((null));

		rojo = new JLabel("Rojo:");
		rojo.setBounds(10, 20, 60, 20);
		panel.add(rojo);

		verde = new JLabel("Verde:");
		verde.setBounds(10, 60, 60, 20);
		panel.add(verde);

		azul = new JLabel("Azul:");
		azul.setBounds(10, 100, 60, 20);
		panel.add(azul);

		combo1 = new JComboBox(); // para el rojo
		combo1.setBounds(120, 10, 50, 30);
		panel.add(combo1);

		combo2 = new JComboBox(); // para el verde
		combo2.setBounds(120, 50, 50, 30);
		panel.add(combo2);

		combo3 = new JComboBox(); // para el azul
		combo3.setBounds(120, 90, 50, 30);
		panel.add(combo3);

		color = new JButton("Color de fondo");
		color.setBounds(10, 130, 120, 20);
		panel.add(color);

		for (Integer i = 0; i < 256; i++) {
			combo1.addItem(i);
			combo2.addItem(i);
			combo3.addItem(i);
		}

		color.addActionListener(new OyenteBoton());
		setSize(350, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class OyenteBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int red=(int) combo1.getSelectedItem();
			int blue=(int) combo2.getSelectedItem();
			int green=(int) combo3.getSelectedItem();
			
			Color c1= new Color(red,blue,green);
			panel.setBackground(c1);
			
			
		}
	}

	public static void main(String[] args) {
		Ejercicio06 ventana = new Ejercicio06();

	}

}
