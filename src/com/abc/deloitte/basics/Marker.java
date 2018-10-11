package com.abc.deloitte.basics;

public class Marker {

	final String BRAND;
	private String color;
	private double price;
	public static String category = "Stationary";

	static String BLUE;
	static String BLACK;
	static String GREEN;
	static String RED;

	static {
		BLUE = "Blue";
		BLACK = "Black";
		GREEN = "Green";
		RED = "Red";
	}

	public Marker() {
		BRAND = "Camlin";
		color = "blue";
		price = 25.00;

	}

	public static void setCategory(String category) {
		Marker.category = category;
	}

	public Marker(String b) {
		BRAND = b;
		color = "Black";
		price = 30.00;

	}

	public Marker(double p, String c, String b) {
		BRAND = b;
		color = c;
		price = p;

	}

	public String toString() {
		return "Marker[Brand: " + BRAND + "Color: " + color + "Price: " + price;
	}

	public double getPrice() { // accessor method(getter method)
		return price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws MarkerNotSupportedException {
		switch (color) {
		case "Blue":
		case "Black":
		case "Green":
		case "Red":
			this.color = color;
			break;

		default:
			throw new MarkerNotSupportedException("For color " + color);

		}
	}

	public void setPrice(double price) throws IllegalArgumentException { // modifier
																			// method/mutator
																			// method/setter
																			// method
		if (price > 0)
			this.price = price;

		else {
			throw new IllegalArgumentException("Invalid price:" + price);

		}
	}

	public void write(String input) {
		System.out.println(input);
	}

	public void write(int input) {
		System.out.println(input);
	}

	public void write(double input) {
		System.out.println(input);
	}

}
