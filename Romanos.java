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
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	public static int convierte(String s) throws IllegalArgumentException {
		 char Rom[]= {' ','I','V','X','L','C','D','M'}; 
	     int valor[] = {0,1,5,10,50,100,500,1000};
	     int ant = 0;
	     int suma = 0;
	     char letra = ' ';             

		if(esSimbolo(s)==true) {
			if(s != null) {
				if(sonCuatro(s)==false) {
					 for(int i = 0; i < s.length(); i++){
				    	 letra = s.charAt(i);
			             for(int j = 0; j < Rom.length; j++){
			            	  if(letra == Rom[j]){
			            		  suma = suma + valor [j];
			            		  if( ant < valor[j]){
			            			  suma = suma - ant*2;			            			  
			            		  }
		                          ant = valor[j];
			            	  }
			             }
				     }
				     return suma;
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
