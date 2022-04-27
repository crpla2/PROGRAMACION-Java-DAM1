package _05hashset;

import java.util.*; 
public class MercadoHashSet 
{ 
public static void main(String args[]) 
{
// Definir 5 instancias de la Clase Producto 
Producto pan = new Producto("Pan", 6); 
Producto leche = new Producto("Leche", 2); 
Producto manzanas = new Producto("Manzanas", 5); 
Producto brocoli = new Producto("Brocoli", 2); 
Producto carne = new Producto("Carne", 2); 
Producto res = new Producto("Carne", 3); 

// Definir un HashSet 
HashSet<Producto> lista = new HashSet<Producto>(); 
lista.add(pan); 
lista.add(leche); 
lista.add(manzanas); 
lista.add(brocoli); 
lista.add(carne); 
lista.add(res); 
lista.add(new Producto ("Brocoli", 33));

// Imprimir contenido de HashSet 
// Aunque son insertados 7 elementos, el HashSet solo contiene 5 
// Se debe a que un Set no permite elementos duplicados. 

System.out.println(" Lista del mercado con " + lista.size() + 
" productos"); 

// Definir Iterator para extraer e imprimir valores 

for( Iterator<Producto> it = lista.iterator(); it.hasNext(); ) {
 Producto producto = it.next();
System.out.println(producto);
} 

// No es posible eliminar elementos por indice 
// En un HashSet solo se elimina por valor de Objeto 

lista.remove(manzanas); 
System.out.println(" Lista del mercado con " + lista.size() + 
" productos"); 

for( Iterator<Producto> it = lista.iterator(); it.hasNext(); ) {
	 Producto producto = it.next();
	
	 System.out.println(producto);
	} 

// Eliminar todos los valores 
lista.clear(); 
System.out.println(" Lista del mercado con " + lista.size() + 
" productos");
}
} 