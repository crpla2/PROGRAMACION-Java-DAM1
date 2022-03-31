package repaso_vectores;

import java.util.Scanner;

public class ejercicio01 {
	
		static int max,min;
	public static void main(String[] args) {
		int numero=10;
		int vector[]= new int[numero];
		System.out.println("Introduce una serie de "+numero+" numeros seguidos de un intro");
		rellenar(vector);
		System.out.println("El numero maximo es: "+max(vector));
		System.out.println("El numero minimo es: "+min(vector));
		pos(vector);
	}

	public static void rellenar(int v[]) {
		
		Scanner s= new Scanner (System.in);
		for(int i=0; i<v.length;i++) {
			System.out.print("Introduce el siguiente número =>");
			v[i]= s.nextInt();	
		}
	}
	public static int max(int v[]) {
		 max=v[0];
		for(int i=0; i<v.length;i++) { 
			if(v[i]>max)
				max=v[i];
		}
		return max;
	}
	public static int min(int v[]) {
		 min=v[0];
		for(int i=0; i<v.length;i++) { 
			if(v[i]<min)
				min=v[i];
				}
		return min;
	}
	public static void pos (int v[]) {
		System.out.print("El minimo aparece en la posicion: ");
		for(int i=0; i<v.length;i++) { 
			if(v[i]==min)
				System.out.print((i+1)+", ");}
		System.out.print("El maximo aparece  posicion: ");
		for(int i=0; i<v.length;i++) { 
			if(v[i]==max)
				System.out.print((i+1)+", ");}
}
}
