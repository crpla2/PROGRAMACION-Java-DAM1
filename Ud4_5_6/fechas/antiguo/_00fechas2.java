package antiguo;

// Ejemplos clase Date 
//Alberto Carrera. Enero 2020.
// Varias clases Date !!!


public class _00fechas2 {	
	public static void main(String[] args) {
		java.util.Date hoy = new java.util.Date();
		java.sql.Date fecha = new java.sql.Date(hoy.getTime());
		System.out.println(fecha);
		
	}

}
