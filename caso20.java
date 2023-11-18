package casosAvanazdos;

public class caso20 {

	public static void main(String[] args) {
		factorial();
	}

	public static void factorial() {
		int numero;
		int factorial = 1;

		do {
			numero = basicos.numericos("Introduzca un numero para calcular su factorial: ");
		} while (numero < 0);
		if (numero > 0) {
			for (int i = 1; i <= numero; i++) {
				factorial = factorial * i;
			}
			System.out.println(factorial);
		} else {
			System.out.println("El factorial de 0 es 1");
		}
	}

}

// while(numero!=0) { factorial=factorial*numero; numero--; }
