package Ejercicios04_06_String;

import java.util.Scanner;

public class Ejercicio_05 {
	static String frase;
	static String palabra;

	public static void main(String[] args) {
		int veces = 0, pos;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		frase = s.nextLine();
		System.out.println("Introduce la palabra");
		palabra = s.nextLine();
		pos = frase.indexOf(palabra);
		while (pos != -1) {
			veces++;
			pos=frase.indexOf(palabra, pos+1);
//			pos =frase.indexOf(palabra,pos+palabra.length())

		}
		System.out.println(veces);
	}
}
