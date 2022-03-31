package lorenzo;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		int x=s.nextInt(), contador = 0;
		
		for (int i=1;i<=x;i++) {
			
			if (x%i==0) {
				contador = contador + 1;
			}
			
		}
		
		if(contador==2) {
		System.out.println("El número " + x + " es primo.");
		}
		else {
			System.out.println("El número " + x + " no es primo.");
		}
	}

}
