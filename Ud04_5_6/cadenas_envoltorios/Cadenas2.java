/* 
 * ENERO 2019. Ejemplos trabajo con cadenas
 * 
 */
public class Cadenas2 {

	public static void main(String[] args) {
		
		String s = "Alberto Carrera Martín";
		System.out.println(s.lastIndexOf("ar")); // 17
		System.out.println(s.lastIndexOf("ar",15));//9
		System.out.println(s.startsWith("a")); //false
		System.out.println(s.endsWith("Martín")); // true
		System.out.println("   Alberto    ".trim()); // Alberto
		/**************************************/
		System.out.println(s.contains("Martín")); // true
		/****/
		String inicial = "Esta cadena, contiene comas, por la que quiero trocear. " ;
		 String trozos [ ] = inicial.split(", ") ;
		 for ( String trozo : trozos )
		 System.out.println(trozo) ;
	}

}

