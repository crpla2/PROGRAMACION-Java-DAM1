package PruebaFicheros;
import java.io.FileReader;
import java.io.IOException;

public class LectorCaracteres1 {
	
	public static void main(String[] args) throws IOException {
		
		int caracterLeido;
			FileReader fr = new FileReader("FicherosPruebaFicheros/fichero2.txt");
//			caracterLeido=fr.read();
//			
//			while(caracterLeido != -1) {
//				System.out.print((char)caracterLeido);
//				caracterLeido=fr.read();
//			}
//			
//		fr.close();

			while((caracterLeido = fr.read())!=-1) {
				System.out.print((char)caracterLeido);
				}
			
		fr.close();

	}

}
