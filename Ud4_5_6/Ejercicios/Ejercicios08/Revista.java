package Ejercicios08;

public class Revista extends Biblioteca{
	private int numero;
	
		
	public Revista() {
		super();
		numero = 0;
	}

	public Revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero=numero;
		
	}

	@Override
	public String toString() {
		return super.toString()+", numero: "+numero+"\n";
	}
	
	

}
