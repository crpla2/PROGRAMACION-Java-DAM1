package Ejercicio3_S2;

public class Socio {
	private int id;
	private String nombre;
	private int estatura;
	private int edad;
	private String localidad;

	public Socio() {
		id=0;
		nombre="";
		estatura=0;
		edad=0;
		localidad="";
	}
	public Socio(int id, String nombre, int estatura, int edad, String localidad) {
		this.id = id;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Id:" + id + "| Nombre:" + nombre + "| Estatura:" + estatura + "| Edad:" + edad + "| Localidad="
				+ localidad ;
	}

}
