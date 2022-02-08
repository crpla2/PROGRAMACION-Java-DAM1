package Ejercicios;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejerc_05 {
	public static void daLaVuelta(String f, String f_alReves) {
		try {
			FileWriter fw = new FileWriter(f_alReves);
			char[] c = f.toCharArray();
			char[] c_reves = new char[c.length];
			int i = c.length;
			for (char x : c) {
				i--;
				c_reves[i] = x;
			}

			for (char y : c_reves)
				fw.write(y);

			fw.close();

		} catch (IOException io) {
			System.out.println("ha ocurrido un error");
			io.printStackTrace();

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String f = s.next();
		String alrReves = "Ficheros/Fichero_alReves.txt";
		daLaVuelta(f, alrReves);
s.close();
	}

}
