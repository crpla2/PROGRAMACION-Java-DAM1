package ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;
public class PruebaPerson {
    public static void main(String arg[]) {
    	//Person p1,p2,p3;
        ArrayList<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas.add(new Person(1,"Maria",185));
        listaPersonas.add(new Person(2,"Carla",190));
        listaPersonas.add(new Person(3,"Yovana",170));
        //System.out.println(p1.compareTo(p2));
        Collections.sort(listaPersonas);  // Ejemplo uso ordenación natural
        System.out.println("Personas Ordenadas por orden natural: "+listaPersonas);
      } 
}