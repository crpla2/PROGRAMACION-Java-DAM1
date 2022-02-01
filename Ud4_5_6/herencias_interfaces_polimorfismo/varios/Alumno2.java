package varios;
// Alumno2.java: subclase Alumno con atributo de clase Persona

public class Alumno2 extends Persona {
  private int curso;
  private Persona profesor;

  // Constructor predeterminado
  public Alumno2() {
    super();
    curso = 1;
    profesor = null;
  }

  // Constructor parametrizado
  public Alumno2(long dni, int edad, String nombre,
                 String apellidos, int curso, Persona profesor) {
    super(dni, edad, nombre, apellidos);
    this.curso = curso;
    this.profesor = profesor;
  }

  // Constructor parametrizado
  public Alumno2(long dni, int edad, String nombre,
                 String apellidos, int curso) {
    super(dni, edad, nombre, apellidos);
    this.curso = curso;
    this.profesor = null;
  }

  // Accedentes

  public int dameCurso() { return curso; }

  public Persona dameProfesor() { return profesor; }

  // Mutadores

  public void ponCurso(int curso) { this.curso = curso; }

  public void ponProfesor(Persona profesor) { this.profesor = profesor; }

  // Otros métodos

  public String toString() {
    String cadena = "";
    cadena = super.toString() + "Curso: " + curso + "\n";
    cadena += "Profesor: ";
    if(profesor == null) cadena += "no asignado.";
    else cadena += profesor.nombreCompleto();
    cadena += "\n";
    return cadena;
  }

  public void leer() { // lectura de los datos del alumno
    super.leer();
    System.out.print("Curso: ");
    curso = MyInput.readInt();
  }
}
