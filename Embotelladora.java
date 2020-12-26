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
	// @param pequenas: numero de botellas en almacen de 1L
	// grandes : numero de botellas en almacen de 5L
	// total : numero total de litros que hay que embotellar
	// @return numero de botellas pequeñas necesarias para embotellar el total de liquido, teniendo
	// en cuenta que hay que minimizar el numero de botellas pequeñas: primero
	// se rellenan las grandes
	// @throws NoSolution si no es posible embotellar todo el liquido
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int totalg=grandes*5;
		int totalp=pequenas*1;//Lo dejo identificado como algo simbolico
		int pusadas=0;
		int gusadas=0;
	
		
		if(pequenas==0 && grandes==0) {
			throw new NoSolution("No hay botellas.");
		}else if(total==0){
			throw new NoSolution("No se ha definido un total (total = 0).");
		}else{
			if((totalg+ totalp) < total) {//Si el total de las grandes y pequeñas no llega al total a embotellas -> No hay solucion
				throw new NoSolution("No hay suficientes botellas para rellenar el total.");
			}else if(pequenas==0 && grandes != 0) {//Si no tenemos pequeñas pero si grandes
				if(totalg%total != 0) {//Luego si ademas no el total de lass grandes no es divisible entre el total
					throw new NoSolution("Solo hay botellas grandes y no podemos rellenar correctamente el total.");
				}
			}else if(pequenas != 0 && grandes != 0) {//Si tenemos grandes y pequeñas
				if(totalg>total && (totalg%total != 0)) {//Pero el total de las grandes  es mayor que el total a embotellar y no es divisible
					gusadas=(total/5)-((total/5)%5); //Cogemos el numer de botellas grandes que usaremos (nos quedamos con la parte entera)
					if(totalp < (total-gusadas*5)){//Y si el total de las pequeñas no  llega al necesario a rellenar del total y las grandes usadas
						throw new NoSolution("No tenemos botellas pequeñas suficientes para rellenar el resto con las grandes.");
					}
				}
			}
			gusadas=(total/5)-((total/5)%5);//Las grandes que usamos
			pusadas = total - gusadas*5;//Las pequeñas que usamos
			return pusadas;	
		}
	}
}
