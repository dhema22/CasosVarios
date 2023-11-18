package caso10;

import java.util.Scanner;

public class sumaProducto {

	public static void main(String[] args) {
		sumaYProducto();
	}

	public static void sumaYProducto() {
		int numero1;
		int numero2;
		int numero3;
		int suma;
		int producto;
		Scanner lector = new Scanner(System.in);

		/*
		 * Como solo se pueden realizar operaciones aritmeticas agrupando los terminos
		 * de dos en dos (ej: no puedo sumar 3 números al mismo tiempo, 1+2+3, primero
		 * sumo 1+2 y a ese resultado sumo el 3), primero pido dos números, fuerzo a que
		 * ambos números sean positivos para dar al menos una solución y luego pregunto
		 * si quiere añadir mas números, doy la posibilidad de decirdir si quiere o no
		 * seguir realizando operaciones y, en caso de que no quiera que introduzca un
		 * valor negativo y no lo tomo en cuenta para las operaciones, finalmente
		 * retorno el valor de la suma y la multiplicacion que se efectuó de último.
		 */

		System.out.println("Introduzca un numero: ");
		numero1 = lector.nextInt();
		lector.nextLine();
		System.out.println("Introduzca otro numero;");
		numero2 = lector.nextInt();
		if (numero1 >= 0 && numero2 >= 0) {
			suma = numero1 + numero2;
			producto = numero1 * numero2;
			System.out.println("La suma de los dos primeros numeros es: " + suma + " y su producto es: " + producto);
			do {

				System.out.println("Puede introducir otro numero si quiere, en caso de que no quiera"
						+ " introduzca un valor negativo: ");
				numero3 = lector.nextInt();
				lector.nextLine();
				if (numero3 >= 0) {
					suma = suma + numero3;
					producto = producto * numero3;
					System.out.println("Añadiendo el siguiente numero introducido la suma es: " + suma
							+ " y el producto es: " + producto);
				} else {
					System.out.println("El numero introducido en negativo y no se toma en cuenta"
							+ " la suma final es: " + suma + " y el producto final es " + producto);
				}
			} while (numero3 >= 0);
		} else {
			System.out.println("Los valores introducidos tienen que ser positivos");
		}
		lector.close();
	}

}

/*
 * do { System.out.
 * println("Introduzca los números que quiera para sumarlos y multiplicarlos, cuando no"
 * + "quiera introducir mas, introduzca un numero negativo: "); for(int i=0;i<
 * (?); i++) { numeroOperador[i]=lector.nextInt(); } } while (numero>=0);
 */
