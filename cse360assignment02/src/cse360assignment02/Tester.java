package cse360assignment02;

public class Tester {
	public static void main(String[] args)
	{
		AddingMachine calc = new AddingMachine();
		
		calc.add(5);
		calc.subtract(4);
		calc.add(6);
		System.out.println(calc.toString());
	}
}
