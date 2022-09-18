package Ejercicios2;

import java.util.Scanner;

public class E06 {
	static int num[] = new int[5];
	static int max = 0, min = 0;
	public static void main(String[] args) {
		

		leer();
		maxmin();
		imprimir();
		

		
		}
	

	private static void imprimir() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max)
				System.out.println(num[i] + " maximo");
			if (num[i] == min)
				System.out.println(num[i] + " minimo");
			else
				System.out.println(num[i]);
		}

		
	}

	private static void maxmin() {
		max = num[0];
			min = num[0];
		for (int i = 0; i < num.length; i++) {
		
			if (num[i] > max)
				max = num[i];
			if (num[i] < min)
				min = num[i];
			}// TODO Auto-generated method stub
		
	}

	private static void leer() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("numero=> ");
			num[i] = s.nextInt();
		}

	}
}
