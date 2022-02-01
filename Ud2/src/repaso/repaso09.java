package repaso;

import java.util.Scanner;

public class repaso09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un número entero");
		int x;

		x = s.nextInt();
		while (x <= 0)

		{

			System.out.println("introduce un numero mayor que 0");
			x = s.nextInt();
		}
		if (x > 0) {
			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= i; j++) {

					System.out.print(j + " ");
				}
				System.out.println();
			}

			for (int i = x - 1; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {

					System.out.print(j + " ");
				}
				System.out.println();
			}

			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= i; j++) {

					System.out.print(j + " ");
				}
				System.out.println();
			}

			for (int i = x - 1; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {

					System.out.print(j + " ");
				}
				System.out.println();
			}

		}

	}

}
