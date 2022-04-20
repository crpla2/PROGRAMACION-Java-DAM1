package Ejercicio_Obligatorio_Sesion7;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
 
public class Controller_Baloncesto implements ActionListener,
                                    MouseListener {
    private View_Baloncesto view;
 
    //CONSTRUCTOR
    Controller_Baloncesto( View_Baloncesto view ){
        this.view   = view;
        cargarTabla();
    }
 
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //Objeto para ejecutar los procedimientos almacenados
        //   en la base de datos
        
 
        //COMANDO EJECTUADO
        String comando  = arg0.getActionCommand();
 
        //Deberá coincidir con alguno de los parámetros
        //  indicados en setActionCommand invocado en la
        //  clase View
        switch (comando) {
            case "INSERTAR":
               Bd_Baloncesto.añadir(this.view.txtSocioId.getText(), this.view.txtNombre.getText(), this.view.txtEstatura.getText(), this.view.txtEdad.getText(), this.view.txtLocalidad.getText());
            break;
 
            case "BORRAR":
               Bd_Baloncesto.borrar(this.view.txtSocioId.getText());
            break;
 
            case "MODIFICAR":
               Bd_Baloncesto.editar(this.view.txtSocioId.getText(), this.view.txtNombre.getText(), this.view.txtEstatura.getText(), this.view.txtEdad.getText(), this.view.txtLocalidad.getText());
            break;
 
            default:
                System.err.println("Comando no definido");
            break;
        }
        //limpiar el formulario
        limpia();
 
        //refrescar la tabla
        cargarTabla();
    }
 
    //Método para limpiar los campos de la ventana
    private void limpia(){
        this.view.txtSocioId.setText("");
        this.view.txtNombre.setText("");
        this.view.txtEstatura.setText("");
        this.view.txtEdad.setText("");
        this.view.txtLocalidad.setText("");
    }
 
    //Método que recarga los datos de la tabla de la base de datos
    // en la tabla de la clase View
    protected void cargarTabla(){
        //Objeto para ejecutar los procedimientos almacenados en la base de datos
        CallableStatement cs;
        //Objeto para recoger los datos devueltos por el procedimiento almacenado
        ResultSet rs;
        //Objeto para recorrer el resultado del procedimiento almacenado y
        //  añadirlo a la tabla definida en la clase View
        Vector<Object> fila;
 
        //Limpiar los datos de la tabla
        for(int i=this.view.dtm.getRowCount(); i>0; i--){
            this.view.dtm.removeRow(i-1);
        }
 
        //Cargar datos en la tabla
        
        try {
          
            
            rs  = Bd_Baloncesto.getClientes();
          
            //Recorrer el resultado
            while(rs.next()){
                //Añadir registro a registro en el vector
                fila    = new Vector<Object>();
                fila.add(rs.getInt("socioID"));
                fila.add(rs.getString("nombre"));
                fila.add(rs.getString("estatura"));
                fila.add(rs.getString("edad"));
                fila.add(rs.getString("localidad"));
                //Añadir el vector a la tabla de la clase View
                this.view.dtm.addRow(fila);
            }
 
        } catch (SQLException e) {
            System.out.println("Error al CARGAR DATOS");
            System.out.println(e.getMessage());
        }
    }
 
    @Override
    public void mouseClicked(MouseEvent arg0) {
        //Objeto para ejecutar los procedimientos almacenados en la base de datos
        CallableStatement cs;
        //Objeto para recoger los datos devueltos por el procedimiento almacenado
        ResultSet rs;
 
        //Recoger qué fila se ha pulsadao en la tabla
        int filaPulsada = this.view.tabla.getSelectedRow();
        //Si se ha pulsado una fila
        if(filaPulsada>=0){
            //Se recoge el id de la fila marcada
            int identificador= (int)this.view.dtm.getValueAt(
                            filaPulsada, 0);
            try{
                
                rs  = Bd_Baloncesto.getCliente(identificador);
                //Cargar los datos devueltos en los cuadros de texto
                if(rs.next()){
                    this.view.txtSocioId.setText(rs.getString(1));
                    this.view.txtNombre.setText(rs.getString(2));
                    this.view.txtEstatura.setText(rs.getString(3));
                }
                //System.out.println(this.view.dtm.getValueAt(filaPulsada, 0));
            }catch (SQLException e) {
                System.err.println("Error al CARGAR UN CLIENTE");
            }
        }
    }
 
    @Override
    public void mouseEntered(MouseEvent arg0) {}
    @Override
    public void mouseExited(MouseEvent arg0) {}
    @Override
    public void mousePressed(MouseEvent arg0) {}
    @Override
    public void mouseReleased(MouseEvent arg0) {}
}