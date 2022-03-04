
package Ejercicio17;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Ejercicio09 extends JFrame {

	private Container panel;
	private JRadioButton botLinux,botMac,botWin;
	private ButtonGroup grupo;

	public Ejercicio09() {
	
		super("Ejemplo grupos de opción");
		panel = getContentPane();
		panel.setLayout(null);
		
		grupo= new ButtonGroup();

		botLinux = new JRadioButton("Linux");
		botLinux.setFont(new Font("Tahoma", Font.BOLD, 11));
		botLinux.setBounds(53, 7, 63, 23);
		panel.add(botLinux);
		grupo.add(botLinux);
		
		
		botWin = new JRadioButton("Windows");
		botWin.setFont(new Font("Tahoma", Font.BOLD, 11));
		botWin.setBounds(117, 7, 75, 23);
		panel.add(botWin);
		grupo.add(botWin);
		
		botMac = new JRadioButton("Macintosh");
		botMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		botMac.setBounds(194, 7, 109, 23);
		panel.add(botMac);
		grupo.add(botMac);
		
		botWin.addActionListener(new OyenteBoton());
		botLinux.addActionListener(new OyenteBoton());
		botMac.addActionListener(new OyenteBoton());

		setSize(349, 134);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	class OyenteBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
							
			if (botWin.isSelected())
				JOptionPane.showMessageDialog(panel, "Elegiste: Windows", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			if (botLinux.isSelected())
				JOptionPane.showMessageDialog(panel, "Elegiste: Linux", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			if (botMac.isSelected())
				JOptionPane.showMessageDialog(panel, "Elegiste: Macintosh", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
					}
	}

	public static void main(String[] args) {
		Ejercicio09 ventana = new Ejercicio09();

	}

}
