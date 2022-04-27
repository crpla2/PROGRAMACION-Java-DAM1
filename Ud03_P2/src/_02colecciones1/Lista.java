package _02colecciones1;

// Lista.java: una lista de Personas

public class Lista {
  private final static int MAX = 100;
  private Persona _array[];
  private int _cont = 0; // Indica la primera posición libre
  // del array. Igual al número de elementos

  public Lista() {
    _array = new Persona[MAX];
  }

  public boolean llena() { return _cont == MAX; }

  public boolean vacia() { return _cont == 0; }

  public int length() { return _cont; }

  public boolean insertar(Persona p) {
  // Devuelve true si se inserta; false si lista llena
    if(_cont == MAX) return false;
    _array[_cont] = p;
    _cont++;
    return true;
  }

  public Persona recuperar(int pos) {
  // true si tiene éxito; false si posición no válida
  // pos variará de 1 al número de elementos
    if((pos < 1) || (pos > _cont)) return null;
    return _array[pos-1];
  }

  public String toString() {
    String cad = "Elementos de la lista:\n\n";
    for(int i = 0; i < _cont; i++)
      cad += _array[i].toString() + "\n";
    return cad;
  }
/*********************************************************/
public boolean borrarPersonaPosicion(int pos) {
	if(_cont==0||pos<1||pos>_cont) {
		return false;
		}
	for(int i=pos;i<_cont;i++) {
		_array[i-1]=_array[i];
	}
	_cont--;
	return true;
}

public int buscarPorDni(long num) {
	for( int i=0; i<_cont;i++) {
		if(_array[i].dameNif().dameDni()==num)
			return(i+1);
	}
	return -1;
}

public boolean borrarPersonaPorDni(long num) {
	int encontrarPosicion=buscarPorDni(num);
	if (encontrarPosicion==-1)
		return false;
	return borrarPersonaPosicion(encontrarPosicion);
	}

public String buscarPorApellido(String apellido) {
	String encontrados="";
	for(int i=0;i<_cont;i++) {
		if(_array[i].dameApellidos().toLowerCase().contains(apellido.toLowerCase()))
			encontrados=encontrados+_array[i];
			}
	return encontrados;
}

public Persona[] buscarPorApellido2 (String apellido) {
	Persona[]encontrado= new  Persona[_cont];
	int i2=0;
	for(int i=0;i<_cont;i++) {
	if(_array[i].dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
		encontrado[i2]=_array[i];
		i2++;
	}
 }
	return encontrado;
}
}