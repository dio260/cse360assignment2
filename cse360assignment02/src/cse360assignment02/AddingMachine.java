package cse360assignment02;

public class AddingMachine {
	private int total;
	private String transactionHistory;
	
	/**
	* Constructor for the AddingMachine class
	* Initializes the "total" and "transactionHistory" variables
	* No parameters
	* No return
	*/
	public AddingMachine() {
		total = 0;
		//sets the history string to the total initially
		transactionHistory = total + " ";
	}
	
	/**
	* Constructor for the AddingMachine class
	* No parameters
	* @return total: returns the current total within the addingMachine class
	*/
	public int getTotal() {
		//returns the current total value
		return total;
	}
	
	/**
	* Add method to increase the total value stored within the class
	* @param value: a value to add to the total
	* No return
	*/
	public void add(int value) {
		//add to total
		total += value;
		//add the arithmetic to the history string
		transactionHistory += "+ " + value + " ";
	}
	
	/**
	* Subtract method to decrease the total value stored within the class
	* @param value: a value to subtract from the total
	* No return
	*/
	public void subtract(int value) {
		//add to total
		total -= value;
		//add the arithmetic to the history string
		transactionHistory += "- " + value + " ";
	}
	
	/**
	* toString method that returns the arithmetic history of addingMachine
	* No parameters
	* @return transactionHistory: The string containing the math history
	*/
	public String toString() {
		//returns the value to print
		return transactionHistory;
	}
	
	/**
	* clear method that resets the values within addingmachine
	* No parameters
	* No returns
	*/
	public void clear() {
		//clear the total and history string
		total = 0;
		transactionHistory = total + " ";
	}
	
}