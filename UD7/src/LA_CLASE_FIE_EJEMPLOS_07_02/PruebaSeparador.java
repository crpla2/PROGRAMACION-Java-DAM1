package LA_CLASE_FIE_EJEMPLOS_07_02;

import java.io.File;

public class PruebaSeparador {
	public static void main(String arg[]){
		String sFichero = "mifichero.txt";
		String sDirectorio = "midirectorio";
		String sPath = File.separator + sDirectorio + File.separator + sFichero;
		System.out.println(sPath);

	}

}
