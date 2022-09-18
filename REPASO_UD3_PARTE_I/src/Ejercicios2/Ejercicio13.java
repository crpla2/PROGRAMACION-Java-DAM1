package Ejercicios2;

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
		System.out.println(".......................");
		maxMinMediaAsignatura(notas);
		System.out.println(".......................");
		maxMinMediaCurso(notas);
		System.out.println(".......................");
		notaAlumnoAsignatura(notas);

	}

	private static void notaAlumnoAsignatura(double[][] notas) {
		Scanner s= new  Scanner(System.in);int cont=0;
		System.out.println("nota:");
		double nota=s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (nota==notas[i][j]) {
					System.out.println("al:" +alumno[i]+"|"+"asignatura: "+asignatura[j]);
					cont++;
				}
			}
		}if(cont==0)System.out.println("ninguna nota coincide");

	}

	private static void maxMinMediaCurso(double[][] notas) {
		double max = notas[0][0], min = notas[0][0], media = 0, cont = 0;
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
		System.out.println(max + "|" + min + "|" + media / cont);
	}

	private static void maxMinMediaAsignatura(double[][] notas) {
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

			System.out.println("asignatura: "+asignatura[j]+"|"+ max + "|" + min + "|" + media / notas.length);
		}

	}

	private static void maxMinMediaAlumno(double[][] notas) {
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

			System.out.println("al:" +alumno[i]+"|"+max + "|" + min + "|" + media / notas[i].length);
		}
	}

}
