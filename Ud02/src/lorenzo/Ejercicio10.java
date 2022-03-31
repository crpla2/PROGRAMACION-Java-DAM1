package lorenzo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	int min, max, contador = 0;
	float sumador = 0;
	
	System.out.println("Por favor, vaya introduciendo números enteros y pulsando INTRO.");
	System.out.println("Para finalizar, ponga un número negativo");
	
	int x=s.nextInt();
	
	if (x>=0) {
		
	min=x;
	max=x;
	
	while (x>=0) {
		
		contador++;
		
		if (x<min){
			min=x;			
		}
		if (x>max) {
			max=x;
		}
		
		sumador = sumador + x;
		
		x=s.nextInt();
	}
	
	System.out.println("El número mínimo positivo es " + min + " , el número máximo positivo es " + max + " . La media de todos los números positivos introducidos es " + (sumador/contador));
	
	}
	else {
		System.out.println("No has introducido ningún número entero positivo.");
	}
		
	}

}
