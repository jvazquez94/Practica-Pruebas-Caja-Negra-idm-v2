import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;

public class Romanos {
	// @param s es un numero romano
	// @return el numero s en base 10
	// @throws IllegalArgumentException si s no es un numero romano
	
	public static boolean esSimbolo(String s) {
		boolean esta=false;
		
		for(int i=0; i<s.length();i++) {
			if((s.charAt(i) == 'I') || (s.charAt(i) == 'V') || (s.charAt(i) == 'X') || (s.charAt(i) == 'L')
					|| (s.charAt(i) == 'D') || (s.charAt(i) == 'C') || (s.charAt(i) == 'M')) {
				esta = true;
			}else {
				esta = false;
				break;
			}
		}
		return esta;
	}
	
	public static boolean sonCuatro(String s) {
		if(s.length()==4){
			if((s.charAt(0) == s.charAt(1)) && (s.charAt(0) == s.charAt(2)) && (s.charAt(0) == s.charAt(3))) {
				System.out.println(s.charAt(0)+ " "+s.charAt(1)+" "+s.charAt(2)+" "+s.charAt(3));
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	public static int convierte(String s) throws IllegalArgumentException {
		if(esSimbolo(s)==true) {
			if(s == null) {
				if(sonCuatro(s)==false) {
					return 10;
				}else {
					throw new IllegalArgumentException("Cuatro símbolos seguidos. Incorrecto.");
				}
			}else {
				throw new NullPointerException("String = NULL.");
			}
		}else {
			throw new IllegalArgumentException("Símbolo no válido.");
		}
	}
}
