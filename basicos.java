package casosAvanazdos;

import java.util.Scanner;

public class basicos {

	public static void main(String[] args) {

	}

	public static int numericos(String texto) {
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		numero = lector.nextInt();
		lector.nextLine();
		return numero;
	}

	public static String caracteres(String texto) {
		String caracter;
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		caracter = lector.nextLine();
		return caracter;
	}

	public static int isNumber(String numero) {
		String numero1=" "; //preguntar porque es necesario inicializar.
		String numero2;
		int numeroConvertido=0;
		Scanner lector = new Scanner(System.in);
		if ((Integer.parseInt(numero1) % 1) == 0) {
			numeroConvertido=Integer.parseInt(numero1);
		} else {
			do {
				System.out.println("El valor introducido no es un numero,\n Introduzca un numero: ");
				numero2 = lector.nextLine();
				if ((Integer.parseInt(numero2) % 1) == 0) {
					numeroConvertido=Integer.parseInt(numero2);
				}
			} while (Integer.parseInt(numero2) % 1 != 0);
		}
		return numeroConvertido;
	}

	/*
	 * public static String[] meses(int a) { String[] meses= {"Enero",
	 * "Febrero","Marzo","Abril",
	 * "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre",
	 * "Diciembre"}; for (int i=0;i<12;i++) { System.out.println(meses[i]); } return
	 * meses; }
	 */
}
