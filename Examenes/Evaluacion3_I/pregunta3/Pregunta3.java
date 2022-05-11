package pregunta3;

public class Pregunta3 {

	public static void main(String[] args) {
		//String patron ="[$&_][aeiouAEIOU][\\w]{6,8}"; solucion mia, está incompleta no funciona bien
		String patron ="(([$&_][aeiouAEIOU][a-zA-Z0-9]{6})|([$&_][aeiouAEIOU][a-zA-Z0-9]{8}))";
		
		String prueba="&a12345668";
		if (prueba.matches(patron))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
