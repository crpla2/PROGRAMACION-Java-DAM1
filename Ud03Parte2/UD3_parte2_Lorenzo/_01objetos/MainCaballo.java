package _01objetos;

import java.util.Date;

public class MainCaballo {

	public static void main(String[] args) {
		Caballo furia = new Caballo();
		Caballo spirit = new Caballo("Spirit", "mustang", 350, new Date("2013/11/12"), 65);
		furia.setNombre("Furia");
		furia.setRaza("pura sangre");
		furia.setPeso(298);
		furia.setVelocidad(70);
		//
		System.out.println(spirit.getPeso());
		System.out.println(spirit.getFechaNacimiento());
		System.out.println(spirit);
		//
		System.out.println(furia.compite(spirit).getNombre());
		//
		Caballo ganador = furia.compite(spirit);
		System.out.println(ganador.getNombre() + "-" + ganador.getVelocidad());
		Caballo.Saludar();
	}

}
