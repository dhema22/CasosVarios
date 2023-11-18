package casosAvanazdos;

import java.time.Year;
import java.util.Calendar;

public class caso26 {

	public static void main(String[] args) {
		anoNacimiento();
	}

	public static void anoNacimiento() {
		int edad;
		int nacimiento;
		int anoActual=2023;
		//int anoActual = Calendar.getInstance().get(Calendar.YEAR);
		edad = basicos.numericos("Introduzca su edad actual: ");
		if (edad >= 10 && edad <= 100) {
			nacimiento = anoActual - edad;
			System.out.println("Su ano de nacimiento es:" + nacimiento);
		} else {
			System.out.println("Error, la edad introducida no está en el rango de edades");
		}
	}

}
