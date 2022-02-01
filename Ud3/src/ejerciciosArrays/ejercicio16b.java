package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio16b {

	public static void main(String[] args) {
		int n = 3;
		int matriz[][] = new int[n][n];
		rellenar(matriz);
		pintar(matriz);

		 if (compruebaNumeros(matriz)&&sumaFilas(matriz)&&sumaColumnas(matriz)&&sumaDiagonales(matriz))
		 System.out.println("es magica");
		 else System.out.println("no es magica");

	}

	public static void rellenar(int m[][]) {
		System.out.println("Introduzca los datos de la matriz");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Introduzca el dato correspondiente a la casilla " + (i + 1) + "." + (j + 1));
				m[i][j] = s.nextInt();
			}
		}
	}

	public static void pintar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean existeNumero(int m[][], int numero) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (numero == m[i][j])
					return true;
			}
		}
		return false;
	}

	public static boolean compruebaNumeros(int m[][]) {
		for (int i = 1; i <= m.length * m.length; i++) {
			if (existeNumero(m, i) == false)
				return false;
		}
		return true;
	}

	public static boolean sumaFilas(int m[][]) {
		int sumaFilas = 0, v[] = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			sumaFilas = 0;
			for (int j = 0; j < m[i].length; j++) {
				sumaFilas = sumaFilas + m[i][j];
			}
			v[i] = sumaFilas;
			if (v[i] != v[0])
				return false;
		}

		return true;
	}

	public static boolean sumaColumnas(int m[][]) {
		int sumaColumnas = 0, v[] = new int[m[0].length];
		for (int j = 0; j < m[0].length; j++) {
			sumaColumnas = 0;
			for (int i = 0; i < m.length; i++) {
				sumaColumnas = sumaColumnas + m[i][j];
			}
			v[j] = sumaColumnas;
			if (v[j] != v[0])
				return false;
		}
		return true;
	}

	public static boolean sumaDiagonales(int m[][]) {
		int sumaD = 0, sumaI = 0, x = 0, v[] = new int[m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				x = (m[0].length - 1) - i;
			}
			sumaD = sumaD + m[i][i];
			sumaI = sumaI + m[i][x];
		}
		if (sumaI == sumaD)
			return true;
		return false;
	}

}