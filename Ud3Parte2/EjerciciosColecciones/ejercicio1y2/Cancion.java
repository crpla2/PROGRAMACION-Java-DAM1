package ejercicio1y2;

public class Cancion {

	private String titulo;
	private String autor;
	
	public Cancion(String tit, String aut) {
		titulo = tit;
		autor = aut;
	}
	public Cancion() {
		titulo="";
		autor="";
			}
	
//
	public String dameTitulo() {
		return titulo;
	}
	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String dameAutor() {
		return autor;
	}
	public void ponAutor(String autor) {
		this.autor = autor;
	}
//
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
}//de la clase cancion
