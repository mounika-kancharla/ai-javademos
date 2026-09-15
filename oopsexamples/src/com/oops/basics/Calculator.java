package com.oops.basics;

public class Calculator {

	void sum(int...nums) {
		int sum = 0;
		//iterate through the array and calculate sum
		for(int num : nums) {
			 sum += num;
		}
		System.out.println(sum);
	}
	double square(int a) {
		//calculate square  using inbuilt method of math class
		return Math.pow(a, 2);
		
	}
}
