package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String cadena= s.nextLine().toLowerCase();
		int[] frecuencia= new int[5];
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='a')
				frecuencia[0]++;
			if(cadena.charAt(i)=='e')
				frecuencia[1]++;
			if(cadena.charAt(i)=='i')
				frecuencia[2]++;
			if(cadena.charAt(i)=='o')
				frecuencia[3]++;
			if(cadena.charAt(i)=='u')
				frecuencia[4]++;						
		}
		String[]vocales= {"a: ","e: ","i: ","o: ","u: "};
		for(int i=0;i<5;i++)
			System.out.println(vocales[i]+frecuencia[i]);
	}

}
