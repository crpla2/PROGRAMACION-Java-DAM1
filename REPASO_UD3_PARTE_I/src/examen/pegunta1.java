package examen;

import java.util.Scanner;

public class pegunta1 {
	static char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	static String[] codigo = { "· —", "— · · ·", "— · — ·", "— · ·", "·", "· · — ·", "— — ·", "· · · ·", "· ·",
			"· — — —", "— · —", "· — · ·", "— —", "— ·", "— — —", "· — — ·", "— — · —", "· — ·", "· · ·", "—", "· · —",
			"· · · —", "· — —", "— · · —", "— · — —", "— — · ·" };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadena = "";
		System.out.println("Introduzca una frase");
		cadena = s.nextLine().toUpperCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ')
				System.out.print("b");
			else
				System.out.print(codigo[posicion(cadena.charAt(i))] + "b");

		}

	}

	private static int posicion(char c) {
		int posicion = 0;
		for (int i = 0; i < letras.length; i++)
			if (c == letras[i])
				posicion = i;
		return posicion;

	}

}
