package p152_ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListAlumnos {
	ArrayList<Alumno> lista;

	public ArrayListAlumnos() {
		lista = new ArrayList<Alumno>();
	}

	public String buscarApellido(String apellido) {
		String cadena = "";
		for (Alumno a : lista)
			if (a.getApellidos().toLowerCase().contains(apellido.toLowerCase()))
				cadena += a + "\n-------------------------\n";
		return cadena;
	}

	public boolean existe(Alumno alumno) {
		for (Alumno a : lista)
			if (a.getDni().compareToIgnoreCase(alumno.getDni())==0)
				return true;
		return false;
	}

	public int buscarPosicion(Alumno alumno) {
		for (Alumno a : lista)
			if (existe(alumno))
				return lista.indexOf(a) + 1;
		return -1;
	}

	public boolean agregar(Alumno alumno) {
		for (Alumno a : lista)
			if (a.equals(alumno))
				return false;
		return lista.add(alumno);
	}

	public Alumno eliminarPorPosicion(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		return lista.remove(posicion-1);

	}

	public void ordenarApellidos() {
		Collections.sort(lista, new ApellidosComparator());
	}
	public void ordenarEdad() {
		Collections.sort(lista, new EdadComparator());
	}
	public void imprimir() {
		for(Alumno a:lista)
			System.out.println(a+"\n*******************************************");
	}

	@Override
	public String toString() {
		String cadena="";
		for(Alumno a:lista)
			cadena+=a+"\n........................................................\n";
		return cadena;
	}
	
	
}

