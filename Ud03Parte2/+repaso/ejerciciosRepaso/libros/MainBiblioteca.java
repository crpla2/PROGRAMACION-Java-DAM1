package libros;

import java.util.Date;

public class MainBiblioteca {

	public static void main(String[] args) {
		Libro l1=new Libro("A","M",200,new Date ("1980/02/07"),"12345b");
		Libro l2=new Libro("Bedel","Mi",220,new Date ("1999/03/10"),"12345c");
		Libro l3=new Libro("C","Mich",150,new Date ("2011/04/27"),"12345d");
		Libro l4=new Libro("D","Michael Ende",100,new Date ("1980/06/17"),"12345e");
		Libro l5=new Libro("El Señor de los anillos","Mich",560,new Date ("2019/12/19"),"12345f");
		Libro l6=new Libro("F","Mi",230,new Date ("2001/01/17"),"12345bg");
		Libro l7=new Libro("G","Me",110,new Date ("1780/12/7"),"12345bh");
		
//		Biblioteca bi =new Biblioteca();
//		BibliotecaTree bi=new BibliotecaTree();
		BibliotecaHash bi=new BibliotecaHash();
		bi.insertar_(l2);
		bi.insertar_(l7);
		bi.insertar_(l6);
		bi.insertar_(l5);
		bi.insertar_(l4);
		bi.insertar_(l3);
		bi.insertar_(l1);
		bi.ordenas("fec");
//		bi.insertar(4,l1);
//		System.out.println(bi.insertar_(l7));
//		bi.imprimir();
//		System.out.println("...........................");
//		bi.ordena();
//		bi.imprimir();
//		System.out.println("..............................");
////		bi.ordenaFecha();
////		bi.imprimir();
////		System.out.println("..............................");
////		bi.ordenaPaginas();
////		bi.imprimir();
//		System.out.println(bi.obtener(bi.buscar("e")));
//		bi.buscar("a");
//		System.out.println(bi.tamanyo());
//		System.out.println(bi.insertar_(l7));
//		System.out.println(bi.eliminar(l7));
//		System.out.println(bi.tamanyo());
//		System.out.println(bi.existe(l7));
//		System.out.println(bi.insertar_(l7));
//		System.out.println(bi.tamanyo());
//		bi.imprimir();
		
		
		}

}
