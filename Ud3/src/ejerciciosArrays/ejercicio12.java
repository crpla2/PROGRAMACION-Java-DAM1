package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio12 {
	
	
	
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	System.out.println("Introduce una frase");
	String cadena= s.nextLine();
	int a=0,e=0,i=0,o=0,u=0;
	char frecuencia[] = new char [cadena.length()];
	for(int j=0; j<cadena.length(); j++) {
		frecuencia[j]=cadena.charAt(j);
			}
	for (int j=0; j<cadena.length(); j++) {
		if(frecuencia[j]=='a'||frecuencia[j]=='A')
			a++;
		if(frecuencia[j]=='e'||frecuencia[j]=='E')
			e++;
		if(frecuencia[j]=='i'||frecuencia[j]=='I')
			i++;
		if(frecuencia[j]=='o'||frecuencia[j]=='O')
			o++;
		if(frecuencia[j]=='u'||frecuencia[j]=='U')
			u++;
		
	}
	System.out.println("N� A/a= "+ a);
	System.out.println("N� E/e= "+ e);
	System.out.println("N� I/i= "+ i);
	System.out.println("N� O/o= "+ o);
	System.out.println("N� U/u= "+ u);
	}

}
