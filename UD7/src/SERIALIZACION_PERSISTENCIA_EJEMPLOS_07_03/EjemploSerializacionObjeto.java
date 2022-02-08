package SERIALIZACION_PERSISTENCIA_EJEMPLOS_07_03;

import java.io.*;
import java.util.Date;
public class EjemploSerializacionObjeto {
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("D:\\prueba.txt");
			ObjectOutputStream sos = new ObjectOutputStream(fos);
			sos.writeObject("Hoy es");
			sos.writeObject(new Date());
			sos.close();
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
