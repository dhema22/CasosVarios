package casosAvanazdos;

public class caso19 {

	public static void main(String[] args) {
		productoSuma();
	}
	
	public static void productoSuma() {
		int numero1;
		int numero2;
		
		numero1=basicos.numericos("Introduzca el primero numero para multiplicar: ");
		numero2=basicos.numericos("Introduzca el segundo numero para multiplicar: ");
		
		for(int i=1; i<=numero2; i++) {
			System.out.print(numero1+"+");
		}
		System.out.println();
		for(int i=1;i<=numero1; i++) {
			System.out.print(numero2+"+");
		}
	}

}
