package casosAvanazdos;

public class caso15 {

	public static void main(String[] args) {
		celsiusFarenheit();
	}
	
	public static void celsiusFarenheit() {
		double celsius;
		double farenheit;
		String continuar;
		
		celsius=basicos.numericos("Introduzca la temperatura en Celsius para convertir a Farenheit:");
		farenheit=((celsius*9)/5)+32;;
		System.out.println("La temperatura en farenheit es: "+farenheit);
		continuar=basicos.caracteres("Desea continuar [s/n]:");
		while(continuar.equals("s")) {
			celsius=basicos.numericos("Introduzca una nueva temperatura a convertir a farenheit: ");
			farenheit=((celsius*9)/5)+32;
			System.out.println("La temperatura en farenheit es: "+farenheit);
			continuar=basicos.caracteres("Desea continuar [s/n]:");
		}
	}

}
