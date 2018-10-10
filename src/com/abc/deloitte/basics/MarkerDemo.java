package com.abc.deloitte.basics;

import java.util.Date;

public class MarkerDemo {

	public static void swap(Marker m1, Marker m2) {
		double temp = m1.getPrice();
		m1.setPrice(m2.getPrice());
		m2.setPrice(temp);
	}

	public static void main1(String[] args) {

		Marker m1, m2, m3;
		m1 = new Marker(); // implicit constructor
		// m1.price = 15.8;
		System.out.println(m1.getPrice());
		m2 = new Marker();
		// m2.price = 9.00;
		System.out.println(m2.getPrice());
		m3 = new Marker(40.00, "Red", "Reynolds");
		System.out.println(m3.BRAND);
		System.out.println(m3.getPrice());
		// System.out.println(m3.color);
		m3.setPrice(-10.0);
		System.out.println(m3.getPrice());
		// swap function
		Marker a = new Marker(30.0, "Green", "Montex");
		Marker b = new Marker(60.0, "Gold", "Camlin");
		System.out.println(a.getPrice() + " " + b.getPrice());
		swap(a, b);
		System.out.println(a.getPrice() + " " + b.getPrice());

		m1.write("Hello");
		m1.write(200);
		m1.write(35.00);

	}

	public static void main2(String[] args) { // static methods and fields
		Marker m1, m2;
		System.out.println(Marker.category);
		m1 = new Marker();
		m2 = new Marker();
		System.out.println(m1.category);
		System.out.println(m2.category);

		m1.category = "pens";

		System.out.println(m1.category);
		System.out.println(m2.category);

		System.out.println(Math.PI);
		System.out.println(Math.E);

		System.out.println(Math.floor(34.6));
		System.out.println(Math.ceil(89.5));
		System.out.println(Math.round(78.5));
		System.out.println(Math.abs(-339.98));
		System.out.println(Math.random());

		for (int i = 0, j; i < 10; i++) {
			j = (int) Math.round(50 + Math.random() * 50);
			System.out.print(j + " ");

		}
	}

	public static void main3(String[] args) {

		Marker m1 = new Marker();
		Date d1 = new Date();
		System.out.println(m1);
		System.out.println(d1);

		System.out.println(m1.toString());
		System.out.println(d1.toString());

		Marker m3 = new Marker();

		System.out.println(m3.getPrice());
		m3.setPrice(56.0);
		System.out.println(m3.getPrice());
		System.out.println(m3.category);
		m3.setCategory("Pens");
		System.out.println(m3.category);
	}

	public static void main(String[] args) {
		// Exception handling

		Marker m1 = new Marker();
		try {
			m1.setPrice(45.0);
			System.out.println(m1.getPrice());

			m1.setPrice(-80.0);
			System.out.println(m1.getPrice());
		}

		catch (IllegalArgumentException i) {
			System.out.println(i);
		}

		Marker m = new Marker(25, "Camlin", Marker.GREEN);
		System.out.println(m.getColor());
		m.setColor(Marker.RED);
		System.out.println(m.getColor());

		m.setColor("Brown");
		System.out.println(m.getColor());

	}

}
