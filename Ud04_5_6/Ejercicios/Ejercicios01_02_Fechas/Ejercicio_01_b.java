package Ejercicios01_02_Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import personal.Fecha;

public class Ejercicio_01_b {

	public static void main(String[] args) throws ParseException {
		Scanner s= new Scanner(System.in);
		SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Introduzca una fecha con el siguiente formato (dd/mm/aaaa)");
		Date fecha= formato.parse(s.nextLine());
//		opcion2:
//		Date fecha=new Date(s.nextLine()); 
		if(fecha.getDay()==1)
			System.out.println("Lunes");
		if(fecha.getDay()==2)
			System.out.println("Martes");
		if(fecha.getDay()==3)
			System.out.println("Miercoles");
		if(fecha.getDay()==4)
			System.out.println("Jueves");
		if(fecha.getDay()==5)
			System.out.println("Viernes");
		if(fecha.getDay()==6)
			System.out.println("Sabado");
		if(fecha.getDay()==7)
			System.out.println("Domingo");
		
		

	}

}
