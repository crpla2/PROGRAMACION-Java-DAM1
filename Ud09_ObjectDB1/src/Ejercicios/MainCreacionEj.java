package Ejercicios;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//
//Alberto Carrera Martín - Abril 2020
//
public class MainCreacionEj {

	public static void main(String[] args) throws ParseException {
        DepartamentoEntityEj d1 = new DepartamentoEntityEj (10, "Finanzas", "Huesca");
        DepartamentoEntityEj d2 = new DepartamentoEntityEj (20, "I+D", "Walqa-Cuarte");
        DepartamentoEntityEj d3 = new DepartamentoEntityEj (30, "Comercial", "Almudévar");
        DepartamentoEntityEj d4 = new DepartamentoEntityEj (40, "Producción", "Barbastro");
        DepartamentoEntityEj d5 = new DepartamentoEntityEj (50, "Marketing", "Zaragoza");
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		EmpleadoEntityEj e1 = new EmpleadoEntityEj (1039, "Alberto Carrera Martín", "Presidente", null, formato.parse("1999-10-27"), 4900, null, d1);
		EmpleadoEntityEj e2 = new EmpleadoEntityEj (1082, "Mario Carrera Bailín","Director", e1, formato.parse("2001-07-06"), 3385, null, d1);
		EmpleadoEntityEj e3 = new EmpleadoEntityEj (1034, "Raquel Carrera Bailín","Empleado",e2, formato.parse("2002-11-12"), 2690, null,d1);
		
		EmpleadoEntityEj e4 = new EmpleadoEntityEj (2066, "Blanca Bailín Perarnau", "Director", e1, formato.parse("2001-07-12"), 2970, null, d2);
		EmpleadoEntityEj e5 = new EmpleadoEntityEj (2002, "Araceli Carrera Salcedo", "Investigador", e4, formato.parse("2003-02-24"),3000 ,null, d2);
		EmpleadoEntityEj e6 = new EmpleadoEntityEj (2069, "Fernando Carrera Martín", "Empleado", e5, formato.parse("2001-11-19"),2840, null, d2);
		EmpleadoEntityEj e7 = new EmpleadoEntityEj (2088, "Carmen Bailín Perarnau", "Investigador", e4, formato.parse("2001-10-19"), 2600, null, d2);
		EmpleadoEntityEj e8 = new EmpleadoEntityEj (2076, "Fernando Carrera Salcedo", "Empleado",e7, formato.parse("2005-02-13"), 2730,null, d2);
		//
		EmpleadoEntityEj e9 = new EmpleadoEntityEj (3098, "Fernando Martínez Pérez", "Director",  e1, formato.parse("2000-02-03"), 3150,  null, d3);
		EmpleadoEntityEj e10 = new EmpleadoEntityEj (3099, "Belén Carrera Sausán", "Comercial", e9, formato.parse("2000-02-22"), 2500, 500, d3);
		EmpleadoEntityEj e11 = new EmpleadoEntityEj (3051, "Enrique Casado Alvarez", "Comercial", e9, formato.parse("2002-07-23"), 2600, 550, d3);
		EmpleadoEntityEj e12 = new EmpleadoEntityEj (3054, "Antonio Mériz Piedrafita", "Comercial", e9, formato.parse("2003-03-22"), 2600, 1000, d3);
		EmpleadoEntityEj e13 = new EmpleadoEntityEj (3044,"Lorenzo Blasco González", "Comercial", e9, formato.parse("2001-03-07"), 2350, 400 ,d3);
		EmpleadoEntityEj e14 = new EmpleadoEntityEj (3000,"Javier Escartín Nasarre", "Empleado", e9, formato.parse("2003-07-13"), 2435, null, d3);
		//
		EntityManagerFactory emf =
	            Persistence.createEntityManagerFactory("db/empleadosEj.odb");
	   EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       em.persist(d1);em.persist(d2);em.persist(d3);em.persist(d4);em.persist(d5);
       em.persist(e1);em.persist(e2);em.persist(e3);em.persist(e4);em.persist(e5);em.persist(e6);em.persist(e7);
       em.persist(e8);em.persist(e9);em.persist(e10);em.persist(e11);em.persist(e12);em.persist(e13);em.persist(e14);
       //       
       em.getTransaction().commit();
       em.close();
       emf.close();
	}
}
