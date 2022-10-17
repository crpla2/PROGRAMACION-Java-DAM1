package buscaminas;

public class Main {

	public static void main(String[] args) {
		int casillas = 64;
		int numMinas = 10;
		int posicion = 15;
		int filasTablero = 8;
		
		buscaminas juego= new buscaminas(casillas, numMinas, posicion, filasTablero);
		juego.generaTablero(casillas, numMinas);
		System.out.println(juego.descubreCasillas(posicion, filasTablero));
	//	System.out.println(juego.descubreCasillas(64, filasTablero));
		
		
//		tableroMinado=generaTablero(casillas, numMinas);
//		int[] resultado = casillasAdyacentes(posicion, filasTablero);
//
//		for (int i = 0; i < resultado.length; i++) {
//			System.out.println(resultado[i]);
//			;
//
//		}
//		System.out.println(tableroMinado);
//		
//		
//		descubreCasillas(posicion);
//		
//	}
}

}
