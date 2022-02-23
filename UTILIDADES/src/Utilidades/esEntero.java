package Utilidades;

public class esEntero {

	public static boolean esNumeroEntero(String c) {
		try {
			Integer.parseInt(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
