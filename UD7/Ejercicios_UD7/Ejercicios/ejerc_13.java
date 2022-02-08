	package Ejercicios;

	import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class ejerc_13 {

		public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("Ficheros/Descodificado.txt");
			FileReader fr = new FileReader("Ficheros/Codificado.txt");
			int caracterleido;

			while ((caracterleido = fr.read()) != -1) {
				if( caracterleido<=('Z')&&caracterleido>=('A')||caracterleido<=('z')&&caracterleido>=('a'))
					fw.write(caracterleido-1);
				else
				fw.write(caracterleido );
			}
			fw.close();
			fr.close();
		}

	}


