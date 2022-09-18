package repasoVectores;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int[] array = new int[10];
		llenarArray(array);
		pos(array);
	}

	private static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}	
	
	private static void pos(int[]a) {
		for(int i=0;i<a.length;i++) {
			if(max(a)==a[i])
				System.out.println("El numero mas alto es: " + a[i] + " y esta en la posicion " + (i+1));
			if(min(a)==a[i])	
				System.out.println("El numero mas bajo es: " + a[i] + " y esta en la posicion " + (i+1));
		}
	}
	
	
	
		

	

	private static void llenarArray(int[] a) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduzca un numero entero: ");
			a[i] = s.nextInt();
		}

	}

}
