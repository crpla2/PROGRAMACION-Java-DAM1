package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio05 {

	public static double potencia(double x, int y) {
		double multiplica = 1;
		for (int i = 1; i <= y; i++) {
			multiplica = multiplica * x;
		} // del for
		return multiplica;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor introduce un numero real y pulsa INTRO.");
		double a = s.nextDouble();
		System.out.println("Por favor introduce un numero entero y pulsa INTRO.");
		int b = s.nextInt();
		System.out.println(potencia(a, b));

	}
}
