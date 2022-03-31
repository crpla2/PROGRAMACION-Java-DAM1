package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println("Introduce cantida de Euros:");
		Scanner s = new Scanner(System.in);
		
		final double TIPOCAMBIO= 1.7774;
		double euros= s.nextDouble();
		double dolar=( euros*TIPOCAMBIO );
		
		System.out.printf(" %.4f%s", dolar,"$");
				
	}

}
