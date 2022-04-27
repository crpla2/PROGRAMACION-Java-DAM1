package objetos;

public class Zona {
private int entradasPorVender;
	
	public Zona(int n) {
		entradasPorVender=n;
	}
	
	public int getEntradasPorVender() {
		return entradasPorVender;
	}

	public void vender(int n) {
		
		if(this.entradasPorVender==0) {
			System.out.println("Lo siento, las entradas para esa zona están agotadas.");
		}else
			if(this.entradasPorVender<n) {
				System.out.println("Sólo quedan" + this.entradasPorVender + " entradas para esa zona.");
			}
		
		if(this.entradasPorVender>=n) {
			entradasPorVender-=n;
			System.out.println("Aqui tiene sus "+ n+ " entradas, gracias.");
			
		}
		
		}
}
