package ejercicio1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSociosbaloncesto {
	static AccesoBdatosEj01 abdEj01 = new AccesoBdatosEj01();
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {

		try {
			abdEj01.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No ha sido posible conectarse a la base de datos");
			System.exit(0);
		}
		;
		muestrasocios();
		System.out.println();
		sociosPorlocalidad();
		
		try {
			abdEj01.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void sociosPorlocalidad() {
		System.out.println("Introduzca una localidad:");
		String local=s.nextLine();
		int cont = 0;

		System.out.println("LISTA DE SOCIOS POR LOCALIDAD");
		System.out.println("=============================");
		ArrayList<Socio> lista = abdEj01.consultarPorLocalidadSocios(local);
		for (Socio s : lista) {
			System.out.println(s);
			cont++;
			}
		System.out.println("___________________________________________________________________________________");
		System.out.println("Total de socios: " + cont);
		
	}

	private static void muestrasocios() {

		int cont = 0;

		System.out.println("LISTA DE SOCIOS");
		System.out.println("===============");
		ArrayList<Socio> lista = abdEj01.consultarTodosSocios();
		for (Socio s : lista) {
			System.out.println(s);
			cont++;
		}
		System.out.println("___________________________________________________________________________________");
		System.out.println("Total de socios: " + cont);

	}

}
