package fecha;

/**
 * La clase Fecha, es la que contiene los distintos tipos de datos 
 * o dunciones como los dias, el mes y el año.
 * @author alba.duque
 * 
 */
public class Fecha {
	private int d; //d�a
	private int m; //mes
	private int a; //a�o

	
	/**
	 * 
	 * @deprecatede no se usa ya este metodo
	 * @author alba.duque
	 */
	public Fecha() {

	}

	
	/**
	 * La funcion Fecha es la que le da valor a las variable, 
	 * introduciendo los siguientes parametro y igualarndolos 
	 * a las variables.
	 * @param dia
	 * @param mes
	 * @param anio
	 * @author alba.duque
	 */
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	
	/**
	 * fechacorrecta sirve para verificar que los datos esten bien
	 * @return devuelve un bollean que decide si los dias,
	 * mes y año estan correctos
	 * @author alba.duque
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	/**
	 * esBisiesto es una clase privada que comprueba si el año es bisiesto o no.
	 * @see Solo la utiliza fechaCorrecta
	 * @return devuelve si es Bisiesto o no
	 * @author alba.duque
	 */
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	// M�todo diaSiguiente
	/**
	 * El metodo diaSiguiente lo que hace es incrementar un dia 
	 * a la fecha
	 * @author alba.duque
	 */
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	// M�todo toString
	/**
	 * El metodo toString devuelve la fecha por escrito
	 * @author alba.duque
	 */
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
