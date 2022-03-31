package Ejercicios01_02_Fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio_02_b {

	public static void main(String[] args) {
		GregorianCalendar fecha= new GregorianCalendar();
		fecha.getTime();
//		System.out.println(fecha);
		System.out.println("Año: "+fecha.get(Calendar.YEAR));
		System.out.println("Dia: "+fecha.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mes: "+fecha.get(Calendar.MONTH)+1);
		System.out.println("Horas: "+fecha.get(Calendar.HOUR));
		System.out.println("Minutos: "+fecha.get(Calendar.MINUTE));
		System.out.println("Segundos: "+fecha.get(Calendar.SECOND));

	}

}
