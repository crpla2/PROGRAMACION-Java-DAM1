package SERIALIZACION_PERSISTENCIA_EJEMPLOS_07_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("Ficheros/personas.dat");
            salida = new ObjectOutputStream(fos);
            //Se crea el primer objeto Persona
            p = new Persona("12345678A","Alberto Carrera Martín", 30); // Ya le gustaría....
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el segundo objeto Persona
            p = new Persona("98765432B","Teo Laírla Morlans", 25);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el tercer objeto Persona
            p = new Persona("78234212Z","Leticia García Quevedo", 23);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
           
        } catch (FileNotFoundException e) {
            System.out.println("1"+e.getMessage());
        } catch (IOException e) {
            System.out.println("2"+e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println("3"+e.getMessage());
            }
        }

    }
}