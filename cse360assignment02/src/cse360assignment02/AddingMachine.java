package cse360assignment02;

public class AddingMachine {
	private int total;
	private String transactionHistory;
	
	public AddingMachine() {
		total = 0;
		transactionHistory = total + " ";
	}
	
	public int getTotal() {
		return total;
	}
	
	public void add(int value) {
		total += value;
		transactionHistory += "+ " + value + " ";
	}
	
	public void subtract(int value) {
		total -= value;
		transactionHistory += "- " + value + " ";
	}
	
	public String toString() {
		return transactionHistory;
	}
	
	public void clear() {
		transactionHistory = "";
	}
	
}