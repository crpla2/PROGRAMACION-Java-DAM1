package _05_02hashSetPersonas;

public class PruebaLista {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		l.insertar(new Persona(1234567,31,"Luis","Aldea Navarro"));
		l.insertar(new Persona(2345678,39,"Belén","Carrera Sausán"));
		l.insertar(new Persona(3456789,61,"Antonino","Lasierra Gardena"));
		l.insertar(new Persona(4567890,42,"Alberto","Carrera Martín"));
		l.insertar(new Persona(5678901,38,"Ana","Ereza Ferrer"));
		l.insertar(new Persona(5678901,34,"Askdjfk","Fsdfgsd Lwgdsf"));
		
		//System.out.println(l.tamanyo());
		//System.out.println(l.vacia());
		//System.out.println(l);
	
		//System.out.println(l.buscarPorDni(2222222));
		//System.out.println(l.buscarPorDni(4567890));
		
		//System.out.println(l.borrarPersonaPorDni(333333));
		//System.out.println(l.borrarPersonaPorDni(1234567));
		//System.out.println(l.tamanyo());
		//System.out.println(l);
		
		System.out.println(l.buscarPorApellido("Carre"));
		String encontrados=l.buscarPorApellido("an");
		if (encontrados.isEmpty())
			System.out.println("No existe nadie con el apellido 'an'");
		else
			System.out.println(l.buscarPorApellido(encontrados));
		
		
		//System.out.println(l.buscarPorApellido2("aa"));
		
		/*Lista l2 = new Lista(l.buscarPorApellido2("Carre"));
		System.out.println(l2);
		*/
	}
}
