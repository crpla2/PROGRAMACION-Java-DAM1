package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ejerc_06 {
	public static void Mayusculas(String s) {
		try {
			String min="";
			BufferedReader br=new BufferedReader(new FileReader(s));
			
			PrintWriter pw;
			try {
				pw = new PrintWriter(new FileWriter("Ficheros/mayusculas.txt"));
			
				while((min=br.readLine())!=null)
					pw.println(min.toUpperCase());
				br.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String ruta="Ficheros/minusculas";
		Mayusculas(ruta);
	}

}
