package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("Introduce cantida de Dolares:");
		Scanner s = new Scanner(System.in);
		
		final double TIPOCAMBIO=(0.85);
		double dolares= s.nextDouble();
		double euros=( dolares*TIPOCAMBIO );
		
		System.out.printf(" %.4f%s", euros,"E");
				
	}

}
