import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.*;


public class BlackfridayTest {	
	//C1:Si no estamos a 29 de noviembre
	@Test
	public void testC1() {
		double pOrig = 10;
		double d = 50;
		int f = 2912;
		double infi = 0.000001;
		
		/*Tengo que usar la funcion de java.lan.Double compare para comprobar que los precios son iguales debido a que 
		 * no estamos en 29 de noviembre por ello uso assertEquals con 0 ya que si es 0 n el compare, es que son iguales
		 * y -1 si por lo tanto estamos a 29 de noviembre y se aplica el descuento, por lo que no serian iguales*/
		assertEquals("0 si es igual, -1 si es distinto",0,Double.compare(Blackfriday.precioFinal(pOrig, d, f), pOrig));
	
	}
	
	//C2.a: Valor negativo o 0 para precio original
	@Test(expected=IllegalArgumentException.class)
	public void testC2a() {
		double pOrig = -10;
		double d = 50;
		int f = 2912;
		
		Blackfriday.precioFinal(pOrig,d,f);
	}
	
	//C2.b: Valor negativo para descuento
	@Test(expected=IllegalArgumentException.class)
	public void testC2b() {
		double pOrig = 10;
		double d = -50;
		int f = 2912;
		
		Blackfriday.precioFinal(pOrig,d,f);
	}
	
	//C3: fecha incorrecta
	//C3.a: fecha negativa o menor 0
	@Test(expected=IllegalArgumentException.class)
	public void testC3a() {
		double pOrig = 10;
		double d = 50;
		int f = -2912;
		
		Blackfriday.precioFinal(pOrig,d,f);
	}
	
	//C3.b: fecha incorrecta
	//C3.b.1: fecha con dia incorrecto
	@Test(expected=IllegalArgumentException.class)
	public void testC3b1() {
		double pOrig = 10;
		double d = 50;
		int f = 4912;
		
		Blackfriday.precioFinal(pOrig,d,f);
	}
	
	//C3.b.2: fecha con mes incorecto
	@Test(expected=IllegalArgumentException.class)
	public void testC3b2() {
		double pOrig = 10;
		double d = 50;
		int f = 2915;
		
		Blackfriday.precioFinal(pOrig,d,f);
	}	
}
