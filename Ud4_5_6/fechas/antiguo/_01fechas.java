package antiguo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
/*Alberto Carrera. Enero 2020.
 * SimpleDateFormat es una clase concreta para formatear y analizar fechas de forma local. 
 * Permite formatear (fecha -> texto),  (texto -> fecha) 
 */
public class _01fechas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		String cadenaFecha="22/01/2019"; // San Vicente
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		// Si la cadena no se ajusta al argumento patrón, provoca excepción ¿Cuál?
		// Al final del fichero aparecen letras para formar el patrón.
		Date fecha = formato.parse(cadenaFecha);
		System.out.println(fecha);
		//
		SimpleDateFormat formato2 = new SimpleDateFormat ( "EEEE dd 'de' MMMM 'de' yyyy' ('hh':'mm':'ss')'" ) ;
		System.out.println("Ahora: " + formato2.format (new Date())); // fecha -> texto
		//
		GregorianCalendar calendario = new GregorianCalendar() ;
		System.out.println( "Ahora. " + formato2.format(calendario.getTime())) ;
		calendario.add(Calendar.DAY_OF_YEAR, 40) ;
		System.out.println ( "Dentro de 40 días: " + formato2.format(calendario.getTime())) ;
		System.out.println("En milisegundos: " + calendario.getTimeInMillis());
		//
		/******************************************/
		/* Desde Java 8. MÁS AMPLIADO EN paquete JAVA 8...*/
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy);
		LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		String hoyFormateado = formatter.format(hoy);
		System.out.println(hoyFormateado);
	}
	
}
/* SimpleDateFormat
 y   = year   (yy or yyyy)
M   = month  (MM)
d   = day in month (dd)
h   = hour (0-12)  (hh)
H   = hour (0-23)  (HH)
m   = minute in hour (mm)
s   = seconds (ss)
S   = milliseconds (SSS)
z   = time zone  text        (e.g. Pacific Standard Time...)
Z   = time zone, time offset (e.g. -0800)
 */
