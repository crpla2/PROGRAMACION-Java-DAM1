package LA_CLASE_FILE_EJEMPLOS_07_02;

import java.io.*;
import java.util.*;


public class EjemploClaseFile {
	public static void main (String arg[]){
		String directorio;
		
		if (arg.length > 0)
			directorio=arg[0];
		else
			directorio=".";
		File actual = new File(directorio);
		System.out.println("El directorio es: ");
		try {
			System.out.println(actual.getCanonicalPath());
		} catch (IOException e) {
		}
		System.out.println("Su contenido es: ");
		File[] archivos = actual.listFiles();
		for (File archivo : archivos) {
			if(archivo.isFile()){
				System.out.println("Nombre "+ archivo.getName());
				System.out.println("Longitud en caracteres "+ archivo.length());
				System.out.println("Modificado "+ new Date(archivo.lastModified()));
				System.out.println("Camino             "+archivo.getPath());
		        System.out.println("Camino absoluto    "+archivo.getAbsolutePath());
		        System.out.println("Se puede escribir  "+archivo.canRead());
		        System.out.println("Se puede leer      "+archivo.canWrite());
			}
			System.out.println();
		}
	}

}
