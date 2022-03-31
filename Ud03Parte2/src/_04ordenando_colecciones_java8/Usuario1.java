package _04ordenando_colecciones_java8;
public class Usuario1  {
 private String nombre;
 private int edad;
 Usuario1(String nombre, int edad) {
 this.nombre = nombre;
 this.edad = edad;
 }
 public String getNombre() {
 return nombre;
 }
 public int getEdad() {
 return edad;
 }
 public String toString() {
 return nombre + " (" + edad + ")";
 }
 public void mostrarDatos() {
	 System.out.println(nombre + " - " + edad + " años");
 }
}