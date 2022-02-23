package Ficheros_pags_171_172;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_03 {
	public static void mezclaLineas(String a, String b, String c) {
		try {
			BufferedReader br=new BufferedReader(new FileReader(a));
			BufferedReader br2=new BufferedReader(new FileReader(b));
			BufferedWriter bw=new BufferedWriter(new FileWriter(c));
			BufferedWriter bw2=new BufferedWriter(new FileWriter(c));
			String palabra,palabra2;
			while ((palabra=br.readLine())!=null) {
				bw.write(palabra);
			while ((palabra2=br2.readLine())!=null)
				bw2.write(palabra2);
			}
				br.close();br2.close();bw.close();bw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		String a="Archivos/aaaaa.txt";
		String b="Archivos/bbbbbb.txt";
		String c="Archivos/mezcla_AB.txt";	
		mezclaLineas(a, b, c);

	}

}
