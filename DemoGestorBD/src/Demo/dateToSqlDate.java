package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class dateToSqlDate {
	public static java.sql.Date fechaSQL(String fecha){
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
