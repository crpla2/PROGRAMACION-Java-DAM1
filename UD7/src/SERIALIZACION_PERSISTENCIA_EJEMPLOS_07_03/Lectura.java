package SERIALIZACION_PERSISTENCIA_EJEMPLOS_07_03;

//Clase principal

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura {

    public static void main(String[] args) {

        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;

        try {

            fis = new FileInputStream("d://personas.dat");
            entrada = new ObjectInputStream(fis);
            p = (Persona) entrada.readObject(); //es necesario el casting
            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
            p = (Persona) entrada.readObject();
            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
            p = (Persona) entrada.readObject();
            System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}