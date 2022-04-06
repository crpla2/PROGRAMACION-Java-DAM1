import java.sql.SQLException;
import java.util.ArrayList;

public class Main5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int filas;
		Depto dep;
		//
		AccesoBdatos abd=new AccesoBdatos();
		//
		abd.conectar();
		//
		// El departamento 10 pasará a cambiar de nombre y localidad
		dep = new Depto(10, "DAM1", "Sabiñánigo");
		filas = abd.actualizar(dep);
		if (filas==1)
			System.out.println ("Datos del departamento " + dep.getDeptno() + " modificados");
		else
			System.out.println ("No se pudieron cambiar los datos del departamento " + dep.getDeptno());
		//
		//
		// El departamento 85 no existe y por tanto no se actualizarán sus datos
		dep = new Depto(85, "DAM2", "Sabiñánigo");
		filas = abd.actualizar(dep);
		if (filas==1)
			System.out.println ("Datos del departamento " + dep.getDeptno() + " modificados");
		else
			System.out.println ("No se pudieron cambiar los datos del departamento " + dep.getDeptno());
		
		abd.desconectar();

	}

}
