package Ejercicio2C;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class A {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream salida= null;
		Departamento dep,dep2,dep3,dep4;
		
		try {
			fos= new FileOutputStream("Fichero/departamentos.dat");
		
		salida= new ObjectOutputStream(fos);
		dep= new Departamento(1, "Informática","Huesca");
		dep2= new Departamento(2, "Administración", "Zaragoza");
		dep3= new Departamento(3, "Informática", "Zaragoza");
		dep4= new Departamento(4, "Administración","Huesca");
		salida.writeObject(dep);
		salida.writeObject(dep2);
		salida.writeObject(dep3);
		salida.writeObject(dep4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos.close();
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
