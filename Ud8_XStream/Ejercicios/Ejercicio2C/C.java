package Ejercicio2C;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class C {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream dataIS=new ObjectInputStream( new FileInputStream("Fichero\\departamentos.dat"));
		System.out.println("Comienza el proceso de creación del fichero XML..");
		ArrayList<Departamento> listadep=new ArrayList<Departamento>();
		try {
			while(true) {
				Departamento departamento= (Departamento) dataIS.readObject();
				listadep.add(departamento);
			}
		} catch (EOFException e) {
			dataIS.close();
			System.out.println("-- Fichero leido --");
		}
		XStream xstream = new XStream();
		xstream.alias("Departamentos",List.class);
		xstream.alias("Departamento",Departamento.class);
	    xstream.toXML(listadep, new FileOutputStream ("Fichero\\Departamento.xml"));
		System.out.println("-- Fichero XML creado --");
	}

}
