package caso7;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		System.out.println("Introduzca el primer numero: ");
		Scanner lector = new Scanner(System.in);
		int numero1 = lector.nextInt();
		lector.nextLine();
		System.out.println("Introduzca el segundo numero: ");
		int numero2 = lector.nextInt();
		lector.nextLine();
		System.out.println("Introduzca el tercero numero: ");
		int numero3 = lector.nextInt();
		lector.nextLine();
		if ((numero1 == numero2) && (numero2 == numero3)) {
			System.out.println("Los tres numeros son iguales y son: " + numero3);
		} else if ((numero1 == numero2) && (numero2 != numero3)) {
			if (numero1 < numero3) {
				System.out.println("El mayor de los 3 numeros es: " + numero3);
			} else {
				System.out.println("El mayor de los 3 numeros es: " + numero1);
			}
		} else if ((numero2 == numero3) && (numero3 != numero1)) {
			if (numero2 < numero1) {
				System.out.println("el mayor de los 3 numeros es: " + numero1);
			} else {
				System.out.println("El mayor de los 3 numeros es: " + numero2);
			}
		} else if ((numero3 == numero1) && (numero1 != numero2)) {
			if (numero3 < numero2) {
				System.out.println("El mayor de los 3 numeros es: " + numero2);
			} else {
				System.out.println("el mayor de todos los numeros es: " + numero1);
			}
		} else if ((numero3 != numero2) && (numero2 != numero1)) {
			if (numero1 > numero2) {
				if (numero1 > numero3) {
					System.out.println("El mayor de los numero es: " + numero1);
				} else {
					System.out.println("El mayor de los numeros es: " + numero3);
				}
			} else if (numero2 > numero3) {
				System.out.println("El mayor de los numeros es: " + numero2);
			} else {
				System.out.println("El mayor de todos los numeros es: " + numero3);
			}
			lector.close();
		}
	}
}
