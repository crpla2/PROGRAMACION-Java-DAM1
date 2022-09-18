package Ejercicios;

import java.util.Scanner;

public class Ejercicio10y11 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("introduzca un numero binario");
		String binario=s.nextLine();
	
		int []Array= new int[binario.length()];
		for(int i=0;i<binario.length();i++) {
			Array[i]=Character.getNumericValue(binario.charAt(i));	
		}
		int decimal=0;
		for(int i=0;i<Array.length;i++)
			if(Array[i]==1)
			decimal+=((int) Math.pow(2,Array.length-1 -i));
			System.out.println(decimal);
	}

}
