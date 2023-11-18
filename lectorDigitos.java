package caso9;

import java.util.Arrays;
import java.util.Scanner;

public class lectorDigitos {

	public static void main(String[] args) {
		cantidadDigitos();
	}

	private static void cantidadDigitos() {
		int numero;
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduzca un número entre 0 y 9999: ");
		numero=lector.nextInt();
		while (numero<0||numero>9999) {
			System.out.println("Introduzca un numero en el rango indicado");
			numero=lector.nextInt();
			lector.nextLine();
		}
		if(numero>=0&&numero<=9) {
			System.out.println("tiene un digito");
		} else if(numero>=10&&numero<=99) {
			System.out.println("tiene dos digitos");
		} else if(numero>=100&&numero<=999) {
			System.out.println("Tiene 3 digitos");
		} else if (numero>=1000&&numero<=9999) {
			System.out.println("Tiene 4 digitos");
		}
		
		lector.close();
	}
//pensar en como resolverlo usando arrays.
}
