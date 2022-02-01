package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		boolean primo;
		System.out.print("introduce un numero:");

		n = s.nextInt();
		primo = true;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				primo = false;
			else
				primo = true;
		} // for
		if (primo)
			System.out.print("es primo");
		else
			System.out.print("no es primo");
	}
}
