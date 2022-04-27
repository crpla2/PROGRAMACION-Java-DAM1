package objetos;
 
public class Pizza {
		
		private static int totalPedidas;
		private static int totalServidas;
		
		private String tamanyo;
		private String tipo;
		private String estado;
		
		public Pizza() {
			estado = "pedida";
			totalPedidas++;
		}

		public Pizza( String tipo, String tamanyo) {

			this.tamanyo = tamanyo;
			this.tipo = tipo;
			this.estado = "pedida";
			totalPedidas++;
		}

	
		
		public static int getTotalPedidas() {
			return totalPedidas;
		}

		public static int getTotalServidas() {
			return totalServidas;
		}

		public void sirve() {
			if(estado=="servida")
				System.out.println("esa pizza ya se ha servido");
			else {
			estado="servida";
			totalServidas++;}
			
		}

		@Override
		public String toString() {
			return "Pizza "+ tipo +" "+tamanyo+", " + estado ;
		}
		
		
		
		
}
