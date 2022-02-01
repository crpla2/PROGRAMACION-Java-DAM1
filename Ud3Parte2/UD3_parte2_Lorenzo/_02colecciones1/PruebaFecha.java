package _02colecciones1;

class PruebaFecha {
  public static void main(String args[]) {
      Fecha f = new Fecha();
      System.out.println(f);
	  f =  new Fecha (12,11,2019);
	  System.out.println(f);
	  f =  new Fecha (31,11,2019); // No existe
	  System.out.println(f);  // Lo "arregla"
	  f =  new Fecha (12,11,2019);
	  System.out.println(f.dia());
	  System.out.println(f.diaSemana());
	  f.larga();
	  System.out.println(f.diasEntre(new Fecha(20,12,2019)));
	  f.leer();
	  f.larga();
  }
}