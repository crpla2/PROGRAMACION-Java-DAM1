package _07_01excepciones;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario2 {
	static Scanner s= new Scanner(System.in);
	static HashMap <String,String> diccionario = new HashMap<String,String>();
	
	public static void main(String[]args) {
	
	
	
	diccionario.put("uno","one");
	diccionario.put("dos","two");
	diccionario.put("tres","three");
	diccionario.put("cuatro","four");
	diccionario.put("cinco","five");
	diccionario.put("seis","six");
	diccionario.put("siete","seven");
	diccionario.put("ocho","eight");
	diccionario.put("nueve","nine");
	diccionario.put("diez","ten");
	diccionario.put("once","eleven");
	diccionario.put("doce","twelve");
	diccionario.put("trece","thirthteen");
	diccionario.put("catorce","fouthrteen");
	diccionario.put("quince","fifthteen");
	diccionario.put("dieciseis","sixteen");
	diccionario.put("diecisiete","seventeen");
	diccionario.put("dieciocho","eigthteen");
	diccionario.put("diecinueve","nineteen");
	diccionario.put("veinte","twenty");
	
	System.out.println("Introduzca el numero que desee traducir");
	String leer= s.nextLine();
		if (diccionario.containsKey(leer))
			 System.out.println("Español: "+leer+" => Inglés: "+diccionario.get(leer));
		else
			System.out.println("La palabra introducida no existe en el diccionario");
	azar();
	}
	public static void azar() {
		int validas=0;
		int erroneas=0;
	
		for(int i=0; i<5;i++){
			int x=(int)(Math.random() * 20 + 1);
			int contador = 0;
			
			for (String esp  : diccionario.keySet()) {
				contador++;
				if(contador==x) {
					System.out.println("Introduce "+esp+" en ingles: ");
					String respuesta=s.nextLine();
					if (respuesta.toLowerCase().equals(diccionario.get(esp))) {
						System.out.println("Has acertado!!!!");
						validas++;
					}
					else
						erroneas++;
				}
			}
		}
		System.out.println("aciertos= " +validas+" fallos= "+ erroneas);
		
		
		
	
	}
}


