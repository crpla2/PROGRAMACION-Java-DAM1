package Colecciones_I_ejercicios;

public class MainCD {

	public static void main(String[] args) {
		Cancion c1= new Cancion("Sirena Varada","Heroes del Silencio");
		Cancion c2= new Cancion("It´s a long way","AC/DC");
		Cancion c3= new Cancion("Kualquier Dia","Kaotiko");
		CD disco= new CD();
		disco.agregaCancion(c1);
		disco.agregaCancion(c2);
		disco.agregaCancion(c3);
		//int numCanciones= disco.numeroCanciones();
		//System.out.println(numCanciones+" canciones");
		//Cancion song= disco.dameCancion(1);
		//System.out.println(song);
		//System.out.println(disco.dameCancion(3));
		//disco.grabaCancion(c2, 3);
		//System.out.println(disco.dameCancion(3));
		disco.agregaCancion(c3);
		System.out.println(disco);
		disco.eliminaCancion(2);
		System.out.println(disco);
	}

}
