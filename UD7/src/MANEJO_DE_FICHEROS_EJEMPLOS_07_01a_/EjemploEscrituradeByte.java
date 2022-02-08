package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
//PASADO
public class EjemploEscrituradeByte {
	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("D:\\prueba.dat");
			fos.write(67); fos.write(73); fos.write(67); fos.write(76);	fos.write(79);
			fos.write(32); fos.write(68);fos.write(65); fos.write(77);
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex. printStackTrace();
		} finally {
			try {
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

