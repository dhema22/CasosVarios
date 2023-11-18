package casosAvanazdos;

import java.util.Arrays;

public class caso22 {

	public static void main(String[] args) {
		pagar();
	}

	public static void pagar() {
		String[] productos = new String[3];
		double[] precio = new double[3];
		double suma = 0;
		double resta = 0;
		double dinero = 0;

		for (int i = 0; i < 3; i++) {
			productos[i] = basicos.caracteres("Introduza el nombre del producto " + (i + 1));
			precio[i] = basicos.numericos("Introduzca el importe del producto " + (i + 1));
			suma = Arrays.stream(precio).sum();
		}
		dinero = basicos.numericos("Introduzca la cantidad de dinero que tiene: ");
		resta = dinero - suma;
		if (resta >= 0) {
			System.out.println("Puede comprar los productos.");
		} else {
			System.out.println("No puede comprar los productos.");
		}
	}
}
