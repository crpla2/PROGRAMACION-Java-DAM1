package Examen2_2_OBD;
public class Main {

	public static void main(String[] args) {
		
		AccesoBOODatos abd = new AccesoBOODatos();
		
		abd.conectar();
//		abd.datosIniciales();	
		
//		System.out.println(abd.insertarPais(new Pais(2, "Suiza"))); // false
//		System.out.println(abd.insertarPais(new Pais(5, "Aragón"))); // true
		
		abd.imprimirJugadoresPais(6);
		abd.imprimirJugadoresPais(4);
		abd.imprimirJugadoresPais(2);
		abd.desconectar();
	}

}
