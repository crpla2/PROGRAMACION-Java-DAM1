package lorenzo;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		
		int n = s.nextInt(), linea, columna;
		
		for(linea=1;linea<=n;linea++) {
			
			System.out.println();
			
			for(columna=1;columna<=linea;columna++) {
			
			System.out.print(columna + " ");
			}
		}
		
		n = n-1;
		
		for(linea=n;linea>=1;linea--) {
				
			System.out.println();
				
			for(columna=1;columna<=linea;columna++) {
				
			System.out.print(columna + " ");
			}
		}
			
	}
}
