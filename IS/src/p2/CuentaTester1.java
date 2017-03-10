package p2;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CuentaTester1 extends TestCase 
{
	Cuenta cuenta;

	public CuentaTester1(String sTestName)
	{
		super(sTestName);
	}

	public void setUp() throws Exception
	{
		cuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de Tal");
	}

	public void tearDown() throws Exception
	{
	}
	
	public void testIngresar1000() 
	{
		try {
			cuenta.ingresar(1000);
			assertTrue(cuenta.getSaldo()==1000.0);
		}
		catch (Exception e) 
		{
			fail("No debería haber fallado");
		}
	}
	
	public void testRetirar1000() 
	{
		try 
		{
			cuenta.retirar(1000);
		}
		catch (Exception e) 
		{
		}
		assertTrue(cuenta.getSaldo()==0.0);
	}
	
	public void testIngresoYRetirada() 
	{
		try 
		{
			cuenta.ingresar(1000.0);
			cuenta.retirar(300.0);
		}
		catch (Exception e) 
		{
		}
		
		assertTrue(cuenta.getSaldo()==700.0);
	}
	
	public static void main(String args[]) 
	{
	//	junit.swingui.TestRunner.run(CuentaTester1.class);
	}
}