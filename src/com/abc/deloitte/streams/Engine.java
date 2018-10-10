package com.abc.deloitte.streams;
import java.io.Serializable;

public class Engine implements Serializable {
	private String brand;
	private String type;
	private double hp;

	public Engine() {
		brand = "Ford";
		type = "Diesel";
		hp = 28.5;

	}

	public Engine(String brand, String type, double hp) {
		brand = this.brand;
		type = this.type;
		hp = this.hp;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

}
