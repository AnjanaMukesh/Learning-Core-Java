package com.abc.deloitte.basics;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("Start of Main");
		m1();

		System.out.println("End of Main");

	}

	public static void m1() {
		System.out.println("Start of M1");
		m2();
		System.out.println("End of M1");

	}

	public static void m2() {
		System.out.println("Start of M2");

		try {

			int i = Integer.parseInt("12M");
			System.out.println(i * 3);
		} catch (NumberFormatException nfe) {
			System.out.println("Incorrect input for parsing.");
		}

		System.out.println("End of M2");

	}

}
