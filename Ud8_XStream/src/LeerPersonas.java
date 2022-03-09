import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;

public class LeerPersonas {
	public static void main(String[] args) throws IOException{
		XStream xstream = new XStream();
		xstream.alias("ListaPersonasMunicipio",ListaPersonas.class);
		xstream.alias("DatosPersona", Persona.class);
		xstream.addImplicitCollection(ListaPersonas.class, "lista");
		
		ListaPersonas listadoTodas = (ListaPersonas) 
									xstream.fromXML
									(new FileReader("Fichero\\Personas.xml"));
		System.out.println("Número de Personas: " +
									listadoTodas.getListaPersonas().size());
		List<Persona> listaPersonas=new ArrayList<Persona>();
		listaPersonas=listadoTodas.getListaPersonas();
		
		Iterator iterador = listaPersonas.listIterator();
		while (iterador.hasNext()){
			Persona p= (Persona) iterador.next();
			System.out.println("Nombre: " + p.getNombre() + 
					", edad: " + p.getEdad());
		}
		System.out.println("Fin del listado....");	
	}
}