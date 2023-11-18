package casosAvanazdos;

public class caso25 {

	public static void main(String[] args) {
		quienTrabaja();
	}

	public static void quienTrabaja() {
		String turno;
		int dia;
		
		dia=basicos.numericos("Introduzca el dia en numero: ");
		turno=basicos.caracteres("Introduzca si es de manana o de tarde");
		
		if(turno.equals("manana")) {
			if(dia%2==0) {
				System.out.println("Le toca a loca");
			}else {
				System.out.println("Le toca a Pepe");
			}
		}else {
			if(dia%2==0) {
				System.out.println("Le toca a pepe");
			}else {
				System.out.println("Le toca a lola");
			}
		}
	}

}
