package lorenzo;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número para comprobar si su raiz cuadrada es un entero: ");
		int x = s.nextInt(); 
		
		double y = Math.sqrt(x);
		
		if ((int) y * (int) y == x) {
			System.out.println("La raiz cuadrada de " + x + ", es el número entero " + (int) y);
		}
		
		else {
			System.out.println("La raiz cuadrada de " + x + ", no da como resultado un número entero");
		}
		
	}

}
