package casosAvanazdos;

public class caso24 {

	public static void main(String[] args) {
		sueldoMensual();
	}
	public static void sueldoMensual(){
		double sueldoBruto=0;
		double sueldo;
		String[] meses= {"Enero", "Febrero","Marzo","Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		sueldoBruto=basicos.numericos("Introduza su sueldo bruto anual: ");
		sueldo=sueldoBruto/12;
		for(int i=0;i<12;i++) {
			System.out.println(meses[i]+":"+ sueldo);
		}
	}
}
