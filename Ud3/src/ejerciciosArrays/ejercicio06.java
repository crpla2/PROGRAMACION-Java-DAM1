package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio06 {
static	Scanner s = new Scanner(System.in);
	public static int maximo(int[] num) {
		int maximo = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maximo) {
				maximo = num[i];
			}
		}
		return maximo;

	}

	public static int minimo(int[] num) {
		int minimo = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < minimo) {
				minimo = num[i];
			}
		}
		return minimo;
	}
	
	
	public static void rellenar(int[] num) {
		for (int i =0; i < num.length; i++) {
			System.out.println("Introduzca número " + i);
			num[i]= s.nextInt();
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Introduzca una serie de 10 numeros por teclado");
		int[] num = new int[10];
		rellenar (num);
		maximo(num);
		minimo(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (num[i]==maximo(num))
				System.out.print(" maximo");
			if (num[i]==minimo(num))
				System.out.print(" minimo");
			System.out.println();
				
		}

	}
}
