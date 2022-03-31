package repaso_vectores;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca una palabra:");
		String palabra=s.nextLine();
		boolean capicua=true;
		char letras[]= new char[palabra.length()];
		char letras1[]= new char[palabra.length()/2];
		
		for(int i=0;i<palabra.length();i++)	{
			letras[i]=palabra.charAt(i);
		}

		for(int i=0;i<(letras.length/2);i++){
			letras1[i]=letras[i];
		}
		System.out.println();
		
		for(int i=0;i<letras1.length;i++) {	
			int x=(letras.length-1)-i;
			if(letras[x]!=letras1[i]) {
				capicua=false;
				break;}
			else
				capicua=true;
	}
	if(capicua)
	System.out.print("Es capicua");
	else
		System.out.println("No es capicua");
}}
