package Examen2_1_sql;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		abd.librosEditorial("Alfaguara");
		System.out.println("Total de libros prestados: "+abd.totalPrestados());
		System.out.println(abd.insertarUsuario("Carlos", "Rodrigo","01239","974707777"));
		abd.desconectar();
	}
}
