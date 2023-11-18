package casosAvanazdos;


public class caso28 {

	public static void main(String[] args) {
		prestamo();
	}

	public static void prestamo() {
		double prestado;
		double plazoPago;
		double cuotas;
		double tiempoPagoSuperior;
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		prestado = basicos.numericos("Introduzca la cantidad de dinero prestado: ");
		plazoPago = basicos.numericos("Introduzca el plazo de pago: ");
		cuotas = prestado / plazoPago;
		tiempoPagoSuperior = (plazoPago / 12); //calculo la cantidad de veces que se repite el año en el plazo indicado 
		if (plazoPago >= 12) {
			do {
				for (int i = 0; i < 12; i++) {
					System.out.println("cuota mes: " + meses[i] + " " + cuotas);
				}
				tiempoPagoSuperior = tiempoPagoSuperior - 1;
			} while (tiempoPagoSuperior >= 1); 
			//necesito se repita tantas veces como el número de veces que se repite el año siempre que sea un entero.
			/*si la división no es exacta necesito hacer un recorrido de la parte restante de la división
			y como en si, es un porcentaje, multiplico ese pequeño número restante por la cantidad de meses
			para saber el equivalente que representa en meses. */
			if (tiempoPagoSuperior > 0 && tiempoPagoSuperior < 1) { 
				tiempoPagoSuperior = tiempoPagoSuperior * 12;
				for (int i = 0; i < tiempoPagoSuperior; i++) {
					System.out.println("cuota mes: " + meses[i] + " " + cuotas);
				}
			}
		} else {
			for (int i = 0; i < plazoPago; i++) {
				System.out.println("cuota mes: " + meses[i] + " " + cuotas);
			}
		}
	}
}
