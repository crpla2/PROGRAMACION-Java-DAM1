package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio02 {
	public static boolean esMultiplo(int x, int y) {
		return x % y == 0;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("introduce dos numeros");
		int n = s.nextInt();
		int n2 = s.nextInt();

		System.out.println(esMultiplo(n, n2));
		// TODO Auto-generated method stub

	}// main

}// public
