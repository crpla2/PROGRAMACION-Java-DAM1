package p129_Ejercicio6;

public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tiempo(int hora, int minuto, int segundo) {
		horas=hora;
		minutos=minuto;
		segundos=segundo;
		
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public Tiempo suma( Tiempo t) {
		int s1= (horas*3600)+(minutos*60)+segundos;
		int s2= (t.getHoras()*3600)+(t.getMinutos()*60)+(t.getSegundos());
		int suma=s1+s2;
		int ht=suma/3600;
		int mt=(suma%3600)/60;
		int st=(suma%3600)%60;
		Tiempo tt=new Tiempo(ht, mt, st);
		return tt;
	}
	
	public Tiempo resta (Tiempo t) {
		int s1= (horas*3600)+(minutos*60)+segundos;
		int s2= (t.getHoras()*3600)+(t.getMinutos()*60)+(t.getSegundos());
		int resta=s1-s2;
		int ht=resta/3600;
		int mt=(resta%3600)/60;
		int st=(resta%3600)%60;
		Tiempo tt=new Tiempo(ht, mt, st);
		return tt;
	}

	@Override
	public String toString() {
		return  horas+"h " + minutos + "m "+ segundos+"s";
	}
	
	
}


