package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
public class EjemploFiltro3 {
	public static void main(String[] args) {
		try {
			BufferedWriter fichero = new BufferedWriter 
										(new FileWriter ("Ficheros/Ejemplo.txt"));
			for (int i=1; i<6; i++){
				fichero.write("Fila número: "+i);
				fichero.newLine();
			}
			fichero.close();
		}
		catch (FileNotFoundException fn) {
			System.out.println("No se encuentra el fichero");
	}
		catch (IOException e) {
			System.out.println("Error de E/S");
	}
  }
}

