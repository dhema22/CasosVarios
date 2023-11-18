package casosAvanazdos;

public class caso14 {

	public static void main(String[] args) {
		paresRango();
	}
	
	public static void paresRango(){
		int menor=0;
		int a;
		int mayor=0;
		int b;
		int sumaPar = 0;
		int multiplicaPar = 1;
		
		System.out.print("Introduzca los valores que seran los límites\n"
				+ "del rango donde obtener los  numero pares, solo se permite para\n"
				+ "numeros positivos, si los números son negativos se pediran hasta que\n"
				+ "sean positivos.\n");
		do {
			a=basicos.numericos("Introduzca el valor a: ");
		}while(a<0);
		do {
			b=basicos.numericos("Introduzca el valor b :");
		}while(b<0);
		if(a>b) {
			mayor=a;
			menor=b;
		}else {
			menor=a;
			mayor=b;
		}
		for(int i=menor;i<=mayor;i++) {
			if(i%2==0) {
				sumaPar=sumaPar+i;
				multiplicaPar=multiplicaPar*i;
			}
		}

		System.out.println("la suma de los pares es: "+sumaPar+" y la multiplicación es: "+multiplicaPar);
	}
}
