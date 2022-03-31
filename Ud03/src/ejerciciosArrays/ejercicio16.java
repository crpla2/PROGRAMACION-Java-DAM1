package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio16 {
	static int filas = 3, columnas = 3;
	static int[][] matriz = new int[filas][columnas];
	static int vector[] = new int[matriz[0].length];
	
	public static void main(String[] args) {

		rellenar(matriz);
		escribir(matriz);

		if ((comprobacionNumeros(matriz)) && 
			(sumaFilas(matriz)) && 
			(sumaColumnas(matriz)) && 
			(vector[0] == sumaDiagonalID(matriz)) && 
			(vector[0] == sumaDiagonalDI(matriz))) {
			
			System.out.println("Es magica");
		} else
			System.out.println("No es magica");
	}

	public static void rellenar(int matriz[][]) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduzca el campo " + (i + 1) + "." + (j + 1));
				matriz[i][j] = s.nextInt();
			}
		}
	}
	public static void escribir(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\t\n");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
	public static boolean existeNumero(int matriz[][], int numero) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numero == matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean comprobacionNumeros(int matriz[][]) {
		for (int i = 1; i <= matriz.length * matriz.length; i++) {
			if (existeNumero(matriz, i) == false) {
				return false;
			}
		}
		return true;
	}
	public static boolean sumaFilas(int matriz[][]) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				suma = suma + matriz[i][j];
			}
			vector[i] = suma;
		}
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != vector[0]) {
				return false;
			}
		}
		return true;
	}
	public static boolean sumaColumnas(int matriz[][]) {
		int suma = 0;
		int vector[] = new int[matriz[0].length];
		for (int j = 0; j < matriz[0].length; j++) {
			suma = 0;
			for (int i = 0; i < matriz.length; i++) {
				suma = suma + matriz[i][j];
			}
			vector[j] = suma;
		}
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != vector[0]) {
				return false;
			}
		}
		return true;
	}
	public static int sumaDiagonalID(int matriz[][]) {
		int suma = 0;
		int vectorDID[] = new int[matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				vectorDID[i] = matriz[i][i];
			}
		}
		for (int i = 0; i < vectorDID.length; i++) {
			suma = suma + vectorDID[i];
		}
		return suma;
	}
	public static int sumaDiagonalDI(int matriz[][]) {
		int suma = 0, x;
		int vectorDDI[] = new int[matriz[0].length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				x = (matriz[0].length - 1) - j;
				vectorDDI[i] = matriz[i][x];
			}
		}
		for (int i = 0; i < vectorDDI.length; i++) {
			suma = suma + vectorDDI[i];
		}
		return suma;
	}
}
