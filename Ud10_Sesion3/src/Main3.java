import java.sql.SQLException;
import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AccesoBdatos abd=new AccesoBdatos();
		//
		abd.conectar();
		//
		System.out.println("Todos los departamentos:");
		
		ArrayList<Depto> dtos = abd.consultarTodos();
		for (Depto departamento : dtos)
			System.out.println(departamento);
		System.out.println("-----------------------------------");
		System.out.println("Fin listado Todos los departamentos");
		
				
		abd.desconectar();

	}

}
