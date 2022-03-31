package colecciones_II_ejercicios3y4;

public class Producto {
	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
	
	public Producto() {
	}

	public Producto(int codigo, String nombre, String tipo, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto: "+ nombre +
				"\n  codigo: "+ codigo +
				"\n  tipo: "+ tipo +
				"\n  precio: " + precio+
				"\n  stock: " + stock;
	}
	
	
	
	
	
}
