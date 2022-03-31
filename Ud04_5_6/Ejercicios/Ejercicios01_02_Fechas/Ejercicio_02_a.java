package Ejercicios01_02_Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_02_a {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		Date fecha= new Date();
		
		System.out.println("Año "+(fecha.getYear()+1900));
		System.out.println("Dia "+fecha.getDay());
		System.out.println("Mes "+fecha.getMonth()+1);
		System.out.println("Horas "+fecha.getHours());
		System.out.println("Minutos "+fecha.getMinutes());
		System.out.println("Segundos "+fecha.getSeconds());

	}

}

