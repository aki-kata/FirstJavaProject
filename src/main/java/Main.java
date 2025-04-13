package main.java;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		Calculator calc = new Calculator();
		int result = calc.add(a,b);
		System.out.println("Sum: " + result);
	}
}
