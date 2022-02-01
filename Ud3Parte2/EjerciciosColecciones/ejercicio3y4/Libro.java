package ejercicio3y4;
// Libro.java: una clase para representar libros

public class Libro {
  private String titulo;
  private Persona autor;
  private String isbn;
  private int paginas;
  private int edicion;
  private String editorial;
  private String lugar;
  private Fecha fechaEdicion;

  // Constructor predeterminado
  public Libro() {
       titulo ="";
       autor = new Persona();
       isbn = "";
       paginas = 0;
       edicion = 0;
       editorial = "";
       lugar = "";
       fechaEdicion = new Fecha();
 }
 public Libro(String t, Persona p, String i, int pa,
              int e, String ed, String l, Fecha f){
            	
       titulo =t;
       autor = p;
       isbn = i;
       paginas = pa;
       edicion = e;
       editorial = ed;
       lugar = l;
       fechaEdicion = f;
 }

  
  // Accedentes
  public String dameTitulo() { return titulo; }
  public Persona dameAutor() { return autor; }
  public String dameIsbn() {return isbn;	}
  public int damePaginas() {return paginas;}
  // .....

  // Mutadores
  public void ponTitulo(String titulo) { this.titulo = titulo; }
  public void ponAutor(Persona autor) { this.autor = autor; }
  public void ponIsbn(String isbn) { this.isbn = isbn;}
  public void ponPaginas(int paginas) {this.paginas = paginas;}
  
	// ..... 
  public String toString() {
    return  ("Titulo :" +titulo  + "\n"  +edicion+"a. edicion\n"+
              "Autor : " + autor  + 
              "ISBN  : " + isbn  + "\n" +
              editorial + ", "+ lugar + ", " + fechaEdicion  +"\n"+
              paginas +" paginas");
    }
  public String toString2() {
	    return  ("Titulo :" +titulo  + "\n"  +edicion+"a. edicion\n"+
	              "Autor : " + autor.dameNombre()  + "-"+autor.dameApellidos()+"\n"+
	              "ISBN  : " + isbn  + "\n" +
	              editorial + ", "+ lugar + ", " + fechaEdicion  +"\n"+
	              paginas +" paginas");
	    }
 
public void leer() {
	System.out.println("Introduce el título ");
	titulo=MyInput.readString();
	System.out.println("Introduce el autor ");
	autor.leer();
	System.out.println("Introduce el Isbn");
	isbn=MyInput.readString();
	System.out.println("Introduce las páginas");
	paginas=MyInput.readInt();
	System.out.println("Introduce la edición");
	edicion=MyInput.readInt();
	System.out.println("Introduce la editorial");
	editorial=MyInput.readString();
	System.out.println("Introduce el lugar");
	lugar=MyInput.readString();
	System.out.println("Introduce el la fecha de edición");
	fechaEdicion.leer();
}

}// de la clase libro
