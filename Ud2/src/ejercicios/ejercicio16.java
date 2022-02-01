package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y, x, suma;
		suma = 0;
		do {
			System.out.println("Introduce un numero entero positivo");
			x = s.nextInt();
		} //do
		while (x < 0);
		while (x > 0) {
			y = x % 10;
			suma = suma + y;
			x = x / 10;
		} // while

		System.out.println(suma);
	}
}
