package casosAvanazdos;

import java.util.Scanner;

public class caso13AprobadosSuspensos {

	public static void main(String[] args) {
		aprobadosSuspensos();
	}

	public static void aprobadosSuspensos() {
		int nota;
		int alumnos;
		int aprobados = 0;
		int suspensos = 0;
		Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de alumnos que hay: ");
		alumnos = lector.nextInt();
		lector.nextLine();
		if (alumnos >= 5 && alumnos <= 30) {
			for (int i = 1; i <= alumnos; i++) {
				do {
					System.out.println("Introduza la nota del alumno " + i);
					nota = lector.nextInt();
					lector.nextLine();
				} while (nota < 0 || nota > 10);
				if (nota >= 5) {
					aprobados = aprobados + 1;
				} else {
					suspensos = suspensos + 1;
				}
			}
			System.out.println("alumnos aprobados: " + aprobados + " alumnos suspensos: " + suspensos);
		} else {
			System.out.println("La cantidad de alumnos no está entre los valores necesarios.");
		}
		lector.close();
	}

}
