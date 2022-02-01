package lorenzo;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		
		int n = s.nextInt(), columna, linea;
		
		for(linea=1;linea<=n;linea++) {
			
			System.out.println();
			
			for(columna=1;columna<=linea;columna++) {
			
			System.out.print(columna + " ");
			
			}
			
		}
		
				
	}

}
