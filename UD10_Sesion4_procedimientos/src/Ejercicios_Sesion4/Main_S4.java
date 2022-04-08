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
			//1
//			System.out.println("Introduce un numero de pedido");
//			abd.importePedido(s.nextInt());
			//2
//			System.out.println("Introduce la categoría");
//			abd.productosCBM(s.nextInt());
			//3
			int a,b;
			System.out.println("Introduce el numero de categoría");
			a=s.nextInt();
			System.out.println("Introduce porcentaje");
			b=s.nextInt();
			abd.incrementarPC(a, b);
			abd.desconectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
