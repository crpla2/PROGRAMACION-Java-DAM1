package Ejercicio17;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio07 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio07 window = new Ejercicio07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Confirmar");
		frame.setBounds(100, 100, 391, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("Continuar");
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled())
					btnNewButton.setEnabled(false);
				else
					btnNewButton.setEnabled(true);
			}
		});

		chckbxNewCheckBox.setBounds(20, 40, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);

		;
		btnNewButton.setBounds(20, 82, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setEnabled(false);

		JLabel lblNewLabel = new JLabel("He leido el documento y estoy de acuerdo con las condiciones");
		lblNewLabel.setBounds(16, 11, 359, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
