package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio01 {
	public static boolean esPar(int n) {
		return (n%2==0);
	}// esPar
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("introduce un número entero: ");
		int x1= s.nextInt();
		System.out.println(esPar(x1));

	}//main

}//class
