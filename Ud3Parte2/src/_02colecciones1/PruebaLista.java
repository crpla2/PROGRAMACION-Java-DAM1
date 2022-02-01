package _02colecciones1;

// PruebaLista.java: prueba de la clase Lista

public class PruebaLista {
  public static void main(String args[]) {
	  
    Persona per1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Lista lista = new Lista();
    lista.insertar(per1);
    Persona per2 = new Persona(1234567, 23, "Juan", "Lopez Segura");
    lista.insertar(per2);
    lista.insertar(per1);
    System.out.println(lista);
    Persona per3 = lista.recuperar(1);
    per3.ponNombre("Pedro");
    System.out.println(lista);
 
    //prueba de borrado por posicion
    System.out.println(lista.borrarPersonaPosicion(1));
    System.out.println((lista.length()));
    System.out.println(lista);
    
    //prueba buscar por dni
    System.out.println(lista.buscarPorDni(4));
    System.out.println(lista.recuperar(lista.buscarPorDni(435762)));
    //o tambien
	int pos=lista.buscarPorDni(435762);
	System.out.println(lista.recuperar(pos));
	
	//prueba borrado por dni
	lista.borrarPersonaPorDni(435721);
	System.out.println(lista.length());
	System.out.println(lista);
	
	//prueba de busqueda por apellidos
	String encontrados=lista.buscarPorApellido("Lopez");
	if(encontrados.isEmpty())
		System.out.println("NO hay nadie con ese apellido ");
	else
		System.out.println(encontrados);
	
	//prueba de busqueda por apellidos utilizando un array
	Persona[] encontrado =new Persona[lista.length()];
	encontrado= lista.buscarPorApellido2("carrera");
	if(encontrado[0]==null)
		System.out.println("No hay nadie con ese apellido");
	else {
		int i=0;
		while (encontrado[i] != null) {
			System.out.println(encontrado[i]);
			i++;
		}
	}
  }
  
	  
}