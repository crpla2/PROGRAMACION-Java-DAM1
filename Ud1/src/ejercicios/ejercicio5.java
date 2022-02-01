
package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		System.out.println("Introduce dimensiones del radio:");
		Scanner s = new Scanner(System.in);
		
		final double PI= 3.1416;
		double radio= s.nextDouble();
		double areaCirculo=( PI* (radio*radio));
		
		System.out.printf("El area del circulo es: %.4f%s", areaCirculo,"cm");
				
	}

}