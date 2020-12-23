class NoSolution extends Exception{
	String msg;
	NoSolution(String str) {
		msg = str;
	}
	public String toString(){
		return ("NoSolution: " + msg) ;
	}
}

public class Embotelladora {
// @param pequenas: n´umero de botellas en almac´en de 1L
// grandes : n´umero de botellas en almac´en de 5L
// total : n´umero total de litros que hay que embotellar
// @return n´umero de botellas peque~nas necesarias para embotellar el total de l´ıquido, teniendo
// en cuenta que hay que minimizar el n´umero de botellas peque~nas: primero
// se rellenan las grandes
// @throws NoSolution si no es posible embotellar todo el l´ıquido
public int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
//
}

}
