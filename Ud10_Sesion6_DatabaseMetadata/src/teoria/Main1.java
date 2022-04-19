package teoria;
import java.sql.SQLException;


public class Main1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		abd.infoGeneralMetadata();
		abd.desconectar();
	} 
}