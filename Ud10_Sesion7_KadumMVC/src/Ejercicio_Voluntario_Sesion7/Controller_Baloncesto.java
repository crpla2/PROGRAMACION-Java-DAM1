package Ejercicio_Voluntario_Sesion7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Controller_Baloncesto implements ActionListener, MouseListener {
	private View view;
	private int ID = 0;

	Controller_Baloncesto(View view) {
		this.view = view;
		cargarTabla(ID);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String comando = arg0.getActionCommand();

		switch (comando) {
		case "INSERTAR":
			if (esEntero.esNumeroEntero(this.view.txtSocioId.getText())) {
				if (!Bd_Baloncesto.existeId(this.view.txtSocioId.getText())) {
					Bd_Baloncesto.añadir(this.view.txtSocioId.getText(), this.view.txtNombre.getText(),
							this.view.txtEstatura.getText(), this.view.txtEdad.getText(),
							this.view.txtLocalidad.getText());
				} else
					JOptionPane.showMessageDialog(this.view.getContentPane(),
							"     El ID \"" + this.view.txtSocioId.getText()
									+ "\" ya existe.\nPor favor introduzca un ID nuevo.",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			} else
				JOptionPane.showMessageDialog(this.view.getContentPane(),
						"        \" " + this.view.txtSocioId.getText()
								+ " \" no es un ID válido.\nPor favor introduzca un número. ",
						"ERROR", JOptionPane.ERROR_MESSAGE);
			break;

		case "BORRAR":
			if (esEntero.esNumeroEntero(this.view.txtSocioId.getText())) {
				if (Bd_Baloncesto.existeId(this.view.txtSocioId.getText()))
					Bd_Baloncesto.borrar(this.view.txtSocioId.getText());
				else
					JOptionPane.showMessageDialog(this.view.getContentPane(),
							"El socio con ID \"" + this.view.txtSocioId.getText() + "\" no existe", "ERROR",
							JOptionPane.ERROR_MESSAGE);
			} else
				JOptionPane.showMessageDialog(this.view.getContentPane(),
						"        \" " + this.view.txtSocioId.getText()
								+ " \" no es un ID válido.\nPor favor introduzca un número. ",
						"ERROR", JOptionPane.ERROR_MESSAGE);
			break;

		case "MODIFICAR":
			Bd_Baloncesto.editar(this.view.txtSocioId.getText(), this.view.txtNombre.getText(),
					this.view.txtEstatura.getText(), this.view.txtEdad.getText(), this.view.txtLocalidad.getText());
			break;

		case "BUSCAR":
			String id = this.view.txtSocioId.getText();

			if (Bd_Baloncesto.existeId(id)) {
				ID = Integer.parseInt(id);

			} else {
				JOptionPane.showMessageDialog(this.view.getContentPane(),
						" No existe el ID.\nPor favor introduzca otro número. ", "ERROR", JOptionPane.ERROR_MESSAGE);
			}

			break;

		default:
			System.err.println("Comando no definido");
			break;
		}
		// limpiar el formulario
		limpia();

		// refrescar la tabla
		cargarTabla(ID);

		ID = 0;
	}

	// Método para limpiar los campos de la ventana
	private void limpia() {
		this.view.txtSocioId.setText("");
		this.view.txtNombre.setText("");
		this.view.txtEstatura.setText("");
		this.view.txtEdad.setText("");
		this.view.txtLocalidad.setText("");
	}

	// Método que recarga los datos de la tabla de la base de datos
	// en la tabla de la clase View
	protected void cargarTabla(int iD) {
		Vector<Object> fila;
		// Borra los datos de la tabla
		for (int i = this.view.dtm.getRowCount(); i > 0; i--) {
			this.view.dtm.removeRow(i - 1);
		}
		// Cargar datos en la tabla
		try {
			ResultSet rs;
			if (iD == 0)
				rs = Bd_Baloncesto.getClientes();
			else
				rs = Bd_Baloncesto.getCliente(iD);
			while (rs.next()) {
				// Añadir registro a registro en el vector
				fila = new Vector<Object>();
				fila.add(rs.getInt("socioID"));
				fila.add(rs.getString("nombre"));
				fila.add(rs.getString("estatura"));
				fila.add(rs.getString("edad"));
				fila.add(rs.getString("localidad"));
				// Añadir el vector a la tabla de la clase View
				this.view.dtm.addRow(fila);
			}

		} catch (SQLException e) {
			System.out.println("Error al CARGAR DATOS");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		ResultSet rs;
		// Recoger qué fila se ha pulsadao en la tabla
		int filaPulsada = this.view.tabla.getSelectedRow();
		// Si se ha pulsado una fila
		if (filaPulsada >= 0) {
			// Se recoge el id de la fila marcada
			int identificador = (int) this.view.dtm.getValueAt(filaPulsada, 0);
			try {

				rs = Bd_Baloncesto.getCliente(identificador);
				// Cargar los datos devueltos en los cuadros de texto
				if (rs.next()) {
					this.view.txtSocioId.setText(rs.getString(1));
					this.view.txtNombre.setText(rs.getString(2));
					this.view.txtEstatura.setText(rs.getString(3));
					this.view.txtEdad.setText(rs.getString(4));
					this.view.txtLocalidad.setText(rs.getString(5));
				}
				// System.out.println(this.view.dtm.getValueAt(filaPulsada, 0));
			} catch (SQLException e) {
				System.err.println("Error al CARGAR UN CLIENTE");
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}