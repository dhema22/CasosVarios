package casosAvanazdos;

public class caso21 {

	public static void main(String[] args) {
		diaSemana();
	}
	public static void diaSemana() {
		int dia;
		String [] semana= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		do {
			dia=basicos.numericos("Introduzca un numero que representa el dia de la semana: ");
		}while(dia>7||dia<1);
		if(dia>=1&&dia<=5) {
			System.out.println("Es laboraleble y es "+semana[dia-1]);
		} else {
			System.out.println("Es fin de semana y es "+semana[dia-1]);
		}
	}
}
