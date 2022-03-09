package Ejercicios;

import java.util.Scanner;

public class ej1_d {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Escribe un número código postal: ");
	 String numero= s.nextLine();
	if(numero.matches("\\d{5}"))
			System.out.println("Código correcto");
	else {
		System.out.println("Código incorrecto");
	}
	}

}
