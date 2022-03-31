package _03_01colecciones2;

public class MainPilaPalabras2 {

	public static void main(String[] args) {
		
		PilaPalabras2 p = new PilaPalabras2();
		
		System.out.println(p.pilaPalabrasVacia()+"\n");
		
		p.apilarPalabra("Buenos dias");
		p.apilarPalabra("Buenas tardes");
		p.apilarPalabra("Buenas noches");
		
		System.out.println(p.imprimir());
		
		System.out.println(p.desapilarPalabra()+"\n");
		
		System.out.println(p.imprimir());
		
		System.out.println(p.obtenerPalabraCima()+"\n");
		
		System.out.println(p.pilaPalabrasVacia());

	}

}
