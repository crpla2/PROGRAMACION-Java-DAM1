package Ficheros_pags_171_172;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_02 {

	public static void main(String[] args) {
	
		try {
			FileReader fr= new FileReader("Archivos/primos.dat");
			int numero;
			while((numero= fr.read())!=-1)
				System.out.print(numero+"-");
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
