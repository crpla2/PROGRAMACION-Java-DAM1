package Demo;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;


		public class Consulta_Demo extends JFrame implements ActionListener {
			private static AccesoBD_Demo abd = new AccesoBD_Demo();
			private static ResultSet rs = null;
			private static int ultimo = 0;
			private Container panel;
			private JLabel numero;
			private JLabel nombre;
			private JLabel puesto;
			private JLabel jefe;
			private JLabel antiguedad;
			private JLabel salario;
			private JLabel comision;
			private JLabel departamento;
			private JTextField jefeT;
			private JTextField numeroT;
			private JTextField nombreT;
			private JTextField puestoT;
			private JTextField antiguedadT;
			private JTextField salarioT;
			private JTextField comisionT;
			private JTextField departamentoT;
			private JButton buscar;
			private JButton anterior;
			private JButton siguiente;
			private JTextField buscarT;
			private JLabel euros;
			private JLabel porcentaje;
			private JLabel texto;

			public Consulta_Demo() {

				super("Gestión de personal");
				panel = getContentPane();
				panel.setLayout(null);

				numero = new JLabel("Número ID");
				numero.setFont(new Font("Tahoma", Font.PLAIN, 14));
				numero.setBounds(21, 60, 101, 33);
				panel.add(numero);
				numeroT = new JTextField();
				numeroT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				numeroT.setBounds(115, 68, 84, 20);
				panel.add(numeroT);
				numeroT.setColumns(10);
				numeroT.setEditable(false);

				nombre = new JLabel("Nombre");
				nombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
				nombre.setBounds(21, 95, 101, 33);
				panel.add(nombre);
				nombreT = new JTextField();
				nombreT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				nombreT.setBounds(115, 103, 84, 20);
				panel.add(nombreT);
				nombreT.setColumns(10);
				nombreT.setEditable(false);

				puesto = new JLabel("Puesto");
				puesto.setFont(new Font("Tahoma", Font.PLAIN, 14));
				puesto.setBounds(21, 130, 101, 33);
				panel.add(puesto);
				puestoT = new JTextField();
				puestoT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				puestoT.setBounds(115, 138, 84, 20);
				panel.add(puestoT);
				puestoT.setColumns(10);
				puestoT.setEditable(false);
				
				jefe = new JLabel("Superior");
				jefe.setFont(new Font("Tahoma", Font.PLAIN, 14));
				jefe.setBounds(21, 165, 101, 33);
				panel.add(jefe);
				jefeT = new JTextField();
				jefeT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				jefeT.setBounds(115, 173, 84, 20);
				panel.add(jefeT);
				jefeT.setColumns(10);
				jefeT.setEditable(false);
				
				antiguedad = new JLabel("Antiguedad");
				antiguedad.setFont(new Font("Tahoma", Font.PLAIN, 14));
				antiguedad.setBounds(21, 200, 101, 33);
				panel.add(antiguedad);
				antiguedadT = new JTextField();
				antiguedadT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				antiguedadT.setBounds(115, 208, 84, 20);
				panel.add(antiguedadT);
				antiguedadT.setColumns(10);
				antiguedadT.setEditable(false);
				
				salario = new JLabel("Salario");
				salario.setFont(new Font("Tahoma", Font.PLAIN, 14));
				salario.setBounds(21, 235, 101, 33);
				panel.add(salario);
				salarioT = new JTextField();
				salarioT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				salarioT.setBounds(115, 243, 84, 20);
				panel.add(salarioT);
				salarioT.setColumns(10);
				salarioT.setEditable(false);
				euros = new JLabel("Euros.");
				euros.setFont(new Font("Tahoma", Font.PLAIN, 12));
				euros.setBounds(202, 227, 60, 50);
				panel.add(euros);
				
				
				comision = new JLabel("Comisión");
				comision.setFont(new Font("Tahoma", Font.PLAIN, 14));
				comision.setBounds(21, 270, 101, 33);
				panel.add(comision);
				comisionT = new JTextField();
				comisionT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				comisionT.setBounds(115, 278, 84, 20);
				panel.add(comisionT);
				comisionT.setColumns(10);
				comisionT.setEditable(false);
				porcentaje = new JLabel("Euros.");
				porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
				porcentaje.setBounds(202, 278, 60, 20);
				panel.add(porcentaje);

				departamento = new JLabel("Departamento");
				departamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
				departamento.setBounds(21, 305, 101, 33);
				panel.add(departamento);
				departamentoT = new JTextField();
				departamentoT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				departamentoT.setBounds(115, 313, 84, 20);
				panel.add(departamentoT);
				departamentoT.setColumns(10);
				departamentoT.setEditable(false);


				texto = new JLabel("");
				texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
				texto.setBounds(150, 333, 101, 33);
				panel.add(texto);

				buscar = new JButton("Buscar");
				buscar.setBounds(311, 99, 89, 23);
				panel.add(buscar);
				buscar.addActionListener(this);
				buscarT = new JTextField();
				buscarT.setFont(new Font("Tahoma", Font.PLAIN, 12));
				buscarT.setBounds(311, 68, 89, 20);
				panel.add(buscarT);
				buscarT.setColumns(10);

				anterior = new JButton("Anterior");
				anterior.setBounds(115, 373, 89, 23);
				panel.add(anterior);
				anterior.addActionListener(this);
				anterior.setEnabled(false);

				siguiente = new JButton("Siguente");
				siguiente.setBounds(230, 373, 89, 23);
				panel.add(siguiente);
				siguiente.addActionListener(this);
				siguiente.setEnabled(false);




				
				
				


				


				setSize(490, 490);
				setVisible(true);
				setDefaultCloseOperation(0);
				//cierre del programa y desconexion de la base de datos
				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent we) {
						try {
							abd.desconectar();
							System.out.println("desconectado");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.exit(0);
					}
				});
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				try {
					if (e.getSource() == buscar) {
						rs = abd.consulta(String.valueOf(buscarT.getText()));
						rs.last();
						ultimo = rs.getRow();
						if (ultimo < 1) {
							JOptionPane.showMessageDialog(panel, "No existen registros con ID=  " 
									+ buscarT.getText(),"error", JOptionPane.INFORMATION_MESSAGE);
							anterior.setEnabled(false);
							siguiente.setEnabled(false);
						} else {
							rs.first();
						}
					} // fin buscar
					if (e.getSource() == siguiente) {
						if (rs.isLast()) {
							JOptionPane.showMessageDialog(panel, "No existen registros posteriores", 
									"Último socio",JOptionPane.INFORMATION_MESSAGE, null);
						} else {
							rs.next();
						}
					} // fin siguiente
					if (e.getSource() == anterior) {
						if (rs.isFirst()) {
							JOptionPane.showMessageDialog(panel, "No existen registros anteriores",
									"Primer socio",JOptionPane.INFORMATION_MESSAGE, null);
						} else {
							rs.previous();
						}
					} // fin anterior
					numeroT.setText(String.valueOf(rs.getInt(1)));
					nombreT.setText(rs.getString(2));
					puestoT.setText(rs.getString(3));
					jefeT.setText(String.valueOf(rs.getInt(4)));
					antiguedadT.setText(rs.getString(5));
					salarioT.setText(String.valueOf(rs.getInt(6)));
					comisionT.setText(String.valueOf(rs.getInt(7)));
					departamentoT.setText(String.valueOf(rs.getInt(8)));
					anterior.setEnabled(true);
					siguiente.setEnabled(true);
					texto.setText("Socio " + String.valueOf(rs.getRow()) + " de " + String.valueOf(ultimo));
				} catch (SQLException e1) {
				}
			}

			public static void main(String[] args) {
				Consulta_Demo ventana = new Consulta_Demo();
				try {
					
					abd.conectar();
					System.out.println("conectado");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


		
