import java.lang.IllegalArgumentException;

public class Bisiestos {
	// @param a un número entero positivo
	// @return true si a es un año bisiesto
	// false en caso contrario.
	// @throws IllegalArgumentException si a no es un parámetro válido.
	public static boolean esBisiesto(int a) throws IllegalArgumentException { //He tenido que cambiar el método a static para el test
		//Un año es bisiesto en el calendario Gregoriano, si es divisible entre 4 y no divisible entre 100,
		//y también si es divisible entre 400.
		if(a>=0){
			
			if(((a%4)==0 && (a%100)!=0) || (a%400)==0) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new IllegalArgumentException("Año no válido.");
		}
		
	}
	

}
