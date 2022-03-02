package Ejercicio17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio08 {
	private boolean aleman;
	private boolean ingles;
	private boolean frances;
	private JFrame frmIdiomas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio08 window = new Ejercicio08();
					window.frmIdiomas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdiomas = new JFrame();
		frmIdiomas.setTitle("Idiomas");
		frmIdiomas.setBounds(100, 100, 385, 222);
		frmIdiomas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIdiomas.getContentPane().setLayout(null);
		
		
		JCheckBox checkIngles = new JCheckBox("Ingl\u00E9s");
		checkIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkIngles.isSelected())
					ingles=true;
			}
		});
		checkIngles.setBounds(19, 28, 97, 23);
		frmIdiomas.getContentPane().add(checkIngles);
		
		JCheckBox checkFrances = new JCheckBox("Franc\u00E9s");
		checkFrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkFrances.isSelected())
					frances=true;
			}
		});
		checkFrances.setBounds(19, 71, 97, 23);
		frmIdiomas.getContentPane().add(checkFrances);
		
		JCheckBox checkAleman = new JCheckBox("Alem\u00E1n");
		checkAleman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkAleman.isSelected())
					aleman=true;
			}
		});
		checkAleman.setBounds(19, 116, 97, 23);
		frmIdiomas.getContentPane().add(checkAleman);
		
		JLabel lblNewLabel = new JLabel("Idioma seleccionado:");
		lblNewLabel.setBounds(19, 146, 124, 28);
		frmIdiomas.getContentPane().add(lblNewLabel);
		
		JLabel etiqIngles = new JLabel("Ingl\u00E9s");
		etiqIngles.setForeground(Color.BLUE);
		etiqIngles.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiqIngles.setBounds(153, 147, 43, 23);
		frmIdiomas.getContentPane().add(etiqIngles);
		etiqIngles.setVisible(false);
		
		JLabel etiquFrances = new JLabel("Franc\u00E9s ");
		etiquFrances.setForeground(Color.BLUE);
		etiquFrances.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiquFrances.setBounds(213, 148, 57, 21);
		frmIdiomas.getContentPane().add(etiquFrances);
		etiquFrances.setVisible(false);
		
		JLabel etiqAleman = new JLabel("Alem\u00E1n");
		etiqAleman.setForeground(Color.BLUE);
		etiqAleman.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiqAleman.setBounds(280, 148, 57, 21);
		frmIdiomas.getContentPane().add(etiqAleman);
		etiqAleman.setVisible(false);
		
		JLabel guion1 = new JLabel("-");
		guion1.setFont(new Font("Tahoma", Font.BOLD, 14));
		guion1.setForeground(Color.BLUE);
		guion1.setBounds(199, 151, 15, 14);
		frmIdiomas.getContentPane().add(guion1);
		guion1.setVisible(false);
		
		JLabel guion2 = new JLabel("-");
		guion2.setForeground(Color.BLUE);
		guion2.setFont(new Font("Tahoma", Font.BOLD, 14));
		guion2.setBounds(267, 151, 15, 14);
		frmIdiomas.getContentPane().add(guion2);
		guion2.setVisible(false);
	
	if(ingles)etiqIngles.setVisible(true);
	if(frances)etiquFrances.setVisible(true);
	if(aleman)etiqAleman.setVisible(true);
	
	}

}
