package Ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejerc_12 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Ficheros/Codificado.txt");
		FileReader fr = new FileReader("Ficheros/Fichero1.txt");
		int caracterleido;

		while ((caracterleido = fr.read()) != -1) {
			if( caracterleido==(' '))
				fw.write(caracterleido);
			else
			fw.write(caracterleido + 1);
		}
		fw.close();
		fr.close();
	}

}
