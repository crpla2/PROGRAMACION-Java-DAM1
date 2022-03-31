package Ejercicio1_15;

import java.io.File;
import java.io.IOException;

public class ejerc_15 {

	public static void main(String[] args) {
		String directorio;

		if (args.length > 0)
			directorio = args[0];
		else
			directorio = ".";

		File actual = new File(directorio);
		if(actual.exists()) {
		System.out.println("El directorio es: ");
		try {
			if (actual.isDirectory())
				System.out.println(actual.getCanonicalPath());
			else
				System.out.println("No es un directorio");

		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
		int contA = 0, contD = 0;
		System.out.println("\nSu contenido es:\n");
		File[] archivos = actual.listFiles();

		for (File archivo : archivos)
			if (archivo.isFile()) {
				System.out.println( archivo.getName());
				contA++;
			}
		System.out.println("\nArchivos: " + contA+"\n");
		
		for (File archivo : archivos)
			if (archivo.isDirectory()) {
				System.out.println(archivo.getName());
				contD++;
			}
		System.out.println("\nDirectorios: " + contD);
		}else System.out.println("El archivo no existe");
	}

}
