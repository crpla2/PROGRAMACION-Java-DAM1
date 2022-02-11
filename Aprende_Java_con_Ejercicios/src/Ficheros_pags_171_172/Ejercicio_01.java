package Ficheros_pags_171_172;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_01 {
	public static boolean esPrimo(int n) {
		int numero=n,c=0;
		for(int i=2;i<=numero/2;i++)
			if(numero%i==0)
				c++;
		if (c>0)
			return false;
		else return true;
	}
	public static void imprimePrimos(int n) {
		FileWriter fw;
		try {
			fw = new FileWriter("Archivos/primos.dat");
		
		for (int i=0; i<n;i++) {
			if(esPrimo(i))
				fw.write(i);
		}fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	imprimePrimos(500);
	}

}
