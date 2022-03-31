package ejerciciosMetodos;

import java.util.Scanner;

public class ejercicio9_metodos {
	public static double conversorCelsius(double gFarenheith) {
		return ((5.0 / 9) * (gFarenheith - 32));
	}// de conversorCelsius

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("introduzca grados Farenheit:");
		double gradosFarenheith, resultadoCelsius;
		gradosFarenheith = n.nextDouble();
		resultadoCelsius = conversorCelsius(gradosFarenheith);
		System.out.println(resultadoCelsius + "Celsius");

	}// del metodo principal

}// del class ejercicio9_metodos
