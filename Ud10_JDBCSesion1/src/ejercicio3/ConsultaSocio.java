package ejercicio3;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
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
	private JTextField buscarT;
	private JTextField socioT;
	private JLabel nombre;
	private JTextField estaturaT;
	private JTextField edadT;
	private JTextField localidadT;
	private JLabel cm;
	private JLabel años;
	private JLabel texto;
	private Object ResultSet;
		
	

	public ConsultaSocio() {
		
		super("Búsqueda de socios por localidad");
		panel = getContentPane();
		panel.setLayout(null);
		
		socio = new JLabel("Socio");
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
		
		texto = new JLabel("txtxtxtxtxtxt");
		texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto.setBounds(150, 210, 101, 33);
		panel.add(texto);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(311, 81, 89, 23);
		panel.add(buscar);
		buscar.addActionListener(this);
		
		anterior = new JButton("Anterior");
		anterior.setBounds(100, 271, 89, 23);
		panel.add(anterior);
		anterior.addActionListener(this);
		
		siguiente = new JButton("Siguente");
		siguiente.setBounds(215, 271, 89, 23);
		panel.add(siguiente);
		siguiente.addActionListener(this);
		

		buscarT = new JTextField();
		buscarT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buscarT.setBounds(311, 50, 89, 20);
		panel.add(buscarT);
		buscarT.setColumns(10);
	
		

		socioT = new JTextField();
		socioT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		socioT.setBounds(100, 51, 41, 20);
		panel.add(socioT);
		socioT.setColumns(10);
		socioT.setEditable(false);
		

		nombreT = new JTextField();
		nombreT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreT.setBounds(100, 81, 151, 20);
		panel.add(nombreT);
		nombreT.setColumns(10);
		nombreT.setEditable(false);
		

		estaturaT = new JTextField();
		estaturaT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		estaturaT.setBounds(100, 116, 31, 20);
		panel.add(estaturaT);
		estaturaT.setColumns(10);
		estaturaT.setEditable(false);
		
		cm = new JLabel("cm.");
		cm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cm.setBounds(140, 116, 31, 20);
		panel.add(cm);	

		edadT = new JTextField();
		edadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		edadT.setBounds(100, 151, 21, 20);
		panel.add(edadT);
		edadT.setColumns(10);
		edadT.setEditable(false);
		
		años = new JLabel("años");
		años.setFont(new Font("Tahoma", Font.PLAIN, 12));
		años.setBounds(130, 151, 31, 20);
		panel.add(años);

		localidadT = new JTextField();
		localidadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		localidadT.setBounds(100, 186, 61, 20);
		panel.add(localidadT);
		localidadT.setColumns(10);
		localidadT.setEditable(false);
		
		
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
	
	ResultSet o;
	
	
	if (buscarT.getText().isEmpty()) {
		
//			socioT.setText());
			try {
				o=	abd.consultarTodosRSetSocios();
				o.next();
				socioT.setText(o.getString(1));
				nombreT.setText(o.getString(2));
				estaturaT.setText(o.getString(3));
				edadT.setText(o.getString(4));
				localidadT.setText(o.getString(5));
		
		if(e.getSource()==siguiente) {
			
			while(o.next()) {
				
				socioT.setText(o.getString(1));
				nombreT.setText(o.getString(2));
				estaturaT.setText(o.getString(3));
				edadT.setText(o.getString(4));
				localidadT.setText(o.getString(5));
				
			}
			}o.close();
		}
			 catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else {
		try {
			o= abd.consultarPorLocRS(buscarT.getText());
			o.first();
			socioT.setText(o.getString(1));
			nombreT.setText(o.getString(2));
			estaturaT.setText(o.getString(3));
			edadT.setText(o.getString(4));
			localidadT.setText(o.getString(5));
			
			if(e.getSource()==siguiente) {
				
				while(o.next()) {
					
					socioT.setText(o.getString(1));
					nombreT.setText(o.getString(2));
					estaturaT.setText(o.getString(3));
					edadT.setText(o.getString(4));
					localidadT.setText(o.getString(5));
					
				}
				}o.close();
		} catch (SQLException e1) {
			}
	
		
	}}

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
