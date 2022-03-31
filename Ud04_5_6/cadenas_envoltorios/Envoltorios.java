// antiguo Listado8_9_12.java
public class Envoltorios {

	public static void main(String[] args) {
		Integer entero = new Integer(15) ;
		Integer enteroString = new Integer( "10" ) ;
		Boolean booleanoVerdadero = new Boolean ( true ) ;
		Boolean booleanoFalso = new Boolean ( " false " ) ;
		///
		
		int enteroPrimitivo = entero.intValue( ) ;
		boolean booleanoPrimitivo = booleanoVerdadero . booleanValue ( ) ;
	
		// No hace falta 11 y 12 por autoboxing de abajo.
		
		Integer entero2 = 15 ;
		int enteroPrimitivo2 = entero2 ;
		Boolean booleanoVerdadero2 = true ;
		boolean booleanoPrimitivo2 = booleanoVerdadero2 ;
	//
		
		int entero3 = Integer.parseInt("10" ) ;
		double real= Double.parseDouble ("3.141592" ) ;
	}
	
	
	

}
