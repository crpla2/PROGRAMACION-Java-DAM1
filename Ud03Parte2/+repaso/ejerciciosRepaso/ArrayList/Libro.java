package ArrayList;

import java.util.Objects;

public class Libro {
  private String titulo;
  private String autor;
  private String isbn;
  private int paginas;
  
 

 
  @Override
public int hashCode() {
	return Objects.hash(isbn);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Libro other = (Libro) obj;
	return Objects.equals(isbn, other.isbn);
}
public Libro() {
       titulo =new String("");
       autor = "";
       isbn = new String("");
       paginas = 0;
     
 }
 public Libro(String t, String p, String i, int pa)
              {
            	
       titulo =t;
       autor = p;
       isbn = i;
       paginas = pa;
      
      
 }

  
  
  public String dameTitulo() { return titulo; }
  public String dameAutor() { return autor; }
  public int damePaginas() { return paginas; }
 
  
  public void ponTitulo(String titulo) { this.titulo = titulo; }
  public void ponAutor(String autor) { this.autor = autor; }
  //....
  
  
  public String toString() {
    return titulo+", "+autor+", "+ paginas+", "+isbn;
    }
 


}
