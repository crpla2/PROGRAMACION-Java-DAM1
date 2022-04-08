package Ejercicios_Sesion4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_S4 {
	static AccesoBD_S4 abd= new AccesoBD_S4();
	static ResultSet rs;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try {
			abd.conectar();
//			System.out.println("Introduce un numero de pedido");
//			abd.importePedido(s.nextInt());
			System.out.println("Introduce la categoría");
			abd.productosCBM(s.nextInt());
			abd.desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
