package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {

		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 } };
		maxMinMediaAlumno(notas);
		System.out.println();
		maxMinMediaAsignatura(notas);
		System.out.println();
		maxMinMediaCurso(notas);
		System.out.println();
		buscanota(notas);
	}

	public static void maxMinMediaAlumno(double[][] notas) {
		double maximo;
		double minimo;
		double paraMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			maximo = notas[i][0];
			minimo = notas[i][0];
			paraMedia = 0;

			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				paraMedia = paraMedia + notas[i][j];

			}
			System.out.println("Alumno " + (i + 1) + ": ");
			System.out.print("Nota maxima: " + maximo + " ");
			System.out.print("Nota minima: " + minimo + " ");
			System.out.println("Nota media: " + paraMedia / notas.length);
		}

	}

	public static void maxMinMediaAsignatura(double[][] notas) {

		double maximo;
		double minimo;
		double paraMedia = 0;
		for (int j = 0; j < notas[0].length; j++) {
			maximo = notas[0][j];
			minimo = notas[0][j];
			paraMedia = 0;
			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				paraMedia = paraMedia + notas[i][j];
			}
			System.out.println("Asignatura " + (j + 1) + ": ");
			System.out.print("Nota maxima: " + maximo + " ");
			System.out.print("Nota minima: " + minimo + " ");
			System.out.println("Nota media: " + paraMedia / notas.length);
		}

	}

	public static void maxMinMediaCurso(double[][] notas) {

		double maximo = notas[0][0];
		double minimo = notas[0][0];
		double paraMedia = 0;
		int contador = 0;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {

				if (notas[i][j] > maximo)
					maximo = notas[i][j];
				if (notas[i][j] < minimo)
					minimo = notas[i][j];
				paraMedia = paraMedia + notas[i][j];
				contador++;
			}
		}
		System.out.print("Curso maxima: " + maximo + " ");
		System.out.print("Curso minima: " + minimo + " ");
		System.out.println("Curso media: " + paraMedia / contador);
	}

	public static void buscanota(double[][] notas) {
		int contador = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce una nota: ");
		double nota = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (nota == notas[i][j]) {
					System.out.print(" alumno" + (i + 1) + " ");
					System.out.println(" asignatura" + (j + 1));
					contador++;
				}
			}
		}
		if (contador == 0)
			System.out.print("no existe esa nota");
	}
}
