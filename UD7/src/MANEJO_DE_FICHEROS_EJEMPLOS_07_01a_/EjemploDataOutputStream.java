package MANEJO_DE_FICHEROS_EJEMPLOS_07_01a_;

import java.io.*;
public class EjemploDataOutputStream {
	public static void main (String[] args) throws IOException{
		FileOutputStream fileout = new FileOutputStream("D:\\datos.dat");
		DataOutputStream dataOS=new DataOutputStream(fileout);
		String nombres[]={"Oscar", "Pablo", "Eva", "Alberto", "Ángel"};
		int edades[]={25, 26, 27, 28,32};
		for (int i=0; i<edades.length;i++){
			dataOS.writeUTF(nombres[i]);
			dataOS.writeInt(edades[i]);		
		}
		dataOS.close();
		
	}
}
