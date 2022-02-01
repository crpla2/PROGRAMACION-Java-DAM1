package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio06 {
	public static double cuadrado(double n) {



double x = Math.sqrt(n);

if ( n % x == 0)
	return  x;
else
	return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		System.out.println(cuadrado(s.nextDouble()));

	}

}




	


	
