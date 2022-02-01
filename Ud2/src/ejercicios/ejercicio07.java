package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		System.out.println("escribe un número mayor que 0:");
		int numero = s.nextInt();
		int suma=0;
		if (numero>0) {
			for (int i=1; i<=numero; i++)
				suma=suma +i;
			System.out.println("La suma es:"+ suma);
		 }
		 else
			 System.out.println("No es un número positivo");
	}
}