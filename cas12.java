package casosAvanazdos;

public class cas12 {

	public static void main(String[] args) {
		/*Realizar un programa en Java que lea una secuencia de números 
		 y determine cual es el mayor de ellos y el número de veces que aparece.*/
		mayorMenorContinui();
	}

	public static void mayorMenorContinui() {
		int numero1=Integer.MIN_VALUE; //asigna el menor valor posible para un int
		int numero2=Integer.MAX_VALUE;
		String continuar;
		int mayor;
		int numero3;
		int contador=0;
		

		numero1=basicos.numericos("Introduzca un numero: ");
		numero2=basicos.numericos("Introduzca un segundo número: ");
		if(numero1>numero2) {
			mayor=numero1;
			contador+=1;
			System.out.println("El mayor es: "+mayor+" y se repite: "+contador);
		}else if (numero1==numero2){
			mayor=numero1;
			contador+=2;
			System.out.println("El mayor es: "+mayor+" y se repite: "+contador);
		}else {
			mayor=numero2;
			contador+=1;
		}
		continuar=basicos.caracteres("Se desea continuar (s /n): ");
		while(continuar.equalsIgnoreCase("s")) {
			numero3=basicos.numericos("Introduzca otro numero para comparar: ");
			if(numero3>mayor) {
				mayor=numero3;
				contador=+1;
				System.out.println("El mayor es: "+mayor+" y se repite: "+contador);
			} else if (numero3==mayor){
				contador+=1; //mantiene el conteo ya existente
				System.out.println("El mayor es: "+mayor+" y se repite: "+contador);
			} else {
				System.out.println("El mayor es: "+mayor+" y se repite: "+contador);
			}
			continuar=basicos.caracteres("Se desea continuar (s /n): ");
		}
	}

}
