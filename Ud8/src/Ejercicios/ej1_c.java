package Ejercicios;

import java.util.Scanner;

public class ej1_c {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe una fecha : ");
	 String numero= s.nextLine();
	if(numero.matches("(([0][1-9])|([1-2][0-9])|([3][0-1]))/(([0][1-9])|([1][0-2]))/([0-9]{4})"
			+ ""))
			System.out.println("Fecha correcta");
	else {
		System.out.println("Fecha incorrecta");
	}
	}

}
