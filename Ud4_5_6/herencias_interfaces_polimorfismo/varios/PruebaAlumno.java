package varios;
// PruebaAlumno.java: prueba de la clase Alumno

public class PruebaAlumno {
  public static void main(String args[]) {
    Alumno al1 = new Alumno(435762, 23, "Javier", "Hernandez Perez", 4);
    System.out.println(al1);
    Alumno al2 = new Alumno();
    al2.leer();
    System.out.println(al2);
    System.out.println(al2.nombreCompleto());
  }
}