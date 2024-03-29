package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	static String[] asignatura = { "LM", "BD", "PROG", "ED" };
	static String[] alumno = { "Carlos", "Miguel", "Lorenzo" };

	public static void main(String[] args) {
		// LM BD PROG ED
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, // Carlos
							 { 6.9, 5.2, 5.7, 6.3 }, // Miguel
							 { 9.8, 8, 7.6, 8.5 } }; // Lorenzo
		maxMinMediaAlumno(notas);
		maxMinMediaAsignatura(notas);
		maxMinMediaCurso(notas);
		notaAlumnoAsignatura(notas);

	}

	private static void notaAlumnoAsignatura(double[][] notas) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca una nota: ");
		double nota=0;
		nota = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if(notas[i][j]==nota)
				System.out.println(nota+" ontenido por "+alumno[i]+" en "+asignatura[j]);
			}
		}
	}

	private static void maxMinMediaCurso(double[][] notas) {
		double max = 0, min = notas[0][0], suma = 0, cont = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				suma += notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				if (notas[i][j] > max)
					max = notas[i][j];
				cont++;
			}
		}
		System.out.println("Curso =[Max: " + max + ", Min: " + min + ", Media: " + (suma / cont) + "].");
	}

	private static void maxMinMediaAsignatura(double[][] notas) {
		double max, min, suma, cont = 0;
		for (int j = 0; j < notas[0].length; j++) {
			cont = 0;
			max = 0;
			suma = 0;
			min = notas[0][j];
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				if (notas[i][j] > max)
					max = notas[i][j];
				cont++;
			}
			System.out.println(asignatura[j] + "=[Max: " + max + ", Min: " + min + ", Media: " + (suma / cont) + "].");

		}

		System.out.println();
	}

	private static void maxMinMediaAlumno(double[][] notas) {
		double max, min, suma, cont = 0;
		for (int i = 0; i < notas.length; i++) {
			cont = 0;
			max = 0;
			suma = 0;
			min = notas[i][0];
			for (int j = 0; j < notas[i].length; j++) {
				suma += notas[i][j];
				if (notas[i][j] < min)
					min = notas[i][j];
				if (notas[i][j] > max)
					max = notas[i][j];
				cont++;
			}
			System.out.println(alumno[i] + "=[Max: " + max + ", Min: " + min + ", Media: " + (suma / cont) + "].");

		}
		System.out.println();
	}

}
