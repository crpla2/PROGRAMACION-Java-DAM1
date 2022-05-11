package Examen1;

import java.util.Scanner;

public class adrianMarcano3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("¿Cúal es tu nombre?: ");
		String tuNombre = s.next();

		System.out.println("Empecemos! Introduce un número del 1 al 4: ");
		int numeroP = s.nextInt();

		while (!(numeroP > 0 && numeroP < 5)) {
			System.out.println("Entre 0 y 4 ¿No sabes leer?: ");
			numeroP = s.nextInt();

		}

		int diferencia = 5 - numeroP;
		System.out.print("Computador: Tomo " + diferencia);
		System.out.println(". Quedan 16 cerilla(s) ");

		System.out.println(tuNombre + " te toca: ");
		numeroP = s.nextInt();
		while (!(numeroP > 0 && numeroP < 5)) {
			System.out.println("Entre 0 y 4 ¿No sabes leer?: ");
			numeroP = s.nextInt();

		}
		diferencia = 5 - numeroP;
		System.out.print("Computador: Tomo " + diferencia);
		System.out.println(". Quedan 11 cerilla(s) ");

		System.out.println(tuNombre + " te toca: ");
		numeroP = s.nextInt();
		while (!(numeroP > 0 && numeroP < 5)) {
			System.out.println("Entre 0 y 4 ¿No sabes leer?: ");
			numeroP = s.nextInt();

		}
		diferencia = 5 - numeroP;
		System.out.print("Computador: Tomo " + diferencia);
		System.out.println(". Quedan 6 cerilla(s) ");

		System.out.println(tuNombre + " te toca: ");
		numeroP = s.nextInt();
		while (!(numeroP > 0 && numeroP < 5)) {
			System.out.println("Entre 0 y 4 ¿No sabes leer?: ");
			numeroP = s.nextInt();

		}
		diferencia = 5 - numeroP;
		System.out.print("Computador: Tomo " + diferencia);
		System.out.println(". Quedan 1 cerilla(s) ");

		System.out.println("PERDEDOR!!!");

	}

}
