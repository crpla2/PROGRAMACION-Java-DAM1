package LA_CLASE_FIE_EJEMPLOS_07_02;

import java.io.*;

public class EjemploOperacionesArchivo {
	public static void main (String arg[]){
		// Creación de un fichero
		//
		try {
				File file = new File("D:\\Alberto.txt");
	        	boolean resultado = file.createNewFile();
	        	if (resultado)
	        		System.out.println("Archivo creado");
	        	else
	        		System.out.println("No se pudo crear el archivo"); 
	        	//Posiblemente exista
	    	}	catch (IOException e)    { 
	    	
	    		System.out.println("Se produjo el error: "+ e.getMessage()); 
	    		
	    	}
		
		//Borrado de un fichero
		//
		try {
	        File file = new File("D:\\Alberto.txt");
	        boolean resultado = file.delete();
	        if (resultado)
        		System.out.println("Archivo borrado");
        	else
        		System.out.println("No se pudo borrar el archivo"); 
	        //P.ej. por protección C:, porque no exista
	    }   catch (Exception e) {  
	    	System.out.println("Se produjo el error: "+ e.getMessage());
	    	
	    }
		
	}
}
