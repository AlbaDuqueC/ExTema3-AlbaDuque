package fecha;

/**
 * La clase Fecha, es la que contiene los distintos tipos de datos 
 * o dunciones como los dias, el mes y el año.
 * @author alba.duque
 * 
 */
public class Fecha {
<<<<<<< HEAD
	private int d; //d�a
	private int m; //mes
	private int a; //a�o
=======
	public static final int DIEZ = 10;
	private int dia; //d�a
	private int mes; //mes
	private int anio; //a�o
>>>>>>> PMD-Refactor

	
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
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	
	/**
	 * fechacorrecta sirve para verificar que los datos esten bien
	 * @return devuelve un bollean que decide si los dias,
	 * mes y año estan correctos
	 * @author alba.duque
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = anio > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		boolean diaMayor1 = dia >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && dia <= 29;
			} else {
				diaCorrecto = diaMayor1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && dia <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
<<<<<<< HEAD
	/**
	 * esBisiesto es una clase privada que comprueba si el año es bisiesto o no.
	 * @see Solo la utiliza fechaCorrecta
	 * @return devuelve si es Bisiesto o no
	 * @author alba.duque
	 */
=======
>>>>>>> PMD-Refactor
	private boolean esBisiesto() {
		return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
	}

	// M�todo diaSiguiente
<<<<<<< HEAD
	/**
	 * El metodo diaSiguiente lo que hace es incrementar un dia 
	 * a la fecha
	 * @author alba.duque
	 */
	public void diaSiguiente() {
		d++;
=======
	public void nextDay() {
		dia++;
>>>>>>> PMD-Refactor
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anio++;
			}
		}
	}

	// M�todo toString
<<<<<<< HEAD
	/**
	 * El metodo toString devuelve la fecha por escrito
	 * @author alba.duque
	 */
=======
>>>>>>> PMD-Refactor
	public String toString() {
		
		String devolver="";
		
		if (dia < DIEZ && mes < DIEZ) {
			devolver= "0" + dia + "-0" + mes + "-" + anio;
		} else if (dia < DIEZ && mes >= DIEZ) {
			devolver="0" + dia + "-" + mes + "-" + anio;
		} else if (dia >= DIEZ && mes < DIEZ) {
			devolver= dia + "-0" + mes + "-" + anio;
		} else {
			devolver= dia + "-" + mes + "-" + anio;
		}
		return devolver;
	}

}
