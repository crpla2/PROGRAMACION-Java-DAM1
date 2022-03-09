import java.io.*;
import com.thoughtworks.xstream.XStream;

public class Escribirpersonas {
	public static void main (String[] args) throws IOException, ClassNotFoundException{
		File fichero = new File ("Fichero\\FichPersona.dat");
		FileInputStream filein= new FileInputStream(fichero);
		ObjectInputStream dataIS=new ObjectInputStream(filein);
		System.out.println("Comienza el proceso de creación del fichero XML..");
		ListaPersonas listaper=new ListaPersonas();
		try{
			while(true){
				Persona persona=(Persona) dataIS.readObject();
				listaper.add(persona);
			}
		} catch (EOFException eo){}
		dataIS.close();
		try{
			XStream xstream = new XStream();
			xstream.alias("ListaPersonasMunicipio",ListaPersonas.class);
		    xstream.alias("DatosPersona", Persona.class);
		    xstream.addImplicitCollection(ListaPersonas.class, "lista");
		    xstream.toXML(listaper, new FileOutputStream ("Fichero\\Personas.xml"));
		    System.out.println("Creado fichero XML...");					
		}catch (Exception e) {e.printStackTrace(); }
	
	}

}
