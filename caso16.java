package casosAvanazdos;

public class caso16 {

	public static void main(String[] args) {
		mostrarPantalla();
	}

	public static void mostrarPantalla() {
		for (int i = 1; i <= 20; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("\n");
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("\n");
		for (int i = 100; i >= 0; i -= 10) {
			System.out.print(" " + i);
		}
		System.out.println("\n");
		for (int i = 1; i <= 26; i++) {
			if ((i % 2 == 0)&&(i%8!=0)) {
				System.out.print(" " + i);
			}
		}
	}

}
