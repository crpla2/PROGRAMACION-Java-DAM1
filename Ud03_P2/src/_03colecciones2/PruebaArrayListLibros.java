package _03colecciones2;
// PruebaListaLibros.java: prueba de la clase ArrayListLibros


public class PruebaArrayListLibros {
  public static void main(String args[]) {
  	Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Fecha f1 = new Fecha(16,11,2001);
    Libro l1 = new Libro("Introducción a Java",p1, 
                         "0-13-031997-X",546,3,"Prentice-Hall","Madrid-España",f1);
                         
    Libro l2 = new Libro("Beginning Java",p1, 
                         "0-13-031997-X",546,3,"Addison","Madrid-España",f1);                     
    Libro l3 = new Libro("Avanzado Java",p1, 
                         "0-13-031997-X",546,3,"McGraw-Hill","Madrid-España",f1);
    
                     
    
    ArrayListLibros a= new ArrayListLibros();
    a.insertarOrden(l1);
    a.insertarOrden(l2);
    a.insertarOrden(l3);
  
  System.out.println(a);
    
 /*   int indice=a.buscar("AVANZADO");
    System.out.println(indice+1);
    if (indice != -1)  {
    	            l3 = a.recuperar(indice+1);
    	            System.out.println(l3);
                }
    else
     System.out.println("No encontrado"); 
    
  /*  a.eliminar(2);
    System.out.println("Tras eliminar el 2 \n");
    System.out.println(a);*/
  }
}