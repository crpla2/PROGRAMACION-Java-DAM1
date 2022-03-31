package Ejercicio1_15;

import java.io.FileReader;
import java.io.IOException;

public class ejerc_02 {

	private static void cuentaVocales(String nombre) {
		int caracter;
		int vocales=0;
		FileReader fr;
		try {
			fr= new FileReader(nombre);
			while((caracter=fr.read())!=-1) {
				if( caracter=='a'||caracter=='A'||caracter=='e'||caracter=='E'||
					caracter=='i'||caracter=='I'||caracter=='o'||caracter=='O'||
					caracter=='u'||caracter=='U')				
					vocales++;
			}
			fr.close();
			System.out.println(vocales);
		} catch (IOException io) {
			System.out.println("Ha ocurrido un error");
		}
		
	}
	public static void main(String[] args) {
		String nombre="Ficheros/Fichero2.txt";
		cuentaVocales(nombre);

	}

}
