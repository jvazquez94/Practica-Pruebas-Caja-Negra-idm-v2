import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
	
public class BisiestosTest {
	
	   @Test public void test() 
	   {
	      int anyo=2008;
	      assertTrue("¿Es "+ anyo +" bisiesto?", true == Bisiestos.esBisiesto(anyo));
	   }
	   
	   @Test public void test2() 
	   {
	      int anyo=2009;
	      assertTrue("¿Es "+ anyo +" bisiesto?", false == Bisiestos.esBisiesto(anyo));
	   }
	   
	   @Test(expected=IllegalArgumentException.class) 
	   public void AnyoInvalidTest()
	   {
	      int anyo=-9;
	      Bisiestos.esBisiesto(anyo);
	   }
	   
	   //Caso frontera
	   @Test
	   public void test3()
	   {
	      int anyo=0;
	      assertTrue("¿Es "+ anyo +" bisiesto?", true == Bisiestos.esBisiesto(anyo));
	   }
	   
}


