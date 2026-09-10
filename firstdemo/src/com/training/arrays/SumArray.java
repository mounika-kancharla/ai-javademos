package com.training.arrays;

public class SumArray {
	public static void main(String[] args) {
		

	int [] nums = new int[5];
	System.out.println(nums.length);
	System.out.println(nums[3]);
	System.out.println(nums[4]);
	System.out.println();
	//
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	nums[3] = 40;
	
	int sum =0;
	for(int i = 0; i< nums.length;i++) {
		int val = nums[i];
		sum += nums[i];
		//System.out.println(sum);
	}
	System.out.println(sum);
	//
	int total = 0;
	for(int num : nums) {
		//total = total + nums;
		total += num;
	}
	System.out.println(total);
	
	//
	String[] names = new String[] {"Priya","Rani","Mounika"};
	for(String name : names) {
		System.out.println(name.toUpperCase());
	}
	}
}
