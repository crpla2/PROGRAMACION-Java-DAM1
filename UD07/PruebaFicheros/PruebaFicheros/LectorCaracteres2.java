package PruebaFicheros;
import java.io.FileReader;
import java.io.IOException;

public class LectorCaracteres2 {

	private static void leer(String f) {
		int caracterLeido;
		try {

			FileReader fr = new FileReader(f);

			while ((caracterLeido = fr.read()) != -1) {
				System.out.print((char) caracterLeido);
			}

			fr.close();

		} catch (IOException io) {
			System.out.println("Ocurrió un error al leer el fichero");
		}
	}

	public static void main(String[] args) {
		String f = "FicherosPruebaFicheros/Fichero2.txt";
		leer(f);

	}

}
