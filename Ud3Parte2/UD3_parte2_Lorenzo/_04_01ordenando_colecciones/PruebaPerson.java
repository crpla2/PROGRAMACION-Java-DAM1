package _04_01ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;
public class PruebaPerson {
    public static void main(String arg[]) {
        ArrayList<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas.add(new Person(1,"Maria",185));
        listaPersonas.add(new Person(2,"Carla",190));
        listaPersonas.add(new Person(3,"Yovana",170));
        System.out.println(listaPersonas.get(0).compareTo(listaPersonas.get(1))); //Compara el atribúto que ponemos en el método
        Collections.sort(listaPersonas);  // Ejemplo uso ordenación natural
        System.out.println("Personas Ordenadas por orden natural: "+listaPersonas);
      } 
}