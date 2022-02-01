package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, factorial=1;
		System.out.print("introduce un numero entero:");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial = (factorial * i);
		} // for
		System.out.print(factorial);
	}// main

}// public
