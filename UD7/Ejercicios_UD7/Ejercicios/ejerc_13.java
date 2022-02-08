	package Ejercicios;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class ejerc_13 {

		public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("Ficheros/Descodificado.txt");
			FileReader fr = new FileReader("Ficheros/Codificado.txt");
			int caracterleido;

			while ((caracterleido = fr.read()) != -1) {
				if( caracterleido==(' '))
					fw.write(caracterleido);
				else
				fw.write(caracterleido - 1);
			}
			fw.close();
			fr.close();
		}

	}


