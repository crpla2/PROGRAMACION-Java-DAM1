package repaso;

import java.util.Scanner;

public class repaso04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int n = s.nextInt();
		double x = (Math.sqrt(n));

		if (n % x == 0)
			System.out.println(n + " es el cuadrado de " + x);
		else
			System.out.println("no se puede");}

}
