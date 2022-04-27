package Ejercicios;
import java.text.ParseException;

public class Main2Ej {

	public static void main(String[] args) throws ParseException {
        
		AccesoBdatosEj abd = new AccesoBdatosEj();
		abd.conectar();

		abd.Ejercicios();
		
		abd.desconectar();
	

	}

}

