package casosAvanazdos;

import java.util.Arrays;

public class caso18 {

	public static void main(String[] args) {
		gestorNotas();
	}

	public static void gestorNotas() {
		float [] notas=new float[5];
		int notaTotal=0;
		
		for (int i=0;i<notas.length;i++) {
			do {
				notas[i]=basicos.numericos("Introduzca la nota del alumno "+(i+1));
			}while(notas[i]<0||notas[i]>10);
		}

		for (int i=0;i<notas.length;i++) {
			notaTotal+=notas[i];
		}
		Arrays.sort(notas);
		System.out.print("la mayor nota es "+notas[4]+" y la menor es "+notas[0]+"\n");
		System.out.print("La nota media es de: "+ notaTotal/notas.length);
	}
}
