package teoria;

import java.sql.SQLException;


public class Main2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		abd.tablasMetadata("empleados");
		//abd.tablasMetadataMejorado("empleados");
		abd.desconectar();
	} 
}