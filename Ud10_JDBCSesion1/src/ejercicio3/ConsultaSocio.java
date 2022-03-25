package ejercicio3;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConsultaSocio extends JFrame implements ActionListener{
	static AccesoBd3 abd= new AccesoBd3();
	private Container panel;
	private JLabel socio;
	private JTextField nombreT;
	private JLabel estatura;
	private JLabel edad;
	private JLabel localidad;
	private JButton buscar;
	private JButton anterior;
	private JButton siguiente;
	private JTextField aceptarText;
	private JTextField socioT;
	private JLabel nombre;
	private JTextField estaturaT;
	private JTextField edadT;
	private JTextField localidadT;
		
	

	public ConsultaSocio() {
		
		super("Control de Acceso Curso 2021-2022");
		panel = getContentPane();
		panel.setLayout(null);
		
		socio = new JLabel("Usuario");
		socio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		socio.setBounds(21, 43, 101, 33);
		panel.add(socio);
		
		nombre= new JLabel("Nombre");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nombre.setBounds(21, 75, 101, 33);
		panel.add(nombre);
		
		estatura = new JLabel("Estatura");
		estatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		estatura.setBounds(21, 110, 101, 33);
		panel.add(estatura);
		
		edad = new JLabel("Edad");
		edad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		edad.setBounds(21, 145, 101, 33);
		panel.add(edad);
		
		localidad = new JLabel("Localidad");
		localidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		localidad.setBounds(21, 180, 101, 33);
		panel.add(localidad);
		
		
		buscar = new JButton("Buscar");
		buscar.setBounds(271, 71, 89, 23);
		panel.add(buscar);
		buscar.addActionListener(this);
		
		anterior = new JButton("Anterior");
		anterior.setBounds(171, 271, 89, 23);
		panel.add(anterior);
		anterior.addActionListener(this);
		
		siguiente = new JButton("Siguente");
		siguiente.setBounds(271, 271, 89, 23);
		panel.add(siguiente);
		siguiente.addActionListener(this);
		

		aceptarText = new JTextField();
		aceptarText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		aceptarText.setBounds(111, 50, 111, 20);
		panel.add(aceptarText);
		aceptarText.setColumns(10);
		

		socioT = new JTextField();
		socioT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		socioT.setBounds(21, 145, 111, 20);
		panel.add(socioT);
		socioT.setColumns(10);
		

		nombreT = new JTextField();
		nombreT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreT.setBounds(111, 50, 111, 20);
		panel.add(nombreT);
		nombreT.setColumns(10);
		

		estaturaT = new JTextField();
		estaturaT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		estaturaT.setBounds(111, 50, 111, 20);
		panel.add(estaturaT);
		estaturaT.setColumns(10);
		

		edadT = new JTextField();
		edadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		edadT.setBounds(111, 50, 111, 20);
		panel.add(edadT);
		edadT.setColumns(10);
		

		localidadT = new JTextField();
		localidadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		localidadT.setBounds(111, 50, 111, 20);
		panel.add(localidadT);
		localidadT.setColumns(10);
		
		
		setSize( 450, 370);
		setVisible(true);
		setDefaultCloseOperation(0);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
		try {
			abd.desconectar();
			System.out.println("desconectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);}
		});
	}


@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		ConsultaSocio ventana= new ConsultaSocio();
		try {
			abd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




	

}
