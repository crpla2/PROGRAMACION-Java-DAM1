package varios;
/* Nota Alberto para esta prueba he añadido el siguiente
 método a la clase Lista
 
 public int cuentaAlumnos() {
	  int cuentaAlumnos=0;
	  for(int i = 0; i < _cont; i++)
		  if (_array[i] instanceof Alumno)
			  cuentaAlumnos++;
	return cuentaAlumnos;
  }
   
 */

public class PruebaLista {

	public static void main(String[] args) {
		Persona p= new Persona (18022503, 40, "Juan", "Soler");
		Alumno a = new Alumno(18022504, 19, "Pedro", "Sanz",2);
		Lista lista = new Lista();
		lista.insertar(p);
		lista.insertar(a);
		lista.insertar(new Persona(18022500, 20, "Luis", "Salcedo"));
		lista.insertar(new Alumno(18022501, 18, "Ana", "Giménez", 2));
		lista.insertar(new Alumno(18022502, 19, "Isabel", "Martínez", 2));
		System.out.println(lista);
		System.out.println("Total de elementos: " +lista.length());
		//System.out.println("Total de alumnos: " + (lista.cuentaAlumnos()));
		p=a; //Vale
		//a=p; No vale
		
		System.out.println(p);
	}

}
