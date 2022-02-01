package antiguo;

//Alberto Carrera. Enero 2020.
 
public class _02CronometroMain {
	public static void main(String[] args) {
		_02Cronometro c = new _02Cronometro();
		c.comienzo();
		for (long i=0; i< 1000000000; i++) {}
		c.fin();
		System.out.println("Milisegundos transcurridos: "+ c.tiempoTotal());
	}
}