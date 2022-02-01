package Pila_y_mapa;

import java.util.Scanner;

public class Diccionario {

	private static String w;

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			java.util.HashMap<String, String> diccionario = new java.util.HashMap<String, String>();
			diccionario.put("hola", "hello");
			diccionario.put("si", "yes");
			diccionario.put("one", "uno");
			diccionario.put("adios", "good bye");
			diccionario.put("buenos dias", "good morning");
			diccionario.put("perro", "dog");
			diccionario.put("avión", "plane");
			diccionario.put("ventana", "window");
			diccionario.put("puerta", "door");
			diccionario.put("gato", "cat");
			diccionario.put("mesa", "table");
			diccionario.put("leche", "milk");
			diccionario.put("queso", "cheese");
			diccionario.put("vaso", "glass");
			diccionario.put("cuchillo", "knive");

//			System.out.println("Diccionario de ingles, pulse \"enter\" para comenzar\nEscriba\"salir\"para salir");
//			String palabra;
//			int encontrada;
//			w = s.nextLine();
//			do {
//				encontrada = 0;
//				System.out.println("Escriba una palabra:");
//				palabra = s.nextLine();
//				for (String p : diccionario.keySet()) {
//					if (palabra.equalsIgnoreCase(p)) {
//						System.out.println(diccionario.get(p));
//						encontrada++;
//					}
//				}
//				if ((encontrada == 0) && (!(palabra.contains("salir"))))
//					System.out.println("La palabra introducida no se encuentra en nuestro diccionario");
//
//			} while (!(palabra.contains("salir")));
//			System.out.println("Gracias por usar nuestro diccionario");

		
			
			int intentos = 0, aciertos = 0;
			String respuesta = "", pregunta = "";
			do {	int i = 0;
			int	azar = (int)((Math.random() * 15) + 1);

				for (String d : diccionario.keySet()) {
					i++;
					if (i == azar) {
						System.out.println("Traduccion de : " + d);
						intentos++;
						respuesta = s.nextLine();
						if (respuesta.equalsIgnoreCase(diccionario.get(d))) {
							System.out.println("Has acertado!!");
							aciertos++;
						}else System.out.println("Has fallado :(");
					}
				}
				
			} while (intentos < 5);
			System.out.println("Has acertado "+aciertos+" palabras y has fallado "+(5-aciertos)+".");
				if (aciertos>=3)
					System.out.println("muy bien ! sigue así");
				else System.out.println("deberias estudiar un poco más.");
		}
	}
}
