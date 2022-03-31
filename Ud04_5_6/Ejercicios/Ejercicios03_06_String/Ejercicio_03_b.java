package Ejercicios03_06_String;

public class Ejercicio_03_b {

	public static void main(String[] args) {
		
		String cadena="Carlos Rodrigo Pla";
		String []c=  cadena.split(" ");
		for(String trozo:c)
			System.out.println(trozo);
	}

}
