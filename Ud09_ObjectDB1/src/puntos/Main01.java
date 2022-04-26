package puntos;
//https://www.objectdb.com/tutorial/jpa/eclipse/store
//Adaptado por Alberto Carrera Martín - Abril 2020
import javax.persistence.*;
import java.util.*;

public class Main01 {
    public static void main(String[] args) {
    	// Abre una conexión a la base de datos
        // Si no existe la base de datos entonces la crea
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("db/p2.odb");
        EntityManager em = emf.createEntityManager();
        
     // Recupera todos los objetos Punto de la base de datos:
        TypedQuery<Point> query =
        	    em.createQuery("SELECT p FROM Point p", Point.class);
        	  List<Point> results = query.getResultList();
        	  // Borra todos los puntos menos los 100 primeros
        	  // El resto incrementa su coordenada X en 100 unidades
        	  em.getTransaction().begin();
        	  for (Point p : results) {
        	      if (p.getX() >= 100) {
        	          em.remove(p); // Borra la entidad
        	      }
        	      else {
        	          p.setX(p.getX() + 100); // Modifica la entidad
        	      }
        	  }
        	  em.getTransaction().commit();

        // Recupera todos los objetos Punto que permanecen:
        query = em.createQuery("SELECT p FROM Point p", Point.class);
        results = query.getResultList();
        for (Point p : results) {
            System.out.println(p);
        }

     // Cierra la consulta y la conexión a la base de datos
        em.close();
        emf.close();
    }
}
