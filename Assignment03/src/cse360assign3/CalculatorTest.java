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
		
		assertEquals(calc.getTotal(), 0);
		calc.add(10);
		assertEquals(calc.getTotal(), 10);
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		
		calc.add(0);
		assertEquals(calc.getTotal(), 0);
		calc.add(5);
		assertEquals(calc.getTotal(), 5);
		calc.add(10);
		assertEquals(calc.getTotal(), 15);
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
		calc.subtract(-30);
		assertEquals(calc.getTotal(), 15);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		
		calc.multiply(10);
		assertEquals(calc.getTotal(), 0);
		calc.add(5);
		calc.multiply(10);
		assertEquals(calc.getTotal(), 50);
		calc.multiply(1);
		assertEquals(calc.getTotal(), 50);
		calc.multiply(0);
		assertEquals(calc.getTotal(), 0);
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		
		calc.divide(2);
		assertEquals(calc.getTotal(), 0);
		calc.add(50);
		calc.divide(2);
		assertEquals(calc.getTotal(), 25);
		calc.divide(1);
		assertEquals(calc.getTotal(), 25);
		calc.divide(0);
		assertEquals(calc.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		
		assertEquals(calc.getHistory(), "");
		calc.add(10);
		assertEquals(calc.getHistory(), "");
	}

}
