package Ejercicios04_06_String;

public class Ejercicio_04 {

	public static void main(String[] args) {
		String texto="En un lugar de la Mancha de cuyo nombre no quiero acordarme.";
		String buscar="Mancha";
		String reemplazar="Aragon";
		String texto2=texto.replaceAll(buscar, reemplazar);
		System.out.println(texto2);
		
		

	}

}
