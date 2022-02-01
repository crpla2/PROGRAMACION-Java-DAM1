package Ejercicios01_03_Fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio_01_d {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el dia: ");
		int d=s.nextInt();
		System.out.println("Introduzca el mes: ");
		int m=s.nextInt();
		System.out.println("Introduzca el año: ");
		int a=s.nextInt();
		
		LocalDate fecha = LocalDate.of(a, m, d);
	
		System.out.println(fecha.getDayOfWeek());
		


	}

}
