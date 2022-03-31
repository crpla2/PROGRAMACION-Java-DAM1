package lorenzo;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Indica un número entero: ");
		int x = s.nextInt();

		int factorial = 1;

		for (int i = 1; i <= x; i++) {
			factorial = factorial * i;
		}
		System.out.print("El factorial de " + x + " es: " +factorial);
	}

}
