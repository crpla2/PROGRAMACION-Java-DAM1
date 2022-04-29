package Ejercicios;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
//
// Alberto Carrera Martín - Abril 2020
//

public class AccesoBdatosEj {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/empleadosEj.odb");
		em = emf.createEntityManager();
	}

	public void desconectar() {
		em.close();
		emf.close();
	}
//EJERCICIO)9.1
	public void Ejercicios() {
//	Ejercicio 1 Nombre y fecha de alta de todos los empleados
	TypedQuery<Object[]> tq1=em.createQuery("SELECT d.nombre, d.alta FROM EmpleadoEntityEj d", Object[].class);
//	Ejercicio 2 Ídem de la anterior pero para aquellos que "Carrera" forma parte del nombre. No distinguir mayúsculas de minúsculas
	TypedQuery<Object[]> tq2=em.createQuery("SELECT d.nombre, d.alta FROM EmpleadoEntityEj d WHERE d.nombre like '%Carrera%' or d.nombre like '%carrera%'", Object[].class);	
//	Ejercicio 3 Empleados del Departamento I+D cuyo oficio es el de Empleado
	TypedQuery<Object[]> tq3 = em.createQuery(
		"SELECT d.nombre, d.oficio, d.departamento.nombre FROM EmpleadoEntityEj d WHERE d.oficio ='Empleado' and d.departamento.nombre = 'I+D'",
		Object[].class);
//	Ejercicio 4 Empleados contratados a partir del 2003
	TypedQuery<Object[]> tq4 = em.createQuery(
		"SELECT d.nombre, d.alta, FROM EmpleadoEntityEj d WHERE year(d.alta) >= 2003 ", Object[].class);
//	Ejercicio 5 Empleados por orden alfabético de departamento
	TypedQuery<Object[]> tq5 = em.createQuery(
		"SELECT d.nombre, d.empleados.nombre FROM DepartamentoEntityEj d order by d.nombre", Object[].class);
//	Ejercicio 6 Nombre, nº de empleados, total y máximo salario de los departamentos con empleados
	TypedQuery<Object[]> tq6 = em.createQuery(
		"SELECT d.departamento.nombre, count(d), sum(d.salario), max(d.salario) FROM EmpleadoEntityEj d group by d.departamento",
		Object[].class);
//	Ejercicio 7 Idem de la anterior pero para departamentos a partir de 5 empleados
	TypedQuery<Object[]> tq7 = em.createQuery(
		"SELECT d.departamento.nombre, count(d), sum(d.salario), max(d.salario) FROM EmpleadoEntityEj d group by d.departamento having count(d)>=5",
		Object[].class);
//	Ejercicio 8 Cada empleado junto con su jefe
	TypedQuery<Object[]> tq8 = em.createQuery(
		"SELECT d.nombre, 'su jefe es', d.dirId.nombre, 'departamento',d.departamento.dptoId FROM EmpleadoEntityEj d  ",
		Object[].class);
//	Ejercicio 9 Nombre y total de empleados de los departamentos con algún empleado
	TypedQuery<Object[]> tq9 = em.createQuery(
		"SELECT d.nombre, count(d.empleados) FROM DepartamentoEntityEj d group by d.nombre  ",
		Object[].class);
//	Ejercicio 10 Nombre y total de empleados de TODOS los departamentos
	TypedQuery<Object[]> tq10 = em.createQuery("SELECT d.nombre,count(d2) FROM DepartamentoEntityEj d left JOIN d.empleados d2 group by d.nombre"
		,
		Object[].class);
//	Ejercicio 11 Ordenando descendentemente por departamento y ascendentemente por salario
	TypedQuery<Object[]> tq11 = em.createQuery("SELECT d.departamento.dptoId, d.nombre, d.salario FROM EmpleadoEntityEj d order by d.departamento.dptoId desc, d.salario asc"
			,
			Object[].class);
//	Ejercicio 12 Empleados sin jefe
	TypedQuery<Object[]> tq12 = em.createQuery("SELECT d.salario, d.nombre FROM EmpleadoEntityEj d  where d.dirId is null"
			,
			Object[].class);
//	Ejercicio 13 Departamento al que pertenece el empleado nº 1039
	TypedQuery<Object[]> tq13 = em.createQuery("SELECT d.dptoId,d.nombre FROM DepartamentoEntityEj d where d.empleados.empnoId =1039"
			,
			Object[].class);
		List<Object[]> lista = tq3.getResultList();
		imprimir(lista);
	}
	private void imprimir(List<Object[]> lista) {
		for (Object[] o : lista) {
			for (Object o2 : o) {
				System.out.print(o2 + " - ");
			}
			System.out.println();
		}
	}
//EJERCICIO 9.2
//	Ejer 01
	public int incrementarSalario(int cantidad) {
		int actualizados;
		em.getTransaction().begin();
		Query q=em.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n");
		q.setParameter("n", cantidad);
		actualizados=q.executeUpdate();
		em.getTransaction().commit();
		return actualizados;
	}
//	Ej 02
	public int incrementarOficio(String oficio,int cantidad) {
		int actualizados;
		em.getTransaction().begin();
		Query q=em.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n where oficio= :s");
		q.setParameter("n", cantidad);
		q.setParameter("s", oficio);
		actualizados=q.executeUpdate();
		em.getTransaction().commit();
		return actualizados;
	}
//	Ejer03
	public int incrementarSalarioDepartamento(int numDepartamento, int cantidad) {
		int actualizados;
		em.getTransaction().begin();
		Query q=em.createQuery("UPDATE EmpleadoEntityEj set salario= salario + :n where departamento.getDptoId()= :s"); 
		q.setParameter("n", cantidad);
		q.setParameter("s",	numDepartamento);
		actualizados=q.executeUpdate();
		em.getTransaction().commit();
		return actualizados;
	}
//	Ejer04
	public int borrarEmpleado(int numEmpleado) {
		int borrados;
		em.getTransaction().begin();
		Query q= em.createQuery("DELETE FROM EmpleadoEntityEj where empnoId= :n");
		q.setParameter("n", numEmpleado);
		borrados=q.executeUpdate();
		em.getTransaction().commit();
		return borrados;
	}
//	Ej05
	public int borrarDepartamento(int numDepartamento) {
		int borrados;
		em.getTransaction().begin();
		Query q= em.createQuery("DELETE FROM DepartamentoEntityEj where dptoId= :n");
		q.setParameter("n", numDepartamento);
		borrados=q.executeUpdate();
		em.getTransaction().commit();
		return  borrados;
	}
//--------------------------------------------------------------------------------------------------------------

} // de la clase
