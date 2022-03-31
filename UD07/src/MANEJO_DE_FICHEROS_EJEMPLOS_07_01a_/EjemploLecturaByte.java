package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
// PASADO
public class EjemploLecturaByte {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int aux = 0;
		try {
			//fis = new FileInputStream("C:\\eclipse\\readme\\readme_eclipse.html");
		 fis = new FileInputStream("D:\\Prueba.dat");
			while((aux = fis.read()) != -1)
				System.out.println(aux + " - " +  (char) aux);
		} catch(FileNotFoundException ex) {
				ex.printStackTrace();
		} catch(IOException ex) {
				ex.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}


