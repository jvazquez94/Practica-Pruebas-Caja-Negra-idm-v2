import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanosTest {
	
	//caso: simbolo correcto
	@Test(expected=IllegalArgumentException.class)
	public void numIncorrecto1() {
		String r = "IZI";
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
		
}
