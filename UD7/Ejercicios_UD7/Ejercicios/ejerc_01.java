package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejerc_01 {
	
	public static void SumaYmedia (String s) {
		try {double suma=0,media=0;int i=0;String numero="";
			FileReader fr= new FileReader(s);
			BufferedReader br= new BufferedReader(fr);
			while((numero=br.readLine())!=null) {
				i++;
				suma+=Double.parseDouble(numero);
			}
				media=suma/i;
				fr.close();
				System.out.println("La suma  total es: "+suma+"\nLa media es: "+media);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String s1="Ficheros/reales.txt";
		SumaYmedia(s1);
		
	}

}
