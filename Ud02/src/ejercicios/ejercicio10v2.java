package ejercicios;

import java.util.Scanner;

public class ejercicio10v2 {

	public static void main(String[] args) {
		int numero, suma = 0, contador = 0, minimo, maximo;
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un numero negativo.");
		numero = s.nextInt();
		minimo = numero;
		maximo = numero;
		if (numero < 0) {
			System.out.println("No hay números de entrada");
		} else {
			while (numero >= 0) {
				contador++; // contador=contador+1 o también ++contador
				suma = suma + numero;
				if (numero > maximo)
					maximo = numero;
				if (numero < minimo)
					minimo = numero;

				System.out.println("siguiente numero-> ");
				numero = s.nextInt();

			} // while
			System.out.println("FIN");
			System.out.println("La media vale " + (double) suma / contador);
			System.out.println("El mínimo es " + minimo);
			System.out.println("El máximo es  " + maximo);
		}//else
	}// main

}
