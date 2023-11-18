package cantidadDigitos;

import java.util.Scanner;

public class cantidadDigitos {

	public static void main(String[] args) {
		cantidadDigito();
	}

	public static void cantidadDigito() {
		int numero;
		String caracteres;
		
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingrese un numero entre el 0 y el 9999: ");
		numero=lector.nextInt();
		lector.nextLine();
		while (numero<0||numero>9999) {
			System.out.println("Ingrese un valor valido en el rango indicado");
			numero=lector.nextInt();
			lector.nextLine();
		}
		caracteres=Integer.toString(numero);
		System.out.println("La cantidad de dígitos es: " + caracteres.length());
		lector.close();
	}

}
