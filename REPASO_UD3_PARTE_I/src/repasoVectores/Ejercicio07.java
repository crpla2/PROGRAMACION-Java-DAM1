package repasoVectores;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("introduce una palabra:");
		String palabra = s.nextLine();
		System.out.println(capicua(palabra));

	}

	private static boolean capicua(String p) {
		boolean  b=true;
		String reves="";
		for(int i=p.length()-1;i>0;i--)
			reves+=p.charAt(i);
		for(int i=0;i<p.length()-1;i++)
			if(p.charAt(i)!=reves.charAt(i))
				b=false;
		return b;
				
	}
	
	

}
