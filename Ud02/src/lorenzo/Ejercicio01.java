package lorenzo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	System.out.print("Introduce un número entero: ");
	int x=s.nextInt();
	
	if (x % 2 == 0) {
		System.out.println("El número " + x + " es par");
		} 
	else {
		System.out.println("El número " + x + " es impar");
		}
	}
}
