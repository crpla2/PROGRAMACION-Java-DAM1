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
	public DepartamentoEntityEj buscarDepartamento(int numDepartamento) {
		return em.find(DepartamentoEntityEj.class, numDepartamento);
	}// de método buscarDepartamento
	//
	@SuppressWarnings("deprecation")
	public void imprimirDepartamento (int numDepartamento) {
		DepartamentoEntityEj d = buscarDepartamento(numDepartamento);
		if (d==null)
			System.out.println("No existe el Departamento " + numDepartamento);
		else {
			Set <EmpleadoEntityEj> empleados =d.getEmpleados();
			String datos="Datos del departamento " + numDepartamento + ": ";
			datos+= "Nombre: " + d.getNombre() + " - Localidad: " + d.getLocalidad()+ "\n";
			if (empleados.isEmpty())
				datos+="No tiene empleados en este momento";
			else {			
				datos+="Lista de empleados"+ "\n";
				datos+="*******************";
			}
			for (EmpleadoEntityEj empleado :empleados) {
				datos+= "\nNúmero de empleado: " + empleado.getEmpnoId()+ "\n";
				datos+= "Nombre: " + empleado.getNombre()+ "\n";
				datos+= "Oficio: " + empleado.getOficio()+ "\n";
				if (empleado.getDirId()==null)
					datos+= "Jefe: No tiene"+ "\n";
				else
					datos+= "Jefe: "+ empleado.getDirId().getNombre()+ "\n";
				datos+= "Año de alta: " + (empleado.getAlta().getYear()+1900)+ "\n";	
				datos+= "Salario: "+ empleado.getSalario()+ "\n";
				if (empleado.getComision() ==null)
					datos+= "Comisión: No tiene"+ "\n";
				else
					datos+= "Comisión: "+ empleado.getComision()+ "\n";
			}
			
			System.out.println(datos);
		}
	} // de método imprimirDepartamento
	
	public boolean insertarDepartamento (DepartamentoEntityEj d) {
		if (buscarDepartamento(d.getDptoId())!=null)
			return false;
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return true;
	} // de insertarDepartamento
	
	public boolean modificarDepartamento (DepartamentoEntityEj d) {
		DepartamentoEntityEj departamentoBuscado=buscarDepartamento(d.getDptoId());
		if (departamentoBuscado==null)
			return false;
		em.getTransaction().begin();
		departamentoBuscado.setNombre(d.getNombre());
		departamentoBuscado.setLocalidad(d.getLocalidad());
		em.persist (departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento
	
	// Si tiene empleados lo borraría igual, dejando en estos el número de Departamento
	// pero el resto de los atributos del departamento a null. Por eso no dejo borrar
	
	public boolean borrarDepartamento  (int numDepartamento) {
		DepartamentoEntityEj departamentoBuscado=buscarDepartamento(numDepartamento);
		if (departamentoBuscado==null || !departamentoBuscado.getEmpleados().isEmpty() )
			return false;
		em.getTransaction().begin();
		em.remove(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento
	
	public void demoJPQL() {
		
		Query q1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d");
        System.out.println("Total Departamentos: " + q1.getSingleResult());
        //
        TypedQuery<Long> tq1 = em.createQuery(
        	      "SELECT COUNT(d) FROM DepartamentoEntity d", Long.class);
        System.out.println("Total Departamentos: " + tq1.getSingleResult());
        //
        TypedQuery<DepartamentoEntityEj>tq2 =
	            em.createQuery("SELECT d FROM DepartamentoEntity d", DepartamentoEntityEj.class);
	        List<DepartamentoEntityEj> l2 = tq2.getResultList();
	        for (DepartamentoEntityEj r2 : l2) {
	            System.out.println("Nombre :  " + r2.getNombre()+ ", Localidad: "+ r2.getLocalidad());
	        }
	    //
        TypedQuery<Object[]>tq3 =
	            em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity  d", Object[].class);
	        List<Object[]> l3 = tq3.getResultList();
	        for (Object[] r3 : l3) {
	            System.out.println(
	            "Nombre :  " + r3[0] + ", Localidad: " + r3[1]);
	    }    
	    //*/
	      TypedQuery<Object[]>tq4 =
		            em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity d"
		            		+ " WHERE d.dptoId != :n", Object[].class);
	        		tq4.setParameter("n", 10);
		        List<Object[]> l4 = tq4.getResultList();
		        for (Object[] r4 : l4) {
		            System.out.println(
		            "Nombre :  " + r4[0] + ", Localidad: " + r4[1]);
		    }     
	     
	}// de demoJPQL
	
	//Ej1
	public void nombreFecha(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre, d.alta FROM EmpleadoEntityEj d", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
	}
	//Ej2
	public void nombreFecha2(String s){
		String s2="%"+s+"%";
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre, d.alta FROM EmpleadoEntityEj d "
				+ "WHERE d.nombre like :n", Object[].class);
		Ej1.setParameter("n", s2);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
	}
	//Ej3
	public void empleadosID(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre, d.oficio, d.departamento.nombre FROM EmpleadoEntityEj d"
				+ " WHERE d.oficio ='Empleado' and d.departamento.nombre = 'I+D", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
		}
	//Ej4
	public void mas2003(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre, d.alta, FROM EmpleadoEntityEj d"
				+ " WHERE year(d.alta) >= 2003 ", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
		}
	//Ej5
	public void EmpOrdenados(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre, d.empleados.nombre FROM DepartamentoEntityEj d order by d.nombre", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
		}
	//Ej6
	public void depConEmp(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.departamento.nombre, count(d), sum(d.salario), max(d.salario) FROM EmpleadoEntityEj d"
				+ " group by d.departamento", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
		}
	//Ej7
	public void depConEmpMas5(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.departamento.nombre, count(d), sum(d.salario), max(d.salario) FROM EmpleadoEntityEj d"
				+ " group by d.departamento having count(d)>=5", Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
		}
	//Ej8
	public void EmpCOnJefe(){
		TypedQuery<Object[]> Ej1=em.createQuery("SELECT d.nombre FROM EmpleadoEntityEj d  "
				+ "where d.dirId = d.empnoId "
				, Object[].class);
		List<Object[]>lista=Ej1.getResultList();
		imprimir(lista);
	}
	private void imprimir(List<Object[]>lista) {
		for (Object[]o:lista) {
			for(Object o2:o) {
				System.out.print(o2+" - ");
			}
			System.out.println();
		}}
//--------------------------------------------------------------------------------------------------------------
	
} // de la clase
