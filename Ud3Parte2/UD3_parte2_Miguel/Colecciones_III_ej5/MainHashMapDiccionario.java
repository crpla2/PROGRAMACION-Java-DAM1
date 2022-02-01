package Colecciones_III_ej5;

import java.util.HashMap;
import java.util.Scanner;

public class MainHashMapDiccionario {

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("oso", "bear");
		diccionario.put("elefante", "elephant");
		diccionario.put("aguila", "eagle");
		diccionario.put("tigre", "tiger");
		diccionario.put("león", "lion");
		diccionario.put("ratón", "mouse");
		diccionario.put("zorro", "fox");
		diccionario.put("serpiente", "snake");
		
		Scanner s=new Scanner(System.in);
		/*
		System.out.println("Introduce un animal, (en español), para ver su traducción al inglés: ");
		String animal =s.nextLine();
		animal =animal.toLowerCase();
		Boolean encontrado = false;
		for (String espanyol : diccionario.keySet()) {
			if (animal.equals(espanyol)) {
				System.out.println(diccionario.get(animal));
				encontrado = true;
			}
		}
		if(encontrado == false)
			System.out.println(animal + " no está en el diccionario.");
	*/
//
		int repeticiones=0;
		int aciertos=0;
		do {
		int x=(int)(Math.random() * 10 + 1);
		int contador = 0;
		
		for (String espanyol : diccionario.keySet()) {
			contador++;
			if(contador==x) {
				System.out.println("Introduce "+espanyol+" en ingles: ");
				String respuesta=s.nextLine();
				respuesta = respuesta.toLowerCase();
				if (respuesta.equals(diccionario.get(espanyol))) {
					System.out.println("Has acertado!!!!");
					aciertos++;
				}
			}
	    }
		repeticiones++;
		}while(repeticiones<5);
		System.out.println("Has puesto "+aciertos+" palabras bien.");
		s.close();
	}
}
