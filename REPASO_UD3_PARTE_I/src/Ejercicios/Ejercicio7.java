package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	static int [] numeros=new int[5];
	public static void main(String[] args) {
		 
		rellenar();
		imprimir(numeros);
		System.out.println();
		imprimir(rotar(numeros));
		

	}

	private static int[] rotar(int[] numeros2) {
		int [] girado = new int[numeros.length];
		girado[0]=numeros.length;
		for(int i=numeros.length-1;i>0;i--) {
			girado[i]=numeros2[i-1];
		}
		return girado;
		
	}

	private static void imprimir(int[] is) {
		for(int x:is)
			System.out.print(x);
		
	}

	private static int[] rellenar() {
		Scanner s= new Scanner(System.in);
		System.out.println("introduzca numero:");
		for(int i=0;i<numeros.length;i++)
			numeros[i]=s.nextInt();
		return numeros;
		
	}

}
