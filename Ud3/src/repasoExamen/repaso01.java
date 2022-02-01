package repasoExamen;

import java.util.Scanner;

public class repaso01 {
	
static int max,min;
	public static void main(String[] args) {
	 int v[]=new int[10];
			rellenar(v);
			posicion(v);

	}
public static void rellenar(int v[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Introduzca 10 numeros: ");
	for(int i=0;i<v.length;i++) {
		System.out.println("introduzca el sigiente numero");
		v[i]=s.nextInt();
		
	}
	}
public static int maximo (int v[]) {
	max=v[0];
	for(int i=0;i<v.length;i++) {
		if(max<v[i])
			max=v[i];
	}return max;
}
public static int minimo (int v[]) {
	min=v[0];
	for(int i=0;i<v.length;i++) {
		if(min>v[i])
			min=v[i];
	}return min;
}
public static void posicion (int v[]) {
	
	for(int i=0;i<v.length;i++) {
		if(v[i]==maximo(v))
			System.out.println("maximo :"+maximo(v) +"pos: "+(i+1));
		if(v[i]==minimo(v))
			System.out.println("minimo :"+minimo(v) +"pos: "+(i+1));
	}
}
}
