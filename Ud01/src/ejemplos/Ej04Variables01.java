package ejemplos;
/* 
 * Cálculo longitud circunferencia
 */
public class Ej04Variables01 {

	public static void main(String[] args) {
		int radio;
		double longitud;
		final double PI = 3.141593;
		radio = 6; // En cm. p.ej.
		longitud = 2 * PI * radio;
		System.out.println("La longitud de la circunferencia es : " + longitud + " cm."); 

	}

}
