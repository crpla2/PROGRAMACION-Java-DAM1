package Utilidades;

public class esReal {

	public static boolean esNumeroReal(String c) {
		try {
			Double.parseDouble(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
