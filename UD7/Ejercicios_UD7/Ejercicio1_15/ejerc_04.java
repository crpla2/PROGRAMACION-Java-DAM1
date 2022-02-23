package Ejercicio1_15;

import java.io.FileReader;
import java.io.IOException;

public class ejerc_04 {

	private static void sinEspacios(String nombre) {
		try {
			int caracter;
			FileReader fr= new FileReader(nombre);
			while((caracter=fr.read())!=-1) {
				if(caracter!=' ')
					System.out.print((char)(caracter));
					
			
			}
			fr.close();
			
		} catch (IOException io) {
			System.out.println("ha ocurrido un error");
		}
		
		
	}
	public static void main(String[] args) {
		String f="Ficheros/Fichero1.txt";
		sinEspacios(f);

	}

}
