package cse360assign3;

/**
 * CSE360 Spring 2016
 * Assignment 03
 * https://github.com/hayzoos81/Assignment03
 * 
 * Class that performs the standard operations of a calculator.
 * 
 * The assignment is designed as more practice using test driven development plus
 * an introduction to git and github. 
 * 
 * @author Jesus E. Ramirez PIN: 715
 * 
 */

public class Calculator {

	private int total;
	private String history; 
	
	/**
	 * Calculator constructor. Initializes variable total to zero
	 * 
	 * @param none
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}

	/**
	 *  Returns the total of the calculations performed.
	 *  
	 *  @param none
	 *  @return total - the current total of the calculations performed
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add an integer to the total.
	 * 
	 * @param value - integer to be added to the total
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtract an integer from the total.
	 * 
	 * @param value - integer to be subtracted from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiply the total by an integer.
	 * 
	 * @param value - integer to be multiplied with the total
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divide the total by an integer using integer division. If an attempt to divide
	 * by zero is made, the total will be set equal to zero. No error message will be displayed.
	 * 
	 * @param value - integer to divide the total
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		history = history + " / " + value;
	}
	
	/**
	 * Returns a string that contains the previous operations performed starting with the initial
	 * value of 0. It uses +, -, *, and / to denote the operations that were performed.
	 * 
	 * @return - a string that contains the previous operations performed
	 */
	public String getHistory () {
		return history;
	}
}
