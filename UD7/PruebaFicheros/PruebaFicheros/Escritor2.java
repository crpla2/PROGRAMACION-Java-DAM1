package PruebaFicheros;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor2 {

	private static void  escribe(String f) {
		try {
			FileWriter fw= new FileWriter(f);
		
		fw.write('1');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write("Esto es una cadena que va en la tercera línea");
		fw.write('\n');
		fw.write("esto es un array de caracteres".toCharArray());	
		
		fw.close();
		System.out.println("Se creó correctamente el fichero");
		
		} catch (IOException io) {
			System.out.println("Ocurrió un error en la entrada de datos");
		}
	}
	
	public static void main(String[] args)  {
		String f= "FicherosPruebaFicheros/fichero2.txt";
		escribe(f);
		
	}

}
