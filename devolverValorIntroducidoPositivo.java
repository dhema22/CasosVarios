package caso6;

import java.util.Scanner;

public class devolverValorIntroducidoPositivo {

	public static void main(String[] args) {
		devolverValorIntroducidoPositivo();
	}

	private static void devolverValorIntroducidoPositivo() {
		Scanner valor = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int valorIntroducido = valor.nextInt();
		if (valorIntroducido >= 0) {
			System.out.println("El valor introducido es " + valorIntroducido);
		} else {
			System.out.println("El valor introuducido es negativo");
		}
		valor.close();
	}

}
