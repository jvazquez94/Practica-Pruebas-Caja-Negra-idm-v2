import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanosTest {
	
	//caso: simbolo correcto
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto1() {
		String r = "IIJ";
		Romanos.convierte(r);
	}
	
	//caso: simbolo null
	@Test(expected=NullPointerException.class)
	public void numIncorrecto2() {
		String r = null;
		Romanos.convierte(r);
	}
	
	//caso: no se pueden mas de 3 simbolos iguales seguidos
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto3() {
		String r = "IIII";
		Romanos.convierte(r);
	}
	
	//caso: no se pueden restar dos simbolos seguidos tiene que haber un simbolo de separación
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto4() {
		String r = "XXL";
		Romanos.convierte(r);
	}
	
	//caso: simbolo I solo puede restar a V  y X
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto5() {
		String r = "IL";
		Romanos.convierte(r);
	}
	
	//caso: simbolo X solo puede restar a D y M
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto7() {
		String r = "XD";
		Romanos.convierte(r);
	}
		
}
