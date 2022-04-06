import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		AccesoBdatos abd=new AccesoBdatos();
		//
		abd.conectar();
		//
		if (abd.insertar(50, "DAM1", "Huesca"))
			System.out.println ("Se ha podido insertar el departamento 50-DAM1-Huesca");
		else
			System.out.println ("NO Se ha podido insertar el departamento 50-DAM1-Huesca");
		
		if (abd.insertar(20, "ASIR1", "Huesca"))
			System.out.println ("Se ha podido insertar el departamento 20-ASIR1-Huesca");
		else
			System.out.println ("NO Se ha podido insertar el departamento 20-ASIR1-Huesca");
		
		//
		
		abd.desconectar();

	}

}
