package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio15 {
	static int fila = 3;
	static int columna = 3;
	static int[][] matriz = new int[fila][columna];
	static int[][] matrizT = new int[matriz[0].length][matriz.length];

	public static void main(String[] args) {
		rellenar(matriz);
		System.out.println("");
		trasponer(matriz);
		escribir(matriz);
		System.out.println("");
		System.out.println("");
		escribirT(matrizT);
	}

	public static void rellenar(int[][] matriz) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Introduza la casilla: " + (i + 1) + "." + (j + 1));
				matriz[i][j] = s.nextInt();
			}
		}
	}

	public static void trasponer(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}
	}
	public static void escribir(int[][] matriz) {
		System.out.println("matriz original");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\t \n");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}}}
	public static void escribirT(int[][] matriz) {
		System.out.println("matriz traspuesta");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\t \n");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matrizT[i][j] + " ");
				
			}

		}
	}
}
