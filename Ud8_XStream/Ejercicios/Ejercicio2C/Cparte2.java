package Ejercicio2C;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Cparte2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		XStream xstream = new XStream();
		xstream.alias("Departamentos", List.class);
		xstream.alias("Departamento", Departamento.class);

		ArrayList departamento = (ArrayList) xstream.fromXML(new FileReader("Fichero\\Departamento.xml"));

		System.out.println("Número de departamentos: " + departamento.size());
		
		Iterator iterador = departamento.listIterator();
		while (iterador.hasNext()) {
			Departamento p = (Departamento) iterador.next();
			System.out.println("Numero: "+p.getNumdepartamento()+", nombre: " + p.getNombre()+ ", localidad: " + p.getLocalidad());
		}
		System.out.println("Fin del listado....");
	}

}
