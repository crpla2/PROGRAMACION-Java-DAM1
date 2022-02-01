package Ejercicios01_03_Fechas;


import personal.Fecha;

public class Ejercicio_01_a {

	public static void main(String[] args) {
		
		Fecha fecha= new Fecha();
		fecha.leer();
		
		if(fecha.diaSemana()==1)
			System.out.println("Lunes");
		if(fecha.diaSemana()==2)
			System.out.println("Martes");
		if(fecha.diaSemana()==3)
			System.out.println("Miercoles");
		if(fecha.diaSemana()==4)
			System.out.println("Jueves");
		if(fecha.diaSemana()==5)
			System.out.println("Viernes");
		if(fecha.diaSemana()==6)
			System.out.println("Sabado");
		if(fecha.diaSemana()==7)
			System.out.println("Domingo");
	
	}

}
