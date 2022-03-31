package Ejercicio1_15;

import java.io.FileReader;
import java.io.IOException;

public class ejerc_03 {
	private static void cuentaPalabras(String nombre) {
		int caracter;
		String s = "";
		FileReader fr;
		try {
			fr = new FileReader(nombre);
			while ((caracter = fr.read()) != -1) {
				s += (char) caracter;
			}
			String trozos[] = s.split("[ ,\n]");
			System.out.println(trozos.length);
			fr.close();
		} catch (IOException io) {
			System.out.println("Ha ocurrido un error");
		}

	}

	public static void main(String[] args) {
		String nombre = "Ficheros/Fichero1.txt";
		cuentaPalabras(nombre);

	}

}
