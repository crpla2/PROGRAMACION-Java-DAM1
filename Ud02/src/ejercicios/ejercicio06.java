package ejercicios;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 System.out.println("Introduzca los metros cúbicos consumidos");
	double m= s.nextDouble();
	final double A= (100*0.15);
	final double B= (400*0.20);
	final double C= (500*0.35);
	
	if(m<=100) {
		System.out.println("El coste total es: " + (m*0.15));
	}
	if ((m>100) && (m<=500)) {
		System.out.println("El coste total es: " + (A +((m-100)*0.20)));
	}
	if ( m>500 && m<=1000 ) {
		System.out.println("El coste total es: " + (A+B+((m-500)*0.35)));
	}
	if ( m>1000  ) {
		System.out.println("El coste total es: " + (A+B+C+((m-1000)*0.80)));
	}
	}// main

}
