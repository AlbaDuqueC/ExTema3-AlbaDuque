package fecha;

public class Fecha {
	public static final int DIEZ = 10;
	private int dia; //d�a
	private int mes; //mes
	private int anio; //a�o

	
	public Fecha() {

	}

	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	
	
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
	private boolean esBisiesto() {
		return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
	}

	// M�todo diaSiguiente
	public void nextDay() {
		dia++;
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
