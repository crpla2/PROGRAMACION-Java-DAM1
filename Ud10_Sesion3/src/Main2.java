import java.sql.SQLException;
import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int resultado;
		AccesoBdatos abd=new AccesoBdatos();
		//
		abd.conectar();
		//
		Depto dep = new Depto(60, "DAM2", "Huesca");
		resultado = abd.insertarConBean(dep);
		if (resultado ==1)
			System.out.println ("Se ha podido insertar el departamento: " + dep);
		else
			System.out.println ("Error nº " + resultado + " al insertar el departamento: " + dep);
		
		//
		dep = new Depto(10, "ASIR2", "Huesca");
		resultado = abd.insertarConBean(dep);
		if (resultado ==1)
			System.out.println ("Se ha podido insertar el departamento: " + dep);
		else
			System.out.println ("Error nº " + resultado + " al insertar el departamento: " + dep);
		
		abd.desconectar();

	}

}
