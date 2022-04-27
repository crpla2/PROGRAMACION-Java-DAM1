package Colecciones_III_ej3y4;

import java.util.TreeSet;
import java.util.Objects;

public class TreeSetLibros{
  private TreeSet<Libro> lista;
  
  public TreeSetLibros() {
    lista = new TreeSet<Libro>(new LibroComparator());
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
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TreeSetLibros other = (TreeSetLibros) obj;
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
