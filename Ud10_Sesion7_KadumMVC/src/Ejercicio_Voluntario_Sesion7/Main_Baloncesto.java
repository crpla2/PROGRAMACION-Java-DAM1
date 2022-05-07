package Ejercicio_Voluntario_Sesion7;
 
public class Main_Baloncesto {
    public static void main(String[] args) {
        //Invocar al constructor de la clase Bd
        new Bd_Baloncesto("baloncesto");
        //Crear un objeto de la clase View
        View vista  = new View();
        //Crear un objeto de la clase Controller
        Controller_Baloncesto controlador  = new Controller_Baloncesto(vista);
        //Vincular la vista y el controlador
        vista.conectaControlador(controlador);
 
    }
}