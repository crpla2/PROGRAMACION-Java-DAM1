package metodos_alumnos;


// Indicar paso de parámetros por valor....
public class Ej38AmbitoVariables {
	 
    static int variableGlobal=10;
 
    public static void metodoPrueba (){
 
        int variableMetodo=40;
        for (int i=0;i<5;i++){
            System.out.println("La variable i vale "+i); 
        }
        // System.out.println("La variable i vale "+i);  ERROR aqui ya no existe la variable i
 
    }
 
    public static void main(String[] args) {
 
        // System.out.println("La variable local  vale "+ variableMetodo); // ERROR aqui ya no existen las variables de metodo
 
        int variableLocal1=20;
        if (variableGlobal==10){
            int variableLocal2=30;
            System.out.println("La variable local 1 vale "+variableLocal1); 
        }
        // System.out.println("La variable local 2 vale "+variableLocal2); Aqui ya no existe la variable local 2
 
        System.out.println("La variable local Global vale "+variableGlobal); 
 
        metodoPrueba();
    }
 
}