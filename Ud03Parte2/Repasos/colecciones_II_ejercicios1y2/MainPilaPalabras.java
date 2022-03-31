package colecciones_II_ejercicios1y2;

public class MainPilaPalabras {

	public static void main(String[] args) {
		//PilaPalabras1 p = new PilaPalabras1();
		PilaPalabras2 p= new PilaPalabras2();
		System.out.println(p.pilaPalabrasVacia());
		p.apilarPalabra("Hola que tal");
		p.apilarPalabra("Bien gracias");
		p.apilarPalabra("me alegro por ti");
		p.imprimePila();

		p.desapilarPalabra();
		p.imprimePila();
		System.out.println(p.pilaPalabrasVacia());
		
		System.out.println(p.obtenerPalabraCima());
	}

}
