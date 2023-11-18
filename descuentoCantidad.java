package caso8;

import java.util.Scanner;

public class descuentoCantidad {

	public static void main(String[] args) {
		descuento();
	}

	public static void descuento() {
		int cantidad;
		double precio;
		double precioPaga;
		double descuento;
		Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de articulos que compro:");
		cantidad = lector.nextInt();
		lector.nextLine();
		while (cantidad<0) {
			System.out.println("Introduzca una cantidad válidad para los articulos");
			cantidad=lector.nextInt();
			lector.nextLine();
		}
		System.out.println("Introduzca el precio pagado: ");
		precio = lector.nextDouble();
		lector.nextLine();
		while (precio<0) {
			System.out.println("Introduzca una cantidad válidad para el precio");
			precio=lector.nextInt();
			lector.nextLine();
		} 

		if (cantidad > 100) {
			precioPaga = precio * (0.6);
			descuento = precio * (0.4);
			System.out
					.println("El precio que va a pagar es:" + precioPaga + "y el descuento aplicado es: " + descuento);
		} else if (cantidad >= 25 && cantidad <= 100) {
			precioPaga = precio * 0.8;
			descuento = precio * 0.2;
			System.out.println("El precio que va a pagar es:" + precioPaga + "y el descuento aplicado es:" + descuento);
		} else if (cantidad >= 10 && cantidad <= 24) {
			precioPaga = precio * 0.9;
			descuento = precio * 0.1;
			System.out
					.println("El precio que va a pagar es: " + precioPaga + "y el descuento aplicado es:" + descuento);
		} else {
			System.out.println("El precio que paga es: " + precio);
		}

		lector.close();
	}

}
