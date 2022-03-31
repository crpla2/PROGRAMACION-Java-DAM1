package _04_01ordenando_colecciones;
public class Person implements Comparable<Person> {
	
	private int idPersona;
    private String nombre;
    private int altura;

    public Person (int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;}

    @Override
    public String toString() {
        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura;}

    @Override
    public int compareTo(Person o) {
     /*
        if(altura<o.altura) 
     	  return -23; 
        else if(altura==o.altura)
     	   return 0;
        else
     	   return 66;
     */
     //return altura-o.altura;
     //return -(altura-o.altura); //ordenaría descendentemente como altura
     //--------------------------------------------------------------------
     return this.nombre.compareTo(o.nombre);
     //return -(nombre.compareTo(o.nombre)); //ordenaría descendentemente ordenado por nombre
    }

    public int getIdPersona() {return idPersona;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
}