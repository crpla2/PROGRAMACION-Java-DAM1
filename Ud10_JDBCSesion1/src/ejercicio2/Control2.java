package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Control2 {


	private JFrame frmControlDeAcceso;
	private JTextField usuarioText;
	private JTextField passwordText;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		AccesoBdatosUsu abd = new AccesoBdatosUsu();
		
		abd.compruebaContraseña("Belen","67890");
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Control2 window = new Control2();
					window.frmControlDeAcceso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}try {
					abd.conectar();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	abd.desconectar();
	}

	/**
	 * Create the application.
	 */
	public Control2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControlDeAcceso = new JFrame();
		frmControlDeAcceso.setTitle("Control de Acceso");
		frmControlDeAcceso.setBounds(100, 100, 450, 300);
		frmControlDeAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlDeAcceso.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 43, 101, 33);
		frmControlDeAcceso.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 87, 80, 33);
		frmControlDeAcceso.getContentPane().add(lblNewLabel_1);

		usuarioText = new JTextField();
		usuarioText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usuarioText.setBounds(111, 50, 111, 20);
		frmControlDeAcceso.getContentPane().add(usuarioText);
		usuarioText.setColumns(10);

		passwordText = new JTextField();
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordText.setBounds(111, 94, 111, 20);
		frmControlDeAcceso.getContentPane().add(passwordText);
		passwordText.setColumns(10);

		JButton aceptar = new JButton("Aceptar");
		aceptar.setBounds(271, 71, 89, 23);
		frmControlDeAcceso.getContentPane().add(aceptar);
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});

		JLabel Respuesta = new JLabel("");
		Respuesta.setFont(new Font("Tahoma", Font.BOLD, 12));
		Respuesta.setBounds(21, 210, 241, 14);
		frmControlDeAcceso.getContentPane().add(Respuesta);

		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(
				"./imagenes/candado_cerrado.png"));
		Imagen.setBounds(271, 119, 111, 131);
		frmControlDeAcceso.getContentPane().add(Imagen);
	}
	
}
