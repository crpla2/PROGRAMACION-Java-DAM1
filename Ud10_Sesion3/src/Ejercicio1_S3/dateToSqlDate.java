package Ejercicio1_S3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Clase que implementa un método estático para convertir una fecha pasada como
 * String en un java.sql.Date para su utilizacon en motores SQL.
 * 
 * @author Carlos Rodrigo Pla
 *
 */

public class dateToSqlDate {
	/**
	 * Metodo que recibe un String, lo formatea y transforma en un java.util.Date y
	 * devuelve un java.sql.Date. En caso de no recibir un formato válido para la
	 * transformación devuelve un error.
	 * 
	 * @param fecha String con formato "yyyy/MM/dd"
	 * @return java.sql.Date
	 */
	public static java.sql.Date fechaSQL(String fecha) {
		java.util.Date fech = null;
		java.sql.Date sqlFecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fech = sdf.parse(fecha);
			sqlFecha = new java.sql.Date(fech.getTime());

		} catch (ParseException e) {
			System.out.println("Error al convertir fecha");
		}
		return sqlFecha;

	}

}
