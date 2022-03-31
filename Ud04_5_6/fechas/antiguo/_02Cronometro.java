package antiguo;

//Alberto Carrera. Enero 2020.
 
public class _02Cronometro {

  private long tComienzo = 0;
  private long tFin   = 0;

  public void comienzo(){
    tComienzo = System.currentTimeMillis();
  }

  public void fin() {
    tFin   = System.currentTimeMillis();  
  }


  public long tiempoTotal() {
    return tFin-tComienzo;
  }
}