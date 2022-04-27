package ejercicio3y4;



public class MainLibro {

	public static void main(String[] args) {
		Persona aut1= new Persona(12345678,33,"Pepe","Perez");
		Fecha fec1=new Fecha(1,1,1999);
		
		Libro l1 = new Libro();
		l1.leer();
		System.out.println(l1);
		System.out.println("********************");
		
		Libro l2= new Libro ("libro1", aut1,"isbn",300,3,"edicion1","lugar1",fec1);
		System.out.println(l2);
		
		
	}
		
}

//public Libro(String tit, Persona aut, String IS, int pag, int edi, String edit, String lug,Fecha fec ) {