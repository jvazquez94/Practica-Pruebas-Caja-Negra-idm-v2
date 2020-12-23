import java.lang.IllegalArgumentException;

public class Bisiestos {
	// @param a un n�mero entero positivo
	// @return true si a es un a�o bisiesto
	// false en caso contrario.
	// @throws IllegalArgumentException si a no es un par�metro v�lido.
	public static boolean esBisiesto(int a) throws IllegalArgumentException { //He tenido que cambiar el m�todo a static para el test
		//Un a�o es bisiesto en el calendario Gregoriano, si es divisible entre 4 y no divisible entre 100,
		//y tambi�n si es divisible entre 400.
		if(a>=0){
			
			if(((a%4)==0 && (a%100)!=0) || (a%400)==0) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new IllegalArgumentException("A�o no v�lido.");
		}
		
	}
	

}
