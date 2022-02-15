package Ejercicio16;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int opcion=0;
		while(opcion!=6) {
			do {
				System.out.println("1.Cargar Clientes");
				System.out.println("2.Consultar Clientes");
				System.out.println("3.Consultar Clientes");
				System.out.println("4.Modificar Clientes");
				System.out.println("5.Borrar clientes");
				System.out.println("6.Guardar Clientes");
				System.out.println("\n\n\t\t Introduzca la opción");
				opcion= s.nextInt();
				
			}while(opcion<1||opcion>6);
		}
		switch (opcion) {
		case 1://metodo cargar 
			break;
		case 2://metodo consultar
			break;
		case 3://
			break;
		case 4://
			break;
		case 5://
			break;
		case 6://
			break;
		default://Guardar
			break;
		}

	}

}
/*MENU DE OPCIONES:
 * 1.Cargar Clientes en memoria
 * 2.
 * 3.
 * 4.
 * 5.
 * */
 