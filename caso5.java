package caso5;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		saberHabitación();
	}

	private static void saberHabitación() {
		int camas[]= {2,1,3,2,1};
		String coloresHabitacion[]= {"azul","roja","verde","rosa","gris"};
		String planta[]= {"primera","primera","segunda","segunda","tercera"};
		int numero;
		Scanner lector=new Scanner(System.in);
		
		System.out.println(" 1.azul\n 2.roja\n 3.verde\n 4.rosa\n 5.gris \n"
				+ " Introduzca el numero de habitacion que quiere: ");
		numero=lector.nextInt();
		if (numero>=1&&numero<=5) {
		System.out.println(" La habitacion que escogio es la: "+coloresHabitacion[numero-1]+" tiene "+camas[numero-1]+" camas"
				+" y esta en la planta:"+planta[numero-1]);
		} else {
			System.out.println("El numero "+numero+" no tiene ninguna habitacion asignada");
		}
		lector.close();
	}
}
