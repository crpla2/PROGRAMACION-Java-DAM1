package Colecciones_III_ej1;

// Fecha.java: Manejo de fechas

/**
 * Clase para el tratamiento de fechas.
 * @author  Luis Hernández
 * @version 1.0
 */
public class Fecha {

  private int _dia, _mes, _anio; // Atributos

  /** Constructor predeterminado. */
  public Fecha() {
    _dia = 1;
    _mes = 1;
    _anio = 1900;
  }

  /** Constructor parametrizado. */
  public Fecha(int d, int m, int a) {
    _dia = d;
    _mes = m;
    _anio = a;
    valida();
  }
  public String toString() { // Añadido Alberto
	  return (_dia + "/"+ _mes + "/" +_anio);
  }
  /** Lectura de la fecha (día, mes y año). */
  public void leer() {
    System.out.print("Dia: ");
    _dia = MyInput.readInt();
    System.out.print("Mes: ");
    _mes = MyInput.readInt();
    System.out.print("Anho: ");
    _anio = MyInput.readInt();
    valida();
  }

  /** Indica si el año es bisiesto o no. */
  public boolean bisiesto() {
    return (_anio % 4) == 0;
  }

  /** Días del mes de la fecha.
   * @param  mes El mes del que se quiere saber su número de días. */
  public int diasMes(int mes) {
    int numeroDias;
    switch(mes) {
      case 1: case 3: case 5:
      case 7: case 8: case 10:
      case 12:
        numeroDias = 31;
        break;
      case 4: case 6: case 9:
      case 11:
        numeroDias = 30;
        break;
      default:
        if(bisiesto()) numeroDias = 29;
        else numeroDias = 28;
    }
    return numeroDias;
  }

  // Accedentes
  public int dia() { return _dia; }
  public int mes() { return _mes; }
  public int anio() { return _anio; }

  // Mutadores
  public void dia(int d) { _dia = d; valida(); }
  public void mes(int m) { _mes = m; valida(); }
  public void anio(int a) { _anio = a; valida(); }

  /** Muestra la fecha en formato corto (p.e. 02-09-2003). */
  public void corta() {
    if(_dia < 10) System.out.print("0");
    System.out.print(_dia + "-");
    if(_mes < 10) System.out.print("0");
    System.out.print(_mes + "-" + _anio);
  }

  /** Devuelve los días transcurridos desde el 1-1-1900 hasta la fecha. */
  public long diasTranscurridos() {
    long total;
    int anios, m, bisiestos = 0;
    anios = _anio - 1900;
    total = anios * 365;
    bisiestos = (anios + 3) / 4;
    total += bisiestos;
    for(m = 1; m < _mes; m++) total += diasMes(m);
    total += _dia; // Total de días desde 1-1-1900 hasta la fecha.
    // Incluyendo ambas fechas (se ha de restar una).
    total--;
    return total;
  }

  /** Día de la semana de la fecha (0 para domingo). */
  public int diaSemana() {
    int nd = (int) (diasTranscurridos() % 7);
    return nd;
  }

  /** Muestra la fecha en formato largo (p.e. martes 2 septiembre de 2003). */
  public String larga() {
	String cad="";
    int ds = diaSemana();
    switch(ds) {
      case 1: cad+="lunes"; break;
      case 2: cad+="martes"; break;
      case 3: cad+="miercoles"; break;
      case 4: cad+="jueves"; break;
      case 5: cad+="viernes"; break;
      case 6: cad+="sabado"; break;
      default: cad+="domingo";
    }
    cad+=" " + _dia + " de ";
    switch(_mes) {
      case 1: cad+="enero"; break;
      case 2: cad+="febrero"; break;
      case 3: cad+="marzo"; break;
      case 4: cad+="abril"; break;
      case 5: cad+="mayo"; break;
      case 6: cad+="junio"; break;
      case 7: cad+="julio"; break;
      case 8: cad+="agosto"; break;
      case 9: cad+="septiembre"; break;
      case 10: cad+="octubre"; break;
      case 11: cad+="noviembre"; break;
      case 12: cad+="diciembre"; break;
    }
    cad+= " de " + _anio;
    return cad;
  }

  /** Establece la fecha que corresponde tras transcurrir
   * los días que se proporcionan desde el 1-1-1900. */
  public void fechaTras(long dias) {
    int diasAnio;
    if(dias < 0) return;
    _dia = 1;
    _mes = 1;
    _anio = 1900;
    while(dias > 0) {
      if(bisiesto()) diasAnio = 366;
      else diasAnio = 365;
      if(dias >= diasAnio) {
        dias -= diasAnio;
        _anio++;
        if(_anio == 2051) {
          _dia = 31;
          _mes = 12;
          _anio = 2050;
          return;
        }
      }
      else {
        if(dias >= diasMes(_mes)) {
          dias -= diasMes(_mes);
          _mes++;
        }
        else {
          _dia += dias;
          dias = 0;
        }
      }
    }
  }

  /** Días entre la fecha y la proporcionada. */
  public long diasEntre(Fecha otra) {
    long dias = diasTranscurridos() - otra.diasTranscurridos();
    return Math.abs(dias);
  }

  /** Pasa al día siguiente. */
  public void siguiente() {
    long dias = diasTranscurridos();
    fechaTras(dias + 1);
  }

  /** Pasa al día anterior. */
  public void anterior() {
    long dias = diasTranscurridos();
    fechaTras(dias - 1);
  }

  /** Devuelve un clon del objeto. */
  public Fecha copia() {
    Fecha tmp = new Fecha();
    tmp._dia = _dia;
    tmp._mes = _mes;
    tmp._anio = _anio;
    return tmp;
  }

  /** ¿Es menor la fecha que la proporcionada? */
  public boolean menorQue(Fecha f) {
    if(diasTranscurridos() < f.diasTranscurridos()) return true;
    else return false;
  }

  /** ¿Es igual la fecha que la proporcionada? */
  public boolean igualQue(Fecha f) {
    if(diasTranscurridos() == f.diasTranscurridos()) return true;
    else return false;
  }

  /** ¿Es mayor la fecha que la proporcionada? */
  public boolean mayorQue(Fecha f) {
    if(diasTranscurridos() > f.diasTranscurridos()) return true;
    else return false;
  }

  /** Comprueba si la fecha es correcta y si no la ajusta.
   * Se llama tras la lectura de los datos. */
  private void valida() { // Método auxiliar (privado)
    if((_anio < 0) || (_anio > 2050)) _anio = 1900;
    if((_mes < 1) || (_mes > 12)) _mes = 1;
    if(_dia < 1) _dia = 1;
    else if(_dia > diasMes(_mes)) _dia = 1;
  }
}

