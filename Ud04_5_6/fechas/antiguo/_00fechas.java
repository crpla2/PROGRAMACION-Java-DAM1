package antiguo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
// Ejemplos clase Date  y Calendar
//Alberto Carrera. Enero 2020.
//https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
// https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html

public class _00fechas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	/*	Date hoy = new Date();
		System.out.println(hoy);
		System.out.println("Día de la semana: " + hoy.getDay());
		System.out.println("Hoy es: " +hoy.getDate() + " del " + (hoy.getMonth()+1) + " de " + (hoy.getYear()+1900));
		System.out.println("Hora: " + hoy.getHours()+":"+hoy.getMinutes()+":"+hoy.getSeconds());
		System.out.println("Número de milisegundos que han pasado desde el 1 de enero de 1970: " + hoy.getTime()); //System.currentTimeMillis()
	*/	
		/************************************************************/
    	GregorianCalendar c = new GregorianCalendar();
		System.out.println(c); //Interesante la colección de atributos
		System.out.println(c.getTime());
		System.out.println("Día de la semana: " + (c.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Hoy es: " +c.get(Calendar.DAY_OF_MONTH) + " del " + (c.get(Calendar.MONTH)+1) + " de " + (c.get(Calendar.YEAR)));
		System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		//
		c.add(Calendar.DAY_OF_MONTH, 1); //  mañana
		System.out.println("Mañana será: " +c.get(Calendar.DAY_OF_MONTH) + " del " + (c.get(Calendar.MONTH)+1) + " de " + (c.get(Calendar.YEAR)));
		c.add(Calendar.DAY_OF_MONTH, -2); //  
		System.out.println("Retrocediendo dos días fue: " +c.get(Calendar.DAY_OF_MONTH) + " del " + (c.get(Calendar.MONTH)+1) + " de " + (c.get(Calendar.YEAR)));
		// Para avanzar/retroceder meses o años se utiliza Calendar.MONTH y Calendar.YEAR
		//
		// Retrocedemos al comienzo de curso
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 8); // 
		c.set(Calendar.DAY_OF_MONTH, 16); 
		
	}

}
