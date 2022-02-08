package Ejercicios;

import java.io.FileReader;
import java.io.IOException;

public class ejerc_09 {
	

	private static boolean sonIdenticos(String n, String m) {
		String frase="";
		String frase2="";
		
	try {
		int caracterLeido;
		FileReader fr= new FileReader(n);

		while((caracterLeido = fr.read())!= -1)
			frase= frase+ ((char)caracterLeido);
		
		fr.close();
		
		FileReader fr2= new FileReader(m);

		while((caracterLeido = fr2.read())!= -1)
			frase2= frase2+ ((char)caracterLeido);
		
		fr2.close();		
		
	} catch (IOException io) {
		System.out.println("Ha ocurrido un error");
		io.printStackTrace();
	}
	return frase.equals(frase2);
	}
	
	public static void main(String[] args) {
		String n="Ficheros/Fichero1.txt";
		String m="Ficheros/Fichero1bis.txt";
		System.out.println(sonIdenticos(n,m));
		
	}

}
