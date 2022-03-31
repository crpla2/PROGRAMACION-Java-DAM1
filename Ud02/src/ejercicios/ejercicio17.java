package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

		System.out.print(
				"Por favor, introduce una secuencia de números creciente separados por un INTRO. Para finalizar la secuencia introduce un 0:");

		int x = s.nextInt(), comparador, controlador = 0, contador = 0;
		if (x != 0) {
			comparador = x;
			x = s.nextInt();
			while (x != 0) {
				contador++;
				if (comparador > x) {
					controlador++;
				}
				comparador = x;
				x = s.nextInt();
			}
			if (contador < 1) {
				System.out.println("No tenemos datos suficientes para comparar.");
			}
			else {if (controlador == 0) {
				System.out.println("La secuencia de números introducida es creciente.");
			} else {
				System.out.println("La secuencia de números introducida no es creciente.");
			}
		}
		} 
		else {
			System.out.println("No has introducido una secuencia de números.");
		}
	}

}