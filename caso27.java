package casosAvanazdos;

import java.util.Arrays;

public class caso27 {

	public static void main(String[] args) {
		diferenciaEdades();
	}

	private static void diferenciaEdades() {
		String[] nombre=new String[3];
		int[] edad=new int[3];
		int diferencia1;
		int diferencia2;
		int edadTotal=0;
		
		for(int i=0;i<3;i++) {
			nombre[i]=basicos.caracteres("Introduzca el nombre del "+(i+1)+" hijo: ");
			edad[i]=basicos.numericos("Introduzca la edad del "+(i+1)+" hijo");
		}
		for (int i=0;i<edad.length;i++) {
			edadTotal+=edad[i];
		}
		diferencia1=edad[0]-edad[1];
		diferencia2=edad[1]-edad[2];
		System.out.println(nombre[0]+" es "+diferencia1+" anos mayor que "+nombre[1]+", "+nombre[1]+" es "+diferencia2+" anos mayor que "+nombre[2]);
		System.out.println("La edad media es: "+(edadTotal/edad.length));
	}

}
