package Ejercicio1_15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejerc_12 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Ficheros/Codificado.txt");
		FileReader fr = new FileReader("Ficheros/Fichero1.txt");
		int caracterleido;

		while ((caracterleido = fr.read()) != -1) {
			if( caracterleido<=('Z')&&caracterleido>=('A')||caracterleido<=('z')&&caracterleido>=('a'))
				fw.write(caracterleido+1);
			else
			fw.write(caracterleido );
		}
		fw.close();
		fr.close();
	}

}
