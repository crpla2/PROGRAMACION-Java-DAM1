package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio03 {
	public static double cambioDolar(double dolares, double cambio) {
		return dolares * cambio;
	}

	public static void main(String[] args) {

		System.out.println("Introduce cantidad de dolares y tipo de cambio:");
		Scanner s = new Scanner(System.in);
		System.out.println(cambioDolar(s.nextDouble(), s.nextDouble()) + " Euros");
	}

}
