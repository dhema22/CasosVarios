package casosAvanazdos;

public class caso11 {

	public static void main(String[] args) {
		sumaProductoMedia();
	}

	private static void sumaProductoMedia() {
		int numero;
		int suma=0;
		int producto=1;
		int contador=0;
		int media;
		
		do {
			numero=basicos.numericos("Introduzca numeros para calcular su suma, producto y media: ");
			System.out.println("cuando quiera dejar de introducir valores introduzca 0");
			suma=suma+numero;
			producto=producto*numero;
			contador+=1;
			media=suma/contador;
			System.out.println("suma: "+suma+" producto: "+producto+" media "+media+" "+contador);
		}while(numero!=0);
		
	}

}
