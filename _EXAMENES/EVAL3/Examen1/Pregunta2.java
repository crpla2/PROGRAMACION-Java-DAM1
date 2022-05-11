package Examen1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;



public class Pregunta2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Ficheros/Agenda.dat"));

		try {
			while (true) {
				Persona p = (Persona) ois.readObject();
				lista.add(p);
			}
		} catch (EOFException e) {
			ois.close();
		}
		
		XStream xs= new XStream(new DomDriver("UTF-8"));
		xs.alias("Agenda_Personal", List.class);
		xs.alias("Datos_Contacto", Persona.class);
		xs.toXML(lista,new FileOutputStream("Ficheros/Agenda.xml"));
		
		}

}
