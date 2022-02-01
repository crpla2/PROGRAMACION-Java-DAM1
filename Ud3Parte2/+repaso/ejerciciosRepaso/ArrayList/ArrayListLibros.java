package ArrayList;

import java.util.ArrayList;




public class ArrayListLibros {
	  private ArrayList<Libro>biblioteca;
	  
	  public ArrayListLibros() {
		  biblioteca= new ArrayList<Libro>();
	    
	  }
	  public boolean vacia() {
		  return biblioteca.isEmpty();
	  }
	  public int length() { 
		  return biblioteca.size();
	  }
	  public boolean insertarOrden(Libro p) {
		
		  int i=0;
		  if(biblioteca.contains(p))
			 return false;
		 else			 
		  for(Libro l:biblioteca)
			  if(l.dameTitulo().compareToIgnoreCase(p.dameTitulo())<0) 
				  i++;
					biblioteca.add(i,p);
		 return true;
		
	  	  }
//	  public void insertarOrden(Libro p) {
//		  int i=0;
//		  for(Libro l:biblioteca)
//		  if((l.dameTitulo().compareToIgnoreCase(p.dameTitulo()))>0) 
//			  i++;
//		  				biblioteca.add(i,p);
//	  }
	  public int buscar(String parte) { // Devuelve posición
	  
		  for(Libro l:biblioteca)
			  if (l.dameTitulo().toLowerCase().contains(parte.toLowerCase()))
				  return biblioteca.indexOf(l)+1;
		  return -1; 
	  } 
	  public boolean existe(Libro p) {
		 return biblioteca.contains(p);
	  }
	  public boolean insertar(Libro p) {
		  if (existe(p))
			  return false;
		  else
			  biblioteca.add(p);
		  return true;	  
	  }
	  
	  public boolean eliminar(int pos) {
		 if(pos<1||pos-1>biblioteca.size()||!(existe(biblioteca.get(pos-1))))
			 return false;
		 
		 else
			 biblioteca.remove(pos-1);
		 return true;
	  }

	  public Libro recuperar(int pos) {
		  if(pos<1||pos-1>biblioteca.size()||!(existe(biblioteca.get(pos-1))))
			  return null;
		  
		  return biblioteca.get(pos-1);
	  }
	  public void ordenaPaginas() {
		 biblioteca.sort(new PaginasComparator()); }
	  
	  public String toString() {
		  String cadena="";
		  for(Libro l :biblioteca)
			  cadena+=l+"\n";
		  return cadena;
	    
	  }
}
