package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c;
		System.out.println("introduce un caracter: ");
		c= s.nextLine().charAt(0);
		//System.out.println(c);imprime como caracter
		if((c>=48 && c<=57)||(c>=65 && c<=90) || (c>=97 && c<=122)) {
			System.out.println(c + " es un caracter alfanumérico");
			if((c>=65 && c<=90) || (c>=97 && c<=122))
				System.out.println(c + " es un letra");
			if((c>=48 && c<=57))
				System.out.println(c + " es un numero");
			if((c>=65)&&(c<=90))
				System.out.println(c + " es una mayuscula");
			if((c>=97)&&(c<=122))
				System.out.println(c + " es una minuscula");	
		}//if
		else {
			System.out.println("no es un caracter alfanumérico");
		}//else
		}//main

	}


