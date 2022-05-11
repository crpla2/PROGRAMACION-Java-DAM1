package Examen2;


import java.util.Scanner;

public class Pregunta1CRP {
	static char [] letras = {'A','B','C','D','E','F','G','H', 'I', 'J','K','L','M','N',
			 				 'O','P','Q','R','S','T','U', 'V', 'W','X','Y','Z'};

	static String [] codigo = {"· —", "— · · ·", "— · — ·", "— · ·", "·", "· · — ·", "— — ·", "· · · ·", "· ·",
							   "· — — —", "— · —", "· — · ·", "— —", "— ·", "— — —", "· — — ·", "— — · —", "· — ·",
				               "· · ·", "—", "· · —", "· · · —", "· — —", "— · · —", "— · — —", "— — · ·"};
	
	
	
	public static int posicion(char letra) {
		int p=0; 
			for(int i=0;i<letras.length;i++) {
				if(letras[i]==letra)
					p=i;
			}	
		return p;
	} 


	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("intrduzca la cadena a codificar:");
		String palabra=" ";
		
			palabra=s.nextLine();
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)==' ') {
				System.out.print("b");}
			else
				System.out.print(codigo[posicion(palabra.charAt(i))]);
			if(palabra.charAt(i)!=palabra.length()-1)
				System.out.print("b");
		}
		
		
		
	} // del main
	
	

}
