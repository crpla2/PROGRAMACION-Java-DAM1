package varios;
public class PruebaPerAl {
	public static void main(String args[]) {

	Per p = new Per();
	Al a = new Al();
	System.out.println("Constante de clase: "+ a.mensaje);
	System.out.println("Constante de clase: "+ p.mensaje);
	System.out.println("Constante de clase de manera estática: " + Per.mensaje);
	// p.mensaje="Pepe"; no se puede
	System.out.println("Contador de personas: " + p.dameContador());
}
}
