package Ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7, 6, 8.5 } };

		MaxMEdiaMinAlumno(notas);
		MaxMEdiaMinAsignatura(notas);
		MaxMEdiaMinCurso(notas);
		nota(notas);
	}

	private static void nota(double[][] notas) {
		Scanner s = new Scanner(System.in);int cont=0;
		System.out.println("introduzca una nota");
		double nota = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (nota == notas[i][j]) {
					System.out.println("La nota " + nota + " ha sido obtenida por el alumno " + (i + 1)
							+ " en la asignatura " + (j + 1));
					cont++;
				}
			}
		}if(cont==0)
					System.out.println("la nota no existe");
	}

	private static void MaxMEdiaMinCurso(double[][] notas) {
		double max, min, media;
		max = notas[0][0];
		min = notas[0][0];
		media = 0;
		int cont = 0;
		for (int i = 0; i < notas.length; i++) {

			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] > max)
					max = notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				media += notas[i][j];
				cont++;
			}

		}
		System.out.print("curso ");
		System.out.print(" Media" + media / cont);
		System.out.print(" MAx:" + max);
		System.out.print(" min:" + min + "\n");
	}

	private static void MaxMEdiaMinAlumno(double[][] notas) {
		double max, min, media;
		for (int i = 0; i < notas.length; i++) {
			max = notas[i][0];
			min = notas[i][0];
			media = 0;
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] > max)
					max = notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				media += notas[i][j];
			}
			System.out.print("Alumno" + (i + 1));
			System.out.print(" Media" + media / notas[i].length);
			System.out.print(" MAx:" + max);
			System.out.print(" min:" + min + "\n");
		}
	}

	private static void MaxMEdiaMinAsignatura(double[][] notas) {
		double max, min, media;
		for (int j = 0; j < notas[0].length; j++) {
			max = notas[0][j];
			min = notas[0][j];
			media = 0;
			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] > max)
					max = notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				media += notas[i][j];
			}
			System.out.print("Asignaturav" + (j + 1));
			System.out.print(" Mediav" + media / notas.length);
			System.out.print(" MAx:" + max);
			System.out.print(" min:" + min + "\n");
		}
	}

}
