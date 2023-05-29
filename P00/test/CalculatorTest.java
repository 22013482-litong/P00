import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Addtest() {
		//fail("Not yet implemented");//
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
				
	}
	@Test
	public void subtracttest() {
	int a = 555;
	int b = 123;
		
	Calculator cal = new Calculator();
	int actual = cal.subtract(a, b); 
		 
	int expected = 432;
	assertEquals (expected, actual);
	}
	
	@Test
	public void multiplytest() {
	int a = 20;
	int b = 15;
		
	Calculator cal = new Calculator();
	int actual = cal.multiply(a, b); 
		 
	int expected = 300;
	assertEquals (expected, actual);
	}

	@Test
	public void dividetest() {
	int a = 400;
	int b = 10;
		
	Calculator cal = new Calculator();
	int actual = cal.divide(a, b); 
		 
	int expected = 40;
	assertEquals (expected, actual);
	}
	
}
