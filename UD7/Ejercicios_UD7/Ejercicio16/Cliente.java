package Ejercicio16;

public class Cliente {
	String nombre;
	String telefono;
	String direccion;
	String nif;
	boolean moroso;
	
	public Cliente(String nombre, String telefono, String direccion, String nif, boolean moroso) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nif = nif;
		this.moroso = moroso;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", nif=" + nif
				+ ", moroso=" + moroso + "]";
	}
	
	

}
