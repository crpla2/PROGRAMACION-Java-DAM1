
package pregunta4;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import clases.Persona;
public class Pregunta4 {

	public static void main(String[] args) {
		TreeSet<Persona> lista = new TreeSet<Persona>();// hay que crear el treeset para ordenar la lista
//		ArrayList<Persona> lista = new ArrayList<Persona>();
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("Ficheros/Agenda.dat"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			while (true) {
				Persona p = (Persona) ois.readObject();
				lista.add(p);
			}
		} catch (EOFException e) {
			try {
				if(ois!=null)
				ois.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintWriter pr= new PrintWriter(new File("Ficheros/Agenda.txt"));
			for(Persona pe:lista) {
				pr.println(pe.getNombre()+"\t\t"+pe.getMovil()+"\t"+pe.getEmail());
			}
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
