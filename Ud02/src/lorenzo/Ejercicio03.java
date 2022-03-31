package lorenzo;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	int x, y;
	
	System.out.print("Introduce dos números enteros distintos: ");
	x = s.nextInt(); 
	y = s.nextInt();
	
	if (x % y == 0) {
		System.out.println("El número " + x + " es múltiplo de " + y);
		}
		
	if (y % x == 0) {
		System.out.println("El número " + y + " es múltiplo de " + x);
		}
		
	if ((x % y != 0) && (y % x != 0)) {
		System.out.println("Los números no son múltiplos entre sí");		
		}
		
	}

}

/*  if (x % y == 0) {
		System.out.println("El número " + x + " es múltiplo de " + y);
		}
		
	else {
		if (y % x == 0) {
			System.out.println("El número " + y + " es múltiplo de " + x);
			}
		else {
			System.out.println("Los números no son múltiplos entre sí");
			}
	}
*/