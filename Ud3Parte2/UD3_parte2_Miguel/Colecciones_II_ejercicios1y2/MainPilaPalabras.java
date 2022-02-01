package Colecciones_II_ejercicios1y2;

public class MainPilaPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaPalabras2 p=new PilaPalabras2();
		p.apilarPalabra("Hola Buenos Dias");
		p.apilarPalabra("Hola Buenas Tardes");
		p.apilarPalabra("Hola Buenas Noches");
		System.out.println(p.desapilarPalabra());
		p.imprimir();
	}

}
