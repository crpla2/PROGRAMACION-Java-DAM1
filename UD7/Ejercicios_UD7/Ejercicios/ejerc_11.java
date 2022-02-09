package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;

public class ejerc_11 {
	static TreeSet<String> tree = new TreeSet<String>();

	public static void main(String[] args) {
		String ruta1 = "Ficheros/Persona1";
		String ruta2 = "Ficheros/Persona2";
		try {
			String nombres = "", nombres2 = "";
			FileReader fr1 = new FileReader(ruta1);
			FileReader fr2 = new FileReader(ruta2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			try {
				while ((nombres = br1.readLine()) != null)
					tree.add(nombres);
				while ((nombres2 = br2.readLine()) != null)
					tree.add(nombres2);
				fr1.close();
				fr2.close();
				br1.close();
				br2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PrintWriter fw = new PrintWriter(new FileWriter("Ficheros/Persona3.txt"));
			for (String g : tree)
				fw.println(g);
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
