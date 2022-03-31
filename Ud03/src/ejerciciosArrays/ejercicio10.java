


 package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio10 {
	static int suma;
	public static void main(String[] args) {
		
		int bits[] = new int[8];
		
		rellenar(bits);
		transformar(bits);
	}

	public static void rellenar(int[] bits) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("introcuce el bit");
			bits[i] = s.nextInt();
	}
	}
	
	
	public static void transformar(int[] bits) {
		 
		for (int j = 0; j < 8; j++) {
			suma = 0;
			if ((bits[j] == 1) || (bits[j] == 0)) {
			
			if (bits[0]==1)
				suma = suma + 128;
			if (bits[1]==1)
				suma = suma + 64;
			if (bits[2]==1)
				suma = suma + 32;
			if (bits[3]==1)
				suma = suma + 16;
			if (bits[4]==1)
				suma = suma + 8;
			if (bits[5]==1)
				suma = suma + 4;
			if (bits[6]==1)
				suma = suma + 2;
			if (bits[7]==1)
				suma = suma + 1;
		
			}
			 else {
					System.out.println("el numero no es binario");
					System.exit(0);}
		}
		System.out.println(suma);
	}

}
