package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio04 {
	public static double areaCirculo(double radio) {
		final double PI = 3.1416;
		return PI * (radio * radio);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce dimensiones del radio:");
		Scanner s = new Scanner(System.in);
		System.out.println(areaCirculo(s.nextDouble()) + "cm2");
	}

}
