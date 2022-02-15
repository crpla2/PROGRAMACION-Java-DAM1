package Ejercicios;

import java.io.File;
import java.io.IOException;

public class ejerc_14 {

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

		System.out.println("Su contenido es:");
		File[] archivos = actual.listFiles();
		System.out.println("\nArchivos:");
		for (File archivo : archivos)
			if (archivo.isFile())
				System.out.println( archivo.getName());
		System.out.println("\nDirectorios:");
		for (File archivo : archivos)
			if (archivo.isDirectory())
				System.out.println(archivo.getName());
		}else
			System.out.println("El archivo no existe");
	}

}
