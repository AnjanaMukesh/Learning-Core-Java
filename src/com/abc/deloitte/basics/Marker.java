package com.abc.deloitte.basics;



class Marker {

	final String BRAND;
	String color;
	private double price;
	
	public static String category="Stationary";

	public Marker() {
		BRAND = "Camlin";
		color = "blue";
		price = 25.00;
		
		
	}
	
	public static void setCategory(String category){
		Marker.category=category;
	}
	
	
	

	public Marker(String b) {
		 BRAND= b;
		color = "Black";
		price = 30.00;

	}

	public Marker(double p, String c, String b) {
		BRAND = b;
		color = c;
		price = p;

	}

	public double getPrice() { //accessor method(getter method)
		return price;
	}
	
	public void setPrice(double price){ //modifier method/mutator method/setter method
		if(price>0)
		this.price=price;
		else
			System.out.println("Invalid");	}
	
	public void write(String input)
	{
		System.out.println(input);
	}
	
	public void write(int input)
	{
		System.out.println(input);
	}
	
	public void write(double input)
	{
		System.out.println(input);
	}
	
	
	

}


