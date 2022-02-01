package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//a es el exponente y b es la  base 
		double a, multiplica;
		int b;
		multiplica=1;
		System.out.println("Por favor introduce un número real y pulsa INTRO.");//exponente
		a = s.nextDouble();
		System.out.println("Por favor introduce un número entero y pulsa INTRO.");//base
		b = s.nextInt();
		for (double i = 1; i <= a; i++) {
			multiplica= multiplica*b;
					} // for
		System.out.println(multiplica);	
	}// main
}// public
