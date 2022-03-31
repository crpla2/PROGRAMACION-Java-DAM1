package ejercicio3;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ejercicio1.Socio;

public class ConsultaSocio extends JFrame implements ActionListener {
	static AccesoBd3 abd3 = new AccesoBd3();
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
	private JLabel a�os;
	private JLabel texto;

	public ConsultaSocio() {

		super("B�squeda de socios por localidad");
		panel = getContentPane();
		panel.setLayout(null);

		socio = new JLabel("Socio");
		socio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		socio.setBounds(21, 43, 101, 33);
		panel.add(socio);

		nombre = new JLabel("Nombre");
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

		texto = new JLabel("");
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
		anterior.setEnabled(false);

		siguiente = new JButton("Siguente");
		siguiente.setBounds(215, 271, 89, 23);
		panel.add(siguiente);
		siguiente.addActionListener(this);
		siguiente.setEnabled(false);

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

		a�os = new JLabel("a�os");
		a�os.setFont(new Font("Tahoma", Font.PLAIN, 12));
		a�os.setBounds(130, 151, 31, 20);
		panel.add(a�os);

		localidadT = new JTextField();
		localidadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		localidadT.setBounds(100, 186, 61, 20);
		panel.add(localidadT);
		localidadT.setColumns(10);
		localidadT.setEditable(false);

		setSize(450, 370);
		setVisible(true);
		setDefaultCloseOperation(0);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				try {
					abd3.desconectar();
					System.out.println("desconectado");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultSet o = null;
		try {
			if (e.getSource() == buscar) {
				if (buscarT.getText().isEmpty()) {
					o = abd3.consultarTodosRSetSocios();
					o.last();
					o.getRow();
					if (o.getRow() > 0) {
						primero(o);
						posicion(o);
						anterior.setEnabled(true);
						siguiente.setEnabled(true);

					} else {

						JOptionPane.showMessageDialog(panel,
								"No existen registros en esa localidad " + buscarT.getText(), "error",
								JOptionPane.INFORMATION_MESSAGE);

					}
				} else {
					o = abd3.consultarPorLocRS(buscarT.getText());
					o.last();

					System.out.println(o.isBeforeFirst());
					if (o.getRow() > 0) {
						primero(o);
						posicion(o);
						anterior.setEnabled(true);
						siguiente.setEnabled(true);

					} else {

						JOptionPane.showMessageDialog(panel,
								"No existen registros en esa localidad " + buscarT.getText(), "error",
								JOptionPane.INFORMATION_MESSAGE);

					}

				}
			} // del bot�n buscar

			if (e.getSource() == siguiente) {
				
				if (!o.isLast()) {
					if (o.next()) {
						socioT.setText(o.getString(1));
						nombreT.setText(o.getString(2));
						estaturaT.setText(o.getString(3));
						edadT.setText(o.getString(4));
						localidadT.setText(o.getString(5));
					}
					posicion(o);
				} else {
					JOptionPane.showMessageDialog(null, "No existen registros posteriores", "�ltimo socio",
							JOptionPane.INFORMATION_MESSAGE, null);
				}
			}
			if (e.getSource() == anterior) {
				
				if (!o.isFirst()) {
					if (o.previous()) {
						socioT.setText(o.getString(1));
						nombreT.setText(o.getString(2));
						estaturaT.setText(o.getString(3));
						edadT.setText(o.getString(4));
						localidadT.setText(o.getString(5));
					}
					posicion(o);
				} else
					JOptionPane.showMessageDialog(null, "No existen registros anteriores", "Primer socio",
							JOptionPane.INFORMATION_MESSAGE, null);

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void posicion(ResultSet o) throws SQLException {
		int x=o.getRow();
		o.last();
		int i=o.getRow();
		texto.setText("Socio " + String.valueOf(x) + " de "
				+ String.valueOf(i));
	}

	private void primero(ResultSet o) {
		try {
			o.first();
			socioT.setText(o.getString(1));
			nombreT.setText(o.getString(2));
			estaturaT.setText(o.getString(3));
			edadT.setText(o.getString(4));
			localidadT.setText(o.getString(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public static void main(String[] args) {
		ConsultaSocio ventana = new ConsultaSocio();
		try {
			abd3.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
