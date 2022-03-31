package p152_ejercicio_1;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	public Alumno() {
		nombre="";
		apellidos="";
		dni="";
		edad=0;
	}

	public Alumno(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", edad: " + edad ;
	}
	
	
}
