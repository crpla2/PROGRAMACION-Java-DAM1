
package Ejercicio17;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio08 extends JFrame {

	private Container panel;
	private JCheckBox checkIngles;
	private JCheckBox checkAleman;
	private JCheckBox checkFrances;
	private JLabel lblNewLabel;
	private JLabel etiqIdioma;

	public Ejercicio08() {
	
		super("Idiomas");
		panel = getContentPane();
		panel.setLayout(null);
		
		checkIngles = new JCheckBox("Inglés");
		checkIngles.setBounds(19, 28, 97, 23);
		panel.add(checkIngles);
		
		checkFrances = new JCheckBox("Francés");
		checkFrances.setBounds(19, 71, 97, 23);
		panel.add(checkFrances);
		
		checkAleman = new JCheckBox("Alemán");
		checkAleman.setBounds(19, 116, 97, 23);
		panel.add(checkAleman);
	

		lblNewLabel = new JLabel("Idioma seleccionado:");
		lblNewLabel.setBounds(19, 146, 124, 28);
		panel.add(lblNewLabel);
		
		etiqIdioma = new JLabel();
		etiqIdioma.setForeground(Color.BLUE);
		etiqIdioma.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiqIdioma.setBounds(153, 147, 400, 23);
		panel.add(etiqIdioma);
		
		checkIngles.addActionListener(new OyenteBoton());
		checkFrances.addActionListener(new OyenteBoton());	
		checkAleman.addActionListener(new OyenteBoton());
		
		setSize(500, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class OyenteBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String r = "";
					
			if (checkIngles.isSelected())
				r+="Inglés ";
			if (checkIngles.isSelected()&&checkFrances.isSelected()||checkIngles.isSelected()&&checkAleman.isSelected())
				r+="-";			
			if (checkFrances.isSelected())
				r+=" Francés ";
			if (checkFrances.isSelected()&&checkAleman.isSelected())
				r+="-";
			if (checkAleman.isSelected())
				r+=" Alemán";
			etiqIdioma.setText(r);;
			etiqIdioma.setVisible(true);
					}
	}

	public static void main(String[] args) {
		Ejercicio08 ventana = new Ejercicio08();

	}

}
