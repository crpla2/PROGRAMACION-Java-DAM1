package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] num = new int[10];
		System.out.println("Introduce 10 numeros separados por un INTRO");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce el " +(i+1)+"º numero  => ");
			num[i] = s.nextInt();
		}
		for(int i=9; i>=0;i--)
			System.out.println("Introduce el " +(i+1)+"º numero  => "+ num[i]);
	}

}
