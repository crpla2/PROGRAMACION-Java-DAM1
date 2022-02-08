package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class ejerc_11 {
	static TreeSet<String> tree = new TreeSet<String>();

	public static void main(String[] args) {
		String ruta1 = "Ficheros/Persona1";
		String ruta2 = "Ficheros/Persona2";
		try {
			FileReader fr1 = new FileReader(ruta1);
			FileReader fr2 = new FileReader(ruta2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			try {

				while (br1.read() != -1)
					tree.add(br1.readLine());
				while (br2.read() != -1)
					tree.add(br2.readLine());
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
		
		
		
		for (String g : tree)
			System.out.println(g);
	}

}
