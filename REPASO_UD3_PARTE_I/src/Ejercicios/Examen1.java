package Ejercicios;

import java.util.Scanner;

public class Examen1 {
	static char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	static String[] codigo = { "· —", "— · · ·", "— · — ·", "— · ·", "·", "· · — ·", "— — ·", "· · · ·", "· ·",
			"· — — —", "— · —", "· — · ·", "— —", "— ·", "— — —", "· — — ·", "— — · —", "· — ·", "· · ·", "—", "· · —",
			"· · · —", "· — —", "— · · —", "— · — —", "— — · ·" };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduzca la frase pata codificar: ");
		String cadena = s.nextLine().toUpperCase();
		codificar(cadena);// el perro de san roque
	}

	private static void codificar(String cadena) {
		for (int i = 0; i <cadena.length(); i++) {
			if(cadena.charAt(i)==' ')
				System.out.print("b");
			else
			System.out.print(codigo[posicion(cadena.charAt(i))]);
			System.out.print("b");
		}
		
	}

	private static int posicion(char letra) {
		int pos = 0;
		for (int i = 0; i < letras.length; i++)
			if (letras[i] == letra)
				pos = i;
		return pos;
	}

}
