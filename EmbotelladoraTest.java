import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest {
	
	//C1: Que el número de botellas sea insuficiente para rellenar el líquido.
	@Test(expected=NoSolution.class) 
	public void testC1() throws NoSolution {
		int p = 2;
		int g = 1;
		int t = 8;
		Embotelladora.calculaBotellasPequenas(p,g,t);
	}
	
	//C1.b: Que el número de botellas sea 0.
	@Test (expected=NoSolution.class)
	public void testC1b() throws NoSolution {
		int p = 0;
		int g = 0;
		int t = 8;
		Embotelladora.calculaBotellasPequenas(p,g,t);
	}
	
	//C2: Que solo haya botellas grandes y el total no sea múltiplo de 5.
	@Test (expected=NoSolution.class)
	public void testC2() throws NoSolution {
		int p = 0;
		int g = 3;
		int t = 12;
		Embotelladora.calculaBotellasPequenas(p,g,t);
	}
	
	//C2.b: Que haya botellas grandes de sobra pero no pequeñas para llegar al total que no es múltiplo de 5.
	@Test (expected=NoSolution.class)
	public void testC2b() throws NoSolution {
		int p = 2;
		int g = 2;
		int t = 8;
		Embotelladora.calculaBotellasPequenas(p,g,t);
	}
	
	//C3: Que el total a embotellar sea 0
	@Test (expected=NoSolution.class)
	public void testC3()throws NoSolution {
		int p = 2;
		int g = 1;
		int t = 0;
		Embotelladora.calculaBotellasPequenas(p,g,t);
	}
}
