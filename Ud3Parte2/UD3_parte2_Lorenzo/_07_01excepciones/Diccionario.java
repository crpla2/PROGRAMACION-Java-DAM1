package _07_01excepciones;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
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
		
	Object [] d = diccionario.keySet().toArray();	
	
		for(int i=0; i<5;i++){
			Object aleatorio= d [new Random().nextInt(d.length)];
			System.out.println("Traduceme la palabra "+aleatorio);
			String traduccion= s.next();
			
			if(traduccion.toLowerCase().equals(diccionario.get(aleatorio)))
				validas++;
			else
				erroneas++;
		}
		System.out.println("aciertos= " +validas+" fallos= "+ erroneas);
		
		
		
	
	}
}


