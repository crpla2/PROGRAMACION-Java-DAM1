package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
// PASADO
public class EjemploLecturaChar {
	public static void main(String[] args){
		FileReader fr = null;
		int aux = 0;
		try{
			 //fr = new FileReader("C:\\eclipse\\readme\\readme_eclipse.html");
			 fr = new FileReader("D:\\alberto.txt");
			while((aux = fr.read()) != -1)
				System.out.println((char)aux);
		} catch(FileNotFoundException ex) {
				ex.printStackTrace();
	    } catch(IOException ex) {
			ex.printStackTrace();
		} finally {
				try {
					fr.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
}





