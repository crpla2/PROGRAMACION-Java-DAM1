package Ejercicio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class B {

	public static void main(String[] args) {
		 try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
		builder = factory.newDocumentBuilder();
		DOMImplementation implementation = builder.getDOMImplementation();

      
        Document documento = implementation.createDocument(null, "departamentos", null);
        documento.setXmlVersion("1.0");

		
		ObjectInputStream entrada= new  ObjectInputStream(new FileInputStream("documentos/departamentos.dat"));
		
		while(true) {
			 // Creo los elementos
            Element departamento = documento.createElement("departamento");
            
 
            
            Element NumDepartamento = documento.createElement("numero");
            Text textoNumDep = documento.createTextNode(entrada.readObject());
            NumDepartamento.appendChild(textoNumDep);
            departamento.appendChild(NumDepartamento);
 
            // Marca
            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode("AUDI");
            marca.appendChild(textMarca);
            coche.appendChild(marca);
 
            // Precio
            Element precio = documento.createElement("precio");
            Text textPrecio = documento.createTextNode("30000");
            precio.appendChild(textPrecio);
            coche.appendChild(precio);
 
			
			
		}} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
