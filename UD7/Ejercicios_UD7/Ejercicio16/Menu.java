package Ejercicio16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Menu {
	static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		cargarClientes();

		int opcion = 0;
		while (opcion != 6) {
			do {
				System.out.println("1.Añadir Clientes");
				System.out.println("2.Consultar Clientes");
				System.out.println("3.Consultar Clientes morosos");
				System.out.println("4.Modificar Clientes");
				System.out.println("5.Borrar clientes");
				System.out.println("6.Guardar Clientes");
				System.out.println("\n\n\t\t Introduzca la opción");
				opcion = s.nextInt();

			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				introducirClientes();
				break;
			case 2:
				consultarClientes();
				break;
			case 3:
				consultarMoroso();
				break;
			case 4:
				System.out.println("introduzca los datos del cliente que desee modificar");
				String TUMADRE = s.nextLine();
				System.out.println("Nombre:");
				// String nombre = s.nextLine();
				String nombre = MyInput.readString();
				System.out.println("Telefono:");
				// String telefono = s.nextLine();
				String telefono = MyInput.readString();
				System.out.println("Direccion:");
				// String direccion = s.nextLine();
				String direccion = MyInput.readString();
				System.out.println("Nif:");
				// String nif = s.nextLine();
				String nif = MyInput.readString();
				System.out.println("Es moroso:");
				// boolean moroso = Boolean.parseBoolean(s.nextLine());
				boolean moroso = Boolean.parseBoolean(MyInput.readString());
				Cliente cNuevo = new Cliente(nombre, telefono, direccion, nif, moroso);

				modificarCliente(cNuevo);
				break;
			case 5:
				borrarClientes();
				break;
			case 6:
				guardarClientes();
				System.out.println("Guardado correctamente");
				break;
			}
		}
	}

	private static void introducirClientes() {
		System.out.println("Introduce los datos del cliente: ");
		String TUMADRE = s.nextLine();
		System.out.println("Nombre:");
		// String nombre = s.nextLine();
		String nombre = MyInput.readString();
		System.out.println("Telefono:");
		// String telefono = s.nextLine();
		String telefono = MyInput.readString();
		System.out.println("Direccion:");
		// String direccion = s.nextLine();
		String direccion = MyInput.readString();
		System.out.println("Nif:");
		// String nif = s.nextLine();
		String nif = MyInput.readString();
		System.out.println("Es moroso:");
		// boolean moroso = Boolean.parseBoolean(s.nextLine());
		boolean moroso = Boolean.parseBoolean(MyInput.readString());
		lista.add(new Cliente(nombre, telefono, direccion, nif, moroso));
		// Cliente c= new Cliente(nombre, telefono, direccion, nif, moroso);
	}

	private static void consultarClientes() {
		System.out.println("Clientes:");
		for (Cliente c : lista)
			System.out.println(c);
	}

	private static void consultarMoroso() {
		System.out.println("Clientes morosos:");
		for (Cliente c : lista)
			if (c.moroso)
				System.out.println(c);

	}

	private static void modificarCliente(Cliente cNuevo) {
		for (Cliente c : lista) {
			if (c.getNif().equalsIgnoreCase(cNuevo.getNif())) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}

	private static void borrarClientes() {
		System.out.println("Introduzca el nif del cliente que desea borrar:");
		String nif = MyInput.readString();
		try {
			for (Cliente c : lista) {
				if (c.getNif().equalsIgnoreCase(nif)) {
					lista.remove(c);
				}
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("La lista está vacía");
		}
	}

	private static void guardarClientes() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Ficheros/ListaClientes.dat");
			oos = new ObjectOutputStream(fos);
			for (Cliente c : lista)
				oos.writeObject(c);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error");
		} finally {
            try {
                if(fos!=null) fos.close();
                if(oos!=null) oos.close();
            } catch (IOException e) {
                System.out.println("3"+e.getMessage());
            }
		}
	}

	private static void cargarClientes() {
//		File f = new File("Ficheros/ListaClientes.dat");
//		if (f.exists()) {
//			try {
//				FileInputStream fis = new FileInputStream(f);
//				ObjectInputStream ois = new ObjectInputStream(fis);
//
//				Cliente p = (Cliente) ois.readObject();
//				while (p != null) {
//					lista.add(p);
//				p = (Cliente) ois.readObject();
//				}
//				fis.close();
//				ois.close();
//
//			} catch (EOFException e) {
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} else {
//			try {
//				System.out.println("El archivo no existe, creando archivo");
//				f.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Cliente c;

		try {

			fis = new FileInputStream("Ficheros/ListaClientes.dat");
			entrada = new ObjectInputStream(fis);
			
			c = (Cliente) entrada.readObject(); // es necesario el casting
			while (true) {
				lista.add(c);
				c = (Cliente) entrada.readObject();
			}
		}catch (EOFException e) {
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
