package Utilidades;
/**
 * Clase que implementa un método estático para comprobar si un String 
 * pasado por parámetro es un número real.
 * @author Carlos Rodrigo Pla
 *
 */
public class esReal {
	/**
	 * Metodo que devuelve verdadero en caso de que el parametro sea un número
	 * entero y falso encaso de que no lo sea.
	 * @param numero de tipo String.
	 * @return booleano.
	 */
	public static boolean esNumeroReal(String numero) {
		try {
			Double.parseDouble(numero);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
