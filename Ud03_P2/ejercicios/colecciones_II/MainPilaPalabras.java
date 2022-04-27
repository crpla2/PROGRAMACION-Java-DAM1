package colecciones_II;

public class MainPilaPalabras {

	public static void main(String[] args) {
		
		PilaPalabras p =new PilaPalabras();
		
		System.out.println(p.pilaPalabrasVacia());
		p.apilarPlabra("hola");
		p.apilarPlabra("que");
		p.apilarPlabra("tal");
		System.out.println(p.imprimepPila());
		System.out.println(p.desabilarPalabra());
		System.out.println(p.imprimepPila());
		System.out.println(p.ObtenerPalabraPila());
		System.out.println(p.pilaPalabrasVacia());
	}
	

}
