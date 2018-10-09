package com.abc.deloitte.basics;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	final String STREAM;
	private double[] marks = new double[5];
	double total;

	public Student(String n, int r, String s) {
		name = n;
		roll = r;
		STREAM = s;

	}

	public void getStudentInfo() {
		System.out.println("Name:" + name);
		System.out.println("Stream:" + STREAM);
		System.out.println("Roll Number:" + roll);
		System.out.println("Marks:");
		for (int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
			System.out.println("Total Marks:" + totalMarks());
		}

	}

	public void setMarks() {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter marks:");
		for (i = 0; i < 5; i++) {
			marks[i] = in.nextFloat();
		}
	}

	public boolean isStudent() {
		if (roll > 0) {
			return true;
		}
		return false;
	}

	public double totalMarks() {
		total = 0.0;
		for (int i = 0; i < 5; i++) {
			total += marks[i];
		}
		return total;

	}

	public void category() {
		totalMarks();
		if (total >= 75) {
			System.out.println("Distiction");
		} else if (total >= 60) {
			System.out.println("First Class");
		} else if (total >= 50) {
			System.out.println("Second class");
		} else if (total >= 40) {
			System.out.println("Third class");
		} else {
			System.out.println("Fail");
		}
	}

}
