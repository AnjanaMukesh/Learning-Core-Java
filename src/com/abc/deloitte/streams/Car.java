package com.abc.deloitte.streams;
import java.io.Serializable;

public class Car implements Serializable {
	private Engine engine;
	private String brand;
	private String model;
	private double price;

	public Car() {
		brand = "Ford";
		model = "Figo";
		price = 785000;
		engine = new Engine();
	}

	public Car(String brand, String model, double price, Engine engine) {
		brand = this.brand;
		price = this.price;
		engine = new Engine();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
