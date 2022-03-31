package repaso;

import java.util.Scanner;

public class repaso14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un numero positivo");
		int a, contador;
		a = s.nextInt();
		contador=0;
		while (a < 0) {

			System.out.print("El numero es negativo, por favo introduce un numero positivo");
			a = s.nextInt();
		}

		for (int i = 2; i <= a/2; i++) 
			if(a%i==0)
			 contador++;
		if(contador>0)
		System.out.print("el numero no es primo");
		if(contador==0)
			System.out.print("el numero  es primo");
	}
}