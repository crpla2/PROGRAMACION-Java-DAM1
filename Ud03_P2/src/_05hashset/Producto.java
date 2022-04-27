package _05hashset;

public class Producto { 

private String nombre; 
private int cantidad; 

public Producto(String s, int i) {
nombre = s;
cantidad = i;
} 

public String toString(){
return ("Nombre: "+nombre+" Cantidad: "+cantidad);
} 

public String getNombre() {
return this.nombre;
} 

public boolean equals( Object objeto ) {
if (objeto == null) return false; 

Producto producto = (Producto)objeto; 
if (this.getNombre().equals(producto.getNombre()) )
return true;

return false;
} 

public int hashCode() {
return this.getNombre().hashCode();
}

} 