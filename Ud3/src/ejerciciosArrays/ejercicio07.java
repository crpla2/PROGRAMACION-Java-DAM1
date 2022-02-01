package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio07 {

	static Scanner s = new Scanner(System.in);

	public static void rellenar(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca número " + i);
			num[i] = s.nextInt();
		}
	}

	public static void rotar(int[] num) {
		int guardar = num[num.length - 1];
		for (int i = num.length - 1; i > 0; i--) {
			num[i] = num[i-1];
		}
		num[0] = guardar;

	}

	public static void imprimir(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduzca una serie de 15 numeros por teclado");

		int tamanyo = 5;
		int[] num = new int[tamanyo];
		rellenar(num);
		rotar(num);
		imprimir(num);
	}

}
