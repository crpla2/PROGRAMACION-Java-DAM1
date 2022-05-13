package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzaca un numero:");
			numeros[i] = s.nextInt();
		}
		
		for(int j=numeros.length-1;j>=0;j--)
		System.out.println(numeros[j]);
		
		System.out.println("fin");
	}

}
