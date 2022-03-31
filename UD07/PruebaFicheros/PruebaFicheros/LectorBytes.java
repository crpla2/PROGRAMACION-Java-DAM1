package PruebaFicheros;
import java.io.FileInputStream;

import java.io.IOException;

public class LectorBytes {

	private static void leer(String f) {
		int caracterLeido;
		try {

			FileInputStream fr = new FileInputStream(f);

			while ((caracterLeido = fr.read()) != -1) {
				System.out.print((char) caracterLeido);
			}

			fr.close();

		} catch (IOException io) {
			System.out.println("Ocurrió un error al leer el fichero");
		}
	}

	public static void main(String[] args) {
		String f = "FicherosPruebaFicheros/fichero2.dat";
		leer(f);

	}

}
