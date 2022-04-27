package _8errores;
/* 
 *Ejemplo Gestión de Excepciones Java Mejorado
 */

public class ProgramaExcepcionesMejorado {
	private static boolean esNumero(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
	
	public static void main (String [] args){
		String s = "M";
		int n;
		try {
			System.out.println("Intentamos ejecutar el bloque de instrucciones:");
			System.out.println("Instrucción 1.");
			//int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
			if (esNumero(s))
				n = Integer.parseInt(s);
			else
				System.out.println("No puedo convertir " + s);
					
			System.out.println("Instrucción 2.");
			System.out.println("Instrucción 3, etc.");
		}
		catch (Exception e) {
			System.out.println("Instrucciones a ejecutar cuando se produce un error");
		}
		finally {
			System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
		}
	}
}