/* 
 * ENERO 2019. Ejemplos trabajo con cadenas
 * 
 * RECORDAR recorrido cadenas cadena.charAt(índice); 
 * RECORDAR public boolean equals(Object o) (no usar==), public boolean equalsIgnoreCase(String s),
 * public int length(), public String toLowerCase(), public String toUpperCase(), 
 * public String valueOf(boolean/char/int/long/float/double),
 * public int compareTo(String anotherString), public int compareToIgnoreCase(String str)
 * public String substring(int beginIndex, int endIndex)
 * public int indexOf(String str)
 * System.out.println(String.format ( "El valor de PI es : %2.2f " , 3.1415)) ; --> El valor de PI es : 3,14 
 * .......
 */
public class Cadenas1 {

	public static void main(String[] args) {
		String nombre ="Alberto";
		System.out.println(nombre.hashCode());
		nombre+=" Carrera";
		System.out.println(nombre.hashCode());
	   	//
		StringBuffer nombre2= new StringBuffer("Alberto");
		System.out.println(nombre2.hashCode());
		nombre2.append(" Carrera");
		System.out.println(nombre2.hashCode());
		/**********************/
		
		String x = String.valueOf(33);
		//
		System.out.println(nombre.substring(0,2)); // Al
		System.out.println(nombre2.substring(0,2)); // Al  ==String
		
		System.out.println(nombre.indexOf("Carrera")); // 8
		System.out.println(nombre.indexOf("Carrera", 7)); // 8
		System.out.println(nombre2.indexOf("CC")); // -1 ==String
		
		
		System.out.println(nombre.indexOf("Carrera", 8));//8
		System.out.println(nombre2.indexOf("Carrera", 9));//-1 ==String
		//
		System.out.println(String.format ( "El valor de PI es : %2.2f " , 3.1415)) ;
		/**************/
		StringBuffer sb = new StringBuffer ("Hola que ");
		sb.append("tal");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer( "Hola." ) ;
		sb.insert(sb2.indexOf ("." ), " Java" ) ;
		System .out.println(sb) ;
	}

}

