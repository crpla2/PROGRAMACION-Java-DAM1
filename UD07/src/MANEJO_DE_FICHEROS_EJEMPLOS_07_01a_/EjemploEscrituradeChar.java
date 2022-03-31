package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
//PASADO
public class EjemploEscrituradeChar {
	public static void main(String[] args)
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\alberto.txt");
			fw.write('A'); fw.write('l');fw.write('b');fw.write('e');fw.write('r');fw.write('t');
			fw.write('o');fw.write(' ');fw.write('C');fw.write('a');fw.write('r');fw.write('r');
			fw.write('e');fw.write('r');fw.write('a');
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex. printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

