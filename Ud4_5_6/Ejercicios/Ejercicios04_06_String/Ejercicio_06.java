package Ejercicios04_06_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String s1 = s.next();
		System.out.println("Escriba otra:");
		String s2 = s.next();

		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);

		if (a1.length == a2.length)
			if (Arrays.equals(a1, a2))
				System.out.println(s1 + " y " + s2 + " son anagramas.");
			else
				System.out.println(s1 + " y " + s2 + " no son anagramas.");
		else
			System.out.println(s1 + " y " + s2 + " no son anagramas");

	}

}
