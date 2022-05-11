package Herencias;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la frase: ");
		String frase= s.nextLine();
		String mayor="";
		String[]lista= frase.split(" ");
		for(String c:lista)
			if(c.length()>mayor.length())
				mayor=c;
			
		System.out.println("Las(s) palabras mas larga(s) tienen "+mayor.length()+" caracter(es) y es(son):");
		String palabras="";
		for(String q:lista)
			if (q.length()==mayor.length())
				if(!(palabras.contains(q)))
					palabras+=q+"\n";
		System.out.println(palabras);
				


	}

}
