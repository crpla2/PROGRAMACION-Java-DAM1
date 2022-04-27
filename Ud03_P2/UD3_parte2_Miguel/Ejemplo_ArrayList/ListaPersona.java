package Ejemplo_ArrayList;
import java.util.ArrayList;
//import java.util.Iterator;

public class ListaPersona {
	
	ArrayList<Persona> lista;

	public ListaPersona() {
		lista = new ArrayList<Persona>();
	}

	public int tamanyo() {
		return lista.size();
	}
	
	public boolean vacia() {
		//return lista.size()==0;
		return lista.isEmpty();
	}
	
	public boolean insertar(Persona p) {
		return lista.add(p);
	}
	
	public Persona recuperar(int pos) {
		if(pos<1||pos>lista.size()) 
			return null;
		return lista.get(pos-1);
		
	}
	
	public Persona borrarPersonaPosicion(int pos) {
		if (pos<1||pos>lista.size())
			return null;
		return lista.remove(pos-1);
	}
	
	public int buscarPorDni(long num) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).dameNif().dameDni()==num)
				return i+1;
		}
		return -1;
	}
	
	public Persona borrarPersonaPorDni(long num) {
		int pos= buscarPorDni(num);
		return borrarPersonaPosicion(pos);
	}
	
	public String buscarPorApellido(String apellido) {
		String cad="";
		for (Persona persona : lista) {
			if(persona.dameApellidos().toLowerCase().contains(apellido.toLowerCase()))
				cad+=persona.dameNombre()+" "+persona.dameApellidos()+"\n";
		}
		return cad;
	}
	
	public ArrayList<Persona> buscarPorApellido2(String apellido){
		ArrayList<Persona> encontrados=new ArrayList<Persona>();
		for (Persona persona : lista) {
			if(persona.dameApellidos().toLowerCase().contains(apellido.toLowerCase()))
				encontrados.add(persona);
		}
		return encontrados;
	}
	
	public String toString() {
		String cad="";
		for (int i = 0; i < lista.size(); i++) {
			cad+=lista.get(i)+"===========================\n";
		}
		/*
		for (Persona p : lista) {
			cad+= p+"=======================\n";
		}
		*/
		/*
		Iterator<Persona> it =lista.iterator();
		while(it.hasNext()) {
			cad+=cad+it.next()+"===========================\n";
		}
		*/
		return cad;
	}
	
}
