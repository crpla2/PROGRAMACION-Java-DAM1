package java8;
// https://repl.it/@jmalarcon/java-time#Main.java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

class Main {
  

  public static void main(String[] args) {

/*    
    //Uso del método now() en varias de estas clases
    System.out.println("Uso del metodo now():");
    //Fecha local, referenciándola en una variable
    System.out.println("La fecha actual es: " + LocalDate.now());
    //Hora local, uso directo
    System.out.println( "La hora actual es: " + LocalTime.now() );
    //Fecha y hora locales
    System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
    //Instante en el tiempo
    System.out.println( "El instante actual es: " + Instant.now() );
    //Fecha y hora con zona horaria
    System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );

*/
/*  
    // Partes de una fecha/hora utilizando los métodos getXXX()
	  System.out.println("Día del mes " + LocalDateTime.now().getDayOfMonth());
	  System.out.println("Día del año " + LocalDateTime.now().getDayOfYear());
	  //getHour(), getMonth(), getDayOfWeek()...
	  //
*/
 /*  //Uso del método factoría of()
    System.out.println("\nUso del metodo factoría of():");
    System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23) );
    System.out.println( "Con la hora exacta: " + LocalDateTime.of(1972, Month.MAY, 23, 20, 01, 15, 0023) );
    //Produce un error porque 2019 no fue un año bisiesto (descomenta para probar)
    //System.out.println( "Día bisiesto de 2019: " + LocalDate.of(2019, Month.FEBRUARY, 29) );
*/
 /*   
	  //Transformando fechas y horas
    System.out.println("\nSuma y resta de periodos de tiempo:");
    //Suma y resta de periodos de tiempo
    System.out.println("La fecha dentro de 10 días: " + LocalDate.now().plusDays(10) );
    System.out.println("La fecha y hora de hace 32 horas: " + LocalDateTime.now().minusHours(32) );
*/
 /*
	  //Ajustadores
   System.out.println("\nUso de ajustadores:");
    System.out.println("El primer día del próximo mes es: " + 
        LocalDate.now().with(
          TemporalAdjusters.firstDayOfNextMonth()
        ).getDayOfWeek() );
    System.out.println("El último día de este mes es: " + 
        LocalDate.now().with(
          TemporalAdjusters.lastDayOfMonth() ));
*/
	  
/*
    //Intervalos de tiempo
    System.out.println("\nIntervalos de tiempo:");
    LocalDate fNacimiento = LocalDate.of(1972, Month.MAY, 23);
    System.out.println("Mi edad es de " +  
      ChronoUnit.YEARS.between(fNacimiento, LocalDate.now())
      + " años."
    );
  */ 
    
 /*   //Periodos
    LocalDate hoy = LocalDate.now();
    LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
    Period hastaFinDeAnio = hoy.until(finDeAnio);
    //También valdría lo siguiente (descomenta y comenta lo anterior)
    //Period hastaFinDeAnio = Period.between(hoy, finDeAnio);
    int meses = hastaFinDeAnio.getMonths();
    int dias = hastaFinDeAnio.getDays();
    System.out.println("Faltan " + meses + " meses y " + dias + " días hasta final de año."
    );
    */
/*
    //Parseando fechas
    System.out.println("\nParseado de fechas:");
    //Formato ISO 8601
    LocalDate fecha1 = LocalDate.parse("2020-07-06");
    System.out.println("Fecha parseada: " + fecha1);
    //Con hora + uso de método getXXX()
    LocalDateTime fechaConHora = LocalDateTime.parse("2020-07-06T20:40:15");
    System.out.println("Día de la semana de la fecha parseada: " + fechaConHora.getDayOfWeek());
    //Parseando un formato personalizado
    LocalDate seisNov = LocalDate.parse("6/11/2020", DateTimeFormatter.ofPattern("d/M/yyyy") );
    System.out.println("Fecha parseada en formato español: " + seisNov);

    //Formato personalizado de conversión a texto
    System.out.println("\nFormato personalizado de conversión a texto:");
    System.out.println("Formato por defecto: " + fechaConHora);
    System.out.println("Formato ISO 8601 (explícito): " + fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME));
    
    DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    System.out.println("Formato español (manual): " + fechaConHora.format(esDateFormat));
    
    DateTimeFormatter esDateFormatLargo = 
    DateTimeFormatter
      .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
      .withLocale(new Locale("es", "ES"));
    System.out.println("Formato español (largo, localizado): " + fechaConHora.format(esDateFormatLargo));

    String idiomaLocal = System.getProperty("user.language");
    String paisLocal = System.getProperty("user.country");
    System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): " + 
      fechaConHora.format(
        //Nota: LONG o FULL no funcionan por ser un dato sin zona horaria
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
          .withLocale(
            new Locale(idiomaLocal, paisLocal)
          )
        )
      );
    */
 
  }
}