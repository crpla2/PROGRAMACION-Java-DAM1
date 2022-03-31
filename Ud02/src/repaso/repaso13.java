package repaso;

import java.util.Scanner;

public class repaso13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un numero positivo");
		int a, b, factorial;
		a = s.nextInt();
		factorial = 1;
		while (a < 0) {

			System.out.print("El numero es negativo, por favo introduce un numero positivo");
			a = s.nextInt();
		}

		for (int i = 1; i <= a; i++)
			factorial = factorial * i;

		System.out.print(factorial);
	}
}