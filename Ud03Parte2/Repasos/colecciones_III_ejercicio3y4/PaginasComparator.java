
	package colecciones_III_ejercicio3y4;

	import java.util.Comparator;

	public class PaginasComparator implements Comparator<Libro>{
		@Override
		public int compare(Libro l1, Libro l2) {
			if(( l1.getPaginas()-l2.getPaginas())<=0)
				return-1;
			return 1;
		}


}
