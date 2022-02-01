package objetos_ejercicios_1_2_3;

import java.util.Date;

public class PruebaCaballo {

	public static void main(String[]args) {
		Caballo furia= new Caballo();
		Caballo spirit = new Caballo("Spirit", "mustang", 350, new Date("2013/11/12"),65);
		furia.setNombre("Furia");
		furia.setRaza("pura sangre");
		furia.setPeso(298);
		furia.setVelocidad(70);
		//
		System.out.println(furia.compite(spirit).getNombre());
		
		
		
		
		
	}
}
