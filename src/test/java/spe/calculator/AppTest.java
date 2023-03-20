package spe.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 private static final double delta = 1e-10;
	    App calculator;

	    @Before
	    public void init() {
	        calculator = new App();
	    }

	    @Test
	    public void rootTruePositive()
	    {
	        assertEquals("Square Root Test 1", 1, calculator.squareRoot(1), delta);
	        assertEquals("Square Root Test 2", 1.4142135623730951, calculator.squareRoot(2), delta);
	        assertEquals("Square Root Test 3", 1.7320508075688772, calculator.squareRoot(3), delta);
	        assertEquals("Square Root Test 4", 2, calculator.squareRoot(4), delta);

	    }

	    @Test
	    public void rootFalsePositive()
	    {
	        assertNotEquals("Square Root Test 1", 2, calculator.squareRoot(1), delta);
	        assertNotEquals("Square Root Test 2", 1.5, calculator.squareRoot(2), delta);
	        assertNotEquals("Square Root Test 3", 1.8, calculator.squareRoot(3), delta);
	        assertNotEquals("Square Root Test 4", 3, calculator.squareRoot(4), delta);

	    }

	    @Test
	    public void factorialTruePositive()
	    {
	        assertEquals("Factorial Test 1", 1, calculator.factorial(1), delta);
	        assertEquals("Factorial Test 2", 2, calculator.factorial(2), delta);
	        assertEquals("Factorial Test 3", 6, calculator.factorial(3), delta);
	        assertEquals("Factorial Test 4", 24, calculator.factorial(4), delta);

	    }

	    @Test
	    public void factorialFalsePositive()
	    {
	        assertNotEquals("Factorial Test 1", 5, calculator.factorial(1), delta);
	        assertNotEquals("Factorial Test 2", 10, calculator.factorial(2), delta);
	        assertNotEquals("Factorial Test 3", 25, calculator.factorial(3), delta);
	        assertNotEquals("Factorial Test 4", 50, calculator.factorial(4), delta);

	    }

	    @Test
	    public void logTruePositive()
	    {
	        assertEquals("ln Test 1", 0, calculator.ln(1), delta);
	        assertEquals("ln Test 2", 0.6931471805599453, calculator.ln(2), delta);
	        assertEquals("ln Test 3", 1.0986122886681098, calculator.ln(3), delta);
	        assertEquals("ln Test 4", 1.3862943611198906, calculator.ln(4), delta);
	    }	


	    @Test
	    public void logFalsePositive()
	    {
	    	assertNotEquals("ln Test 1", 1, calculator.ln(1), delta);
	    	assertNotEquals("ln Test 2", 0.9, calculator.ln(2), delta);
	    	assertNotEquals("ln Test 3", 1.5, calculator.ln(3), delta);
	    	assertNotEquals("ln Test 4", 2.3, calculator.ln(4), delta);
	    }

	    @Test
	    public void powerTruePositive()
	    {
	        assertEquals("power Test 1", 1, calculator.power(1,0), delta);
	        assertEquals("power Test 2", 1, calculator.power(1,1), delta);
	        assertEquals("power Test 3", 4, calculator.power(2,2), delta);
	        assertEquals("power Test 4", 9, calculator.power(3,2), delta);
	    }

	    @Test
	    public void powerFalsePositive()
	    {
	    	assertNotEquals("power Test 1", 0, calculator.power(1,0), delta);
	    	assertNotEquals("power Test 2", 10, calculator.power(1,1), delta);
	    	assertNotEquals("power Test 3", 0.4, calculator.power(2,2), delta);
	        assertNotEquals("power Test 4", 99, calculator.power(3,2), delta);
	    }
}
