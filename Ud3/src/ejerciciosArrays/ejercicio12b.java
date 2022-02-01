package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio12b {
	static Scanner s = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	
	
	System.out.println("Introduce una frase");
	String cadena= s.nextLine();
	
	int frecuencia[] = {0,0,0,0,0};
	for(int j=0; j<cadena.length(); j++) {
		cadena.charAt(j);
	
		if(cadena.charAt(j)=='a'||cadena.charAt(j)=='A') 
			frecuencia[0]++;
		if(cadena.charAt(j)=='e'||cadena.charAt(j)=='E') 
			frecuencia[1]++;
		if(cadena.charAt(j)=='i'||cadena.charAt(j)=='I') 
			frecuencia[2]++;
		if(cadena.charAt(j)=='o'||cadena.charAt(j)=='O') 
			frecuencia[3]++;
		if(cadena.charAt(j)=='u'||cadena.charAt(j)=='U') 
			frecuencia[4]++;
		
	}
	System.out.println("Nº a= "+ frecuencia[0]);
	System.out.println("Nº e= "+ frecuencia[1]);
	System.out.println("Nº i= "+ frecuencia[2]);
	System.out.println("Nº o= "+ frecuencia[3]);
	System.out.println("Nº u= "+ frecuencia[4]);
	}

}
