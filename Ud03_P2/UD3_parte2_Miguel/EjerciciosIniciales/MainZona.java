package EjerciciosIniciales;

import java.util.Scanner;

public class MainZona {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Zona vip = new Zona(25);
		Zona compraventa = new Zona(200);
		Zona principal = new Zona(1000);
		int opcion;
		do {
		System.out.println("Elige una opción: \n1.Mostras entradas disponibles \n2.Comprar entradas \n3.Salir");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			System.out.println(
					"En la zona principal tenemos disponibles " + principal.getEntradasPorVender() + " entradas");
			System.out.println("En la zona de compra y venta tenemos disponibles " + compraventa.getEntradasPorVender()
					+ " entradas.");
			System.out.println("En la zona vip tenemos disponibles " + vip.getEntradasPorVender() + " entradas.\n");
			break;

		case 2:
			System.out.println("¿En que zona quieres las entradas? (1.principal, 2.compra venta, 3.vip)");
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("¿Cuantas entradas quieres?");
				int entradas = s.nextInt();
				principal.vender(entradas);
				break;

			case 2:
				System.out.println("¿Cuantas entradas quieres?");
				entradas = s.nextInt();
				compraventa.vender(entradas);
				break;

			case 3:
				System.out.println("¿Cuantas entradas quieres?");
				entradas = s.nextInt();
				vip.vender(entradas);
				break;
			}
		case 3:
			break;

		}
		}while(opcion>0&&opcion<3);
		s.close();

	}

}
