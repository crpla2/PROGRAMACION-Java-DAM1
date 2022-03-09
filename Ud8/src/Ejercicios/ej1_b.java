package Ejercicios;

import java.util.Scanner;

public class ej1_b {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe un número de teléfono: ");
	 String numero= s.nextLine();
	if(numero.matches("\\(\\+\\d{2,3}\\)\\d{9}"))
			System.out.println("Numero correcto");
	else {
		System.out.println("Némero incorrecto");
	}
	}

}
