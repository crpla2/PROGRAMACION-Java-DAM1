import java.sql.SQLException;
import java.util.ArrayList;

public class Main6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int filas, numeroDep;
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		//
		//Intentamos borrar el departamento 50
		numeroDep=50;
		filas = abd.borrar(numeroDep);
		if (filas==1)
			System.out.println ("Departamento " + numeroDep + " eliminado");
		else {
			System.out.print ("No se pudo eliminar el departamento: " + numeroDep );
			System.out.println (" - La variable filas vale: " + filas );
		}
		//Intentamos borrar el departamento 30
		numeroDep=30;
		filas = abd.borrar(numeroDep);
		if (filas==1)
			System.out.println ("Departamento " + numeroDep + " eliminado");
		else {
			System.out.print ("No se pudo eliminar el departamento: " + numeroDep );
			System.out.println (" - La variable filas vale: " + filas );
		}
		//
		//
		// El departamento 95 no existe y por tanto no se borrará
		numeroDep=95;
		filas = abd.borrar(numeroDep);
		if (filas==1)
			System.out.println ("Departamento " + numeroDep + " eliminado");
		else {
			System.out.print ("No se pudo eliminar el departamento: " + numeroDep);
			System.out.println (" - La variable filas vale: " + filas );
		}
		abd.desconectar();

	}

}
