package cse360assign3;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		
		// Test to make sure total is equal to zero
		assertEquals(calc.getTotal(), 0);
		
		// Test to make sure total has been updated
		calc.add(10);
		assertEquals(calc.getTotal(), 10);
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		
		// Test the addition of zero to the initial value is still zero
		calc.add(0);
		assertEquals(calc.getTotal(), 0);
		calc.add(5);
		assertEquals(calc.getTotal(), 5);
		calc.add(10);
		assertEquals(calc.getTotal(), 15);
		
		// Test the addition of a negative number
		calc.add(-20);
		assertEquals(calc.getTotal(), -5);
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		
		calc.subtract(10);
		assertEquals(calc.getTotal(), -10);
		calc.subtract(5);
		assertEquals(calc.getTotal(), -15);
		
		// Test the subtraction of a negative number
		calc.subtract(-30);
		assertEquals(calc.getTotal(), 15);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		
		// Test to make sure that multiplying any number
		// to the initial value is still zero
		calc.multiply(10);
		assertEquals(calc.getTotal(), 0);
		calc.add(5);
		calc.multiply(10);
		assertEquals(calc.getTotal(), 50);
		calc.multiply(1);
		assertEquals(calc.getTotal(), 50);
		
		// Test multiplying by zero to make sure it sets total to zero
		calc.multiply(0);
		assertEquals(calc.getTotal(), 0);
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		
		// Test to make sure that dividing the initial value of total (i.e., 0)
		// by any number is still equal to zero.
		calc.divide(2);
		assertEquals(calc.getTotal(), 0);
		
		// Add a number and then test division by an integer
		calc.add(50);
		calc.divide(2);
		assertEquals(calc.getTotal(), 25);
		calc.divide(1);
		assertEquals(calc.getTotal(), 25);
		
		// Test to make sure that when dividing by zero,
		// the total is set to 0
		calc.divide(0);
		assertEquals(calc.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		
		// Test the initial state
		assertEquals(calc.getHistory(), "0");
		calc.add(10);
		assertEquals(calc.getHistory(), "0 + 10");
		calc.subtract(1);
		assertEquals(calc.getHistory(), "0 + 10 - 1");
		calc.multiply(2);
		assertEquals(calc.getHistory(), "0 + 10 - 1 * 2");
		calc.divide(3);
		assertEquals(calc.getHistory(), "0 + 10 - 1 * 2 / 3");
		calc.divide(0);
		assertEquals(calc.getHistory(), "0 + 10 - 1 * 2 / 3 / 0");
		
		// Test addition of a negative number 
		calc.add(-5);
		assertEquals(calc.getHistory(), "0 + 10 - 1 * 2 / 3 / 0 + -5");
		
	}

}
