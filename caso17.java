package casosAvanazdos;

public class caso17 {

	public static void main(String[] args) {
		supersticioso();
	}

	private static void supersticioso() {
		String [] impares=new String[20];
		for (int i = 1; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
				impares[i]=String.valueOf(i);
			}
		}
		//Preguntar porque como reducir el tamaño del arreglo y solo almacenar los valores impares
		System.out.println(" ");
		System.out.println(impares[1]+" Mi numero de la suerte \n No soy supersticioso "+impares[19]);
	}
}
