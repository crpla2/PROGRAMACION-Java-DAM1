package Examen2;

import java.util.Scanner;

public class p1 {
	static char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	static String[] codigo = { "· —", "— · · ·", "— · — ·", "— · ·", "·", "· · — ·", "— — ·", "· · · ·", "· ·",
			"· — — —", "— · —", "· — · ·", "— —", "— ·", "— — —", "· — — ·", "— — · —", "· — ·", "· · ·", "—", "· · —",
			"· · · —", "· — —", "— · · —", "— · — —", "— — · ·" };
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la frase a codificar:");
		String frase=s.nextLine().toUpperCase();
		
		for (int i=0;i<frase.length();i++) {
			if ((frase.charAt(i))==' ')
				System.out.print("b");
			else {
			System.out.print(codigo[pos(frase.charAt(i))]);
			System.out.print("b");}
		}
		
		
	}
	
	public static int pos(char c) {
		int posicion=0;
		for (int i=0;i<letras.length;i++) {
			if(c==letras[i])
				posicion=i;
		}
			return posicion;
		
	}

}
