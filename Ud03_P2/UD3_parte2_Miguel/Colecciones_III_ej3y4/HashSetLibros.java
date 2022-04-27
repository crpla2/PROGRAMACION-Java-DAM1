package Colecciones_III_ej3y4;

import java.util.HashSet;
import java.util.Objects;

public class HashSetLibros {
  private HashSet<Libro> lista;
  
  public HashSetLibros() {
    lista = new HashSet<Libro>();
  }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }
  
  
  public boolean insertar(Libro p) {
	  return lista.add(p);
  }
  
  public boolean eliminar(Libro l) {
	  return lista.remove(l);
  }

  public boolean contiene(Libro l) {
	  return lista.contains(l);
  }
  public void contieneTitulo(String titulo) {
	  for (Libro libro : lista) {
		if(libro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
			System.out.println(libro);
	}
  }

@Override
public int hashCode() {
	return Objects.hash(lista);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HashSetLibros other = (HashSetLibros) obj;
	return Objects.equals(lista, other.lista);
}
public void imprimir() {
	for (Libro libro : lista) {
		System.out.println(libro);
	}
}
@Override
public String toString() {
	return "HashSetLibros [lista=" + lista + "]";
}
 
}
