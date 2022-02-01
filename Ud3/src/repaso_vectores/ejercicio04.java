package repaso_vectores;

import java.util.Scanner;

public class ejercicio04 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) { 
		
		
		System.out.println("Introduce el numero de personas para el estudio:");
		int numero=s.nextInt(),superior=0, inferior=0;
		
		while(numero<0) {
			System.out.println("Introduzca un numero entero positivo, por favor");
			numero= s.nextInt();
		}
		double vector[] = new double[numero];
		System.out.println("Introduce la altura de " + numero + " personas");
		rellenar(vector);
		System.out.printf("media aturas:%.2f ", media(vector));
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]>=media(vector))
				superior++;
			if(vector[i]<media(vector))
				inferior++;
		}
		System.out.println();
		System.out.println(superior+" personas tienen una altura superior a la media");
		System.out.print(inferior+" personas tienen una altura inferior a la media");
	
	}
	

	public static void rellenar(double v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduce la siguiente altura =>");
			v[i] = s.nextDouble();
		}
	}
	public static double media (double v[]) {
		int sujetos = 0;
		double suma = 0,media;
		for (int i = 0; i < v.length; i++) {
				suma=suma+v[i];
				sujetos++;
		}
		media=suma/sujetos;
		return media;
}	
	
	}
