package EjerciciosIniciales;

public class Zona {
	private int entradasPorVender;
	public Zona(int n) {
		entradasPorVender=n;
	}
	public int getEntradasPorVender() {
		return entradasPorVender;
	}
	
	public void vender(int n) {
		if(this.entradasPorVender == 0)
			System.out.println("Lo siento para esta zona las entradas estan agotadas.\n");
		else if(this.entradasPorVender < n)
			System.out.println("Solo quedan "+this.entradasPorVender+" entradas para esta zona.\n");
		
		if(this.entradasPorVender >= n) {
			this.entradasPorVender = this.entradasPorVender - n;
			System.out.println("Aqui tiene sus "+n+" entradas, gracias.\n");
		}
	}
}
