package _02colecciones1;

// PruebaLista.java: prueba de la clase Lista

public class PruebaListaOld {
  public static void main(String args[]) {
    Persona per1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    ListaOld lista = new ListaOld();
    lista.insertar(per1);
    Persona per2 = new Persona(1234567, 23, "Juan", "Lopez Segura");
    lista.insertar(per2);
    lista.insertar(per1);
    System.out.println(lista);
    Persona per3 = lista.recuperar(1);
    per3.ponNombre("Pedro");
    System.out.println(lista);
 
  }
}