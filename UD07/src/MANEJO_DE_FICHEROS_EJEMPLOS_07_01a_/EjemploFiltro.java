package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
public class EjemploFiltro {
	public static void main(String[] args) {
		String nombreArchivo = "Ficheros/Ejemplo.txt";
		FileReader fr;
		BufferedReader br;
		String linea;
		try {
			fr = new FileReader(nombreArchivo);
			br=new BufferedReader(fr);
			linea=br.readLine();
			while (linea !=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
		    br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo para lectura");
	}
  }
}

