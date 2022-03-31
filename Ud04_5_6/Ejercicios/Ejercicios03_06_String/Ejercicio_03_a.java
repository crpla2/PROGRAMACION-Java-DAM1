package Ejercicios03_06_String;

import java.util.StringTokenizer;

public class Ejercicio_03_a {

	public static void main(String[] args) {
		StringTokenizer cadena = new StringTokenizer("Carlos Rodrigo Pla");
		while(cadena.hasMoreTokens())
		System.out.println(cadena.nextToken());
	}

}
