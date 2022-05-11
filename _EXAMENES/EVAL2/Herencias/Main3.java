package Herencias;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Main3 {

	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar();
		System.out.println("En Huesca es " + c.getTime());
		c.add(Calendar.HOUR, -1);
		System.out.print("y en Canarias: " + c.getTime());
	}
}
