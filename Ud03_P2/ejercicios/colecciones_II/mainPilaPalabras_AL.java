package colecciones_II;

public class mainPilaPalabras_AL {

	public static void main(String[] args) {

		PilaPalabras_AL pila= new PilaPalabras_AL();
		
		System.out.println(pila.pilaPalabrasVacia());
		pila.apilarPalabra("hola");
		pila.apilarPalabra("que");
		pila.apilarPalabra("tal");
		System.out.println(pila.imprimir());
		System.out.println(pila.desapilarPalabra());
		System.out.println(pila.imprimir());
		System.out.println(pila.obtenerPalabraPila());
		System.out.println(pila.pilaPalabrasVacia());
	}

}
