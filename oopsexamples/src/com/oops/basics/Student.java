package com.oops.basics;

public class Student {
	String studentName;
	int studentId;

	// public Student() {
	// super();
	// TODO Auto-generated constructor stub
	// studentName = "Ram";
	// studentId = 10;
	// }
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

	void printDetails() {
		System.out.println("Name " + studentName);
		System.out.println("Id " + studentId);
	}

}
