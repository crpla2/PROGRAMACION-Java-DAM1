package Ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class B {

	public static void main(String[] args) {
		Document documento = null;
		ObjectInputStream entrada = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();

			documento = implementation.createDocument(null, "departamentos", null);
			documento.setXmlVersion("1.0");

			entrada = new ObjectInputStream(new FileInputStream("documentos/departamentos.dat"));

			Departamento d = (Departamento) entrada.readObject();
			while (true) {

				Element departamento = documento.createElement("departamento");

				Element numDepartamento = documento.createElement("numero");
				Text textoNumDep = documento.createTextNode(String.valueOf(d.getNumdepartamento()));
				numDepartamento.appendChild(textoNumDep);
				departamento.appendChild(numDepartamento);

				Element nombre = documento.createElement("nombre");
				Text textNombre = documento.createTextNode(d.getNombre());
				nombre.appendChild(textNombre);
				departamento.appendChild(nombre);

				Element localizacion = documento.createElement("localizacion");
				Text textLocalizacion = documento.createTextNode(d.getLocalidad());
				localizacion.appendChild(textLocalizacion);
				departamento.appendChild(localizacion);

				documento.getDocumentElement().appendChild(departamento);

			}
		} catch (EOFException e) {
			System.out.println("-- FINAL DE FICHERO --");
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Source source = new DOMSource(documento);
			// Creo el Result, indicado que fichero se va a crear
			Result result = new StreamResult(new File("documentos\\departamentos.xml"));

			// Creo un transformer, se crea el fichero XML
			Transformer transformer;

			try {
				transformer = TransformerFactory.newInstance().newTransformer();
				transformer.transform(source, result);
			} catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
				;
				e.printStackTrace();
			}

			catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
