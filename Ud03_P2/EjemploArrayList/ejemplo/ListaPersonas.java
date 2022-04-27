package ejemplo;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas {

	ArrayList<Persona> lista;

	public ListaPersonas() {
		lista = new ArrayList<Persona>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
		// return lista.size()==0;
		return lista.isEmpty();
	}

	public boolean insertar(Persona p) {
		return lista.add(p);

	}
	
	public Persona recuperar(int posicion) {
		if(posicion<1||posicion>lista.size())
			return null;
		else
		return lista.get(posicion-1);
	}
	
	public Persona borrarPersonaPosicion(int posicion) {
		if(posicion<1||posicion>lista.size())
			return null;
		else
			return lista.remove(posicion-1);
	}
	
	public int buscarPorDni(long num) {
		 for(int i=0; i<lista.size();i++) {
			 if(lista.get(i).dameNif().dameDni()==num) 
				 return i+1;
		 }
		 
		 return -1;//no lo he encontrado
	}
	
	public Persona borrarPersonaPorDni(long num) {
		int posicion=buscarPorDni(num);
		if (posicion==-1)
			return null;
		else
			return borrarPersonaPosicion(posicion);	
	}
	
	public String buscarPorApellido(String apellido) {
		String cadena="";
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase()))
			cadena=cadena+lista.get(i);
		}
		return cadena;
	}
	
	public ArrayList<Persona> buscarPorApellido2(String apellido) {
		ArrayList<Persona> encontrados= new ArrayList<Persona>();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase()))
			encontrados.add(lista.get(i));
		}
		return encontrados;
	}

	@Override
	public String toString() {
		String cadena = "";
		// ****1ºforma****
		// for(int i=0; i<lista.size();i++) {
		// cadena= cadena + lista.get(i);
		// }

		// ****2ºforma****
		// for(Persona p:lista) {
		// cadena=cadena+p;
		// }

		// ****3ºforma****
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			cadena=cadena+it.next();
		}
		return cadena;
	}

//

}// de ListaPersonas
