package com.oops.basics;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.square(200));
		
		calc.sum(new int[] {10,20,30});
		calc.sum(new int[] {10,20,30,40});
		calc.sum(new int[] {10,20,30,40,50});
		calc.sum();
		
	//	double result = calculator.square(5);
	//	System.out.println("Square="+ result);

	}

}
