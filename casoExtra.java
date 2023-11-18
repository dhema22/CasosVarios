package casosAvanazdos;

public class casoExtra {

	public static void main(String[] args) {
		showYears();
	}
	
	public static void showYears() {
		int born;
		
		do {
			born=basicos.numericos("Introduzca su año de nacimiento: ");
		}while(born>=2021);
		for(int i=born; i<=2022;i++) {
			System.out.print(i+"-");
		}
	}

}
