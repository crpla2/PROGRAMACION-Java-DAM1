package colecciones_III_ejercicio5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDiccionario {

	static HashMap<String, String> diccionario;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		diccionario = new HashMap<String, String>();

		diccionario.put("uno", "one");
		diccionario.put("dos", "two");
		diccionario.put("tres", "three");
		diccionario.put("cuatro", "four");
		diccionario.put("cinco", "five");
		diccionario.put("seis", "six");
		diccionario.put("siete", "seven");
		diccionario.put("ocho", "eigth");
		diccionario.put("nueve", "nine");
		diccionario.put("diez", "ten");
		diccionario.put("once", "eleven");
		diccionario.put("doce", "twelve");
		diccionario.put("trece", "thirteen");
		diccionario.put("catorce", "fourteen");
		diccionario.put("quince", "fifteen");
		diccionario.put("dieciseis", "sixteen");
		diccionario.put("diecisiete", "seventeen");
		diccionario.put("dieciocho", "eighteen");
		diccionario.put("diecinueve", "nineteen");
		diccionario.put("veinte", "twenty");

//		traduce();

		juego();
	}

	public static void traduce() {
		String palabra = "";
		do{ System.out.println("Introduce un número del uno al veinte:");
			palabra = s.next();
			for (String s : diccionario.keySet())
				if (palabra.equals(s))
					System.out.println(diccionario.get(s));
		}while (!palabra.equals("fin"));
	}

	public static void juego() {
		int aciertos = 0;
		int vueltas=0;
		do {int contador = 0;
			System.out.println("Traduzca el siguiente número al inglés");
			int numero = (int) (Math.random() * 21);

			for (String p : diccionario.keySet()) {
				contador++;
				if (numero == contador) {
					System.out.print(p + ": ");

					String traduccion = s.next();
					if (traduccion.equalsIgnoreCase(diccionario.get(p))) {
						System.out.println("Has acertado");
						aciertos++;
					} else
						System.out.println("Has fallado");
				}
			}
			vueltas++;
		}while(vueltas<5);
		System.out.println("Has acertado " + aciertos + ", has fallado " + (5 - aciertos));
	}
}
