package lorenzo;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Indica un número real y otro entero mayores que 0: ");
		double x = s.nextDouble();
		int y = s.nextInt();
		double acumulador = x;
		for (int i = 1; i < y; i++) {
			acumulador = acumulador * x;

		}

		System.out.print(x + " elevado a " + y + " es = " + acumulador);
	}

}
