package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("introduce la longitud:");
		double longitud= n.nextDouble();
	
		Scanner s = new Scanner(System.in);
		System.out.println("introduce la anchura:");
		double anchura= s.nextDouble();
	
		System.out.printf ("Superficie : %.4f%s", (longitud*anchura),"m2"  );
	}

}
