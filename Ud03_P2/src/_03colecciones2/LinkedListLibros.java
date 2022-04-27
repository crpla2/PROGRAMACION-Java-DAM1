package _03colecciones2;
import java.util.LinkedList;;

// Repaso LinkedList

public class LinkedListLibros {
  // private final static int MAX = 100; no tiene sentido....
  private LinkedList<Libro> lista;
  
  public LinkedListLibros() {
    lista = new LinkedList<Libro>();
  }

 // public boolean llena() { return ... no tiene sentido }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }

  public boolean insertarOrden(Libro p) {
  
    int i=0;
	boolean encontrado=false;
    while ((i<lista.size()) && (!encontrado)){
    	encontrado=(lista.get(i).dameTitulo().compareTo(p.dameTitulo()))>0;
    	if (!encontrado) i++;
    }	
    lista.add(i, p);
    return true;
  }
  
  
  public int buscar(String parte) { // Devuelve índice, no posición
  
    
    int i=0;
    boolean encontrado=false;
    while ((i<lista.size())&&(!encontrado)){
   	if ((lista.get(i).dameTitulo().toUpperCase().indexOf(parte.toUpperCase()))!=-1) 
    		encontrado=true;
    	else i++;
    }	
    if (encontrado) return i;
    else return -1;
    
  }
  
  
  public boolean insertar(Libro p) {
  
    lista.add(p);
    return true;
  }
  
  public boolean eliminar(int pos) {
	 if((pos < 1) || (pos > lista.size()) || (vacia()))
			  return false;
	 else
	 {
		 lista.remove(pos-1);
		 return true;
	 }
  }

  public Libro recuperar(int pos) {
  
    if((pos < 1) || (pos > lista.size())) return null;
    return lista.get(pos-1);
  }

  public String toString() {
    String cad = lista.size() + " Elementos de la lista:\n\n";
    for(int i = 0; i < lista.size(); i++)
      cad += lista.get(i) + "\n";
    return cad;
  }
}