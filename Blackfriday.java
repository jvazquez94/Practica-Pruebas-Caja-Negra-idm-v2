import java.lang.IllegalArgumentException;
public class Blackfriday {
// @param precioOriginal es el precio de un producto marcado en la etiqueta
// porcentajeDescuento es el descuento a aplicar expresado como un porcentaje que ha de ser >= 0
// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
// un descuento de porcentajeDescuento
// @throws IllegalArgumentException si precioOriginal es negativo o porcentajeDescuento es negativo
	
	private static boolean fechaInco(int fecha) {
		boolean esIncorrecta=false;
		int dia = (fecha/100)-((fecha/100)%1);
		int mes = fecha-(dia*100);
		
		//Dia incorecto, ponemos hasta 31 dias de mes
		if(dia<1 || dia >31) {
			esIncorrecta=true;
		//Mes incorrecto
		}else if(mes<1 || mes>12) {
			esIncorrecta=true;
		}
		return esIncorrecta;
	}
	
	public static double precioFinal
	(double precioOriginal, double porcentajeDescuento,int fecha) throws IllegalArgumentException{
	//fecha es un integer 2911 es para el descuento del 29 de noviembre
		//Empezamos con las caracterizaciones que condicionan al illegal argument
		double precioFinal = precioOriginal * (porcentajeDescuento/100);
		
		if(precioOriginal <= 0) {
			throw new IllegalArgumentException("Precio original inválido.");
		}else if(porcentajeDescuento < 0) {
			throw new IllegalArgumentException("Descuento inválido.");
		}else if((fecha <= 0) || (fechaInco(fecha)==true)) {
			throw new IllegalArgumentException("Fecha inválida.");
		}else if(fecha != 2911) {
			precioFinal = precioOriginal;
		}
		return precioFinal;
	}
}
