package _04ordenando_colecciones_java8;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class PruebaUsuario1 {

	public static void main(String[] args) {
		ArrayList<Usuario1> lista = new ArrayList<Usuario1>();
		
		 lista.add(new Usuario1("uno", 11));
		 lista.add(new Usuario1("dos", 2));
		 lista.add(new Usuario1("tres", 3));
		 lista.add(new Usuario1("cuatro", 44));
		 System.out.println("\n Imprimo el objeto lista directamente:");
         System.out.println(lista);
		 System.out.println("\n Ahora ordenados por nombre...");
		 lista.stream().sorted((x,y) -> x.getNombre().compareToIgnoreCase(y.getNombre())).forEach(y->y.mostrarDatos());
		 System.out.println("\n y ahora ordenados por edad...");
		 lista.stream().sorted((x,y) -> x.getEdad()-y.getEdad()).forEach(y->y.mostrarDatos());
		 System.out.println("\n y ahora LOS DEJO DEFINITIVAMENTE ORDENADOS POR NOMBRE...");
		 lista = lista.stream().sorted((x,y) -> x.getNombre().compareToIgnoreCase(y.getNombre())).collect(Collectors.toCollection(ArrayList::new));	
		 System.out.println(lista);
	}
}