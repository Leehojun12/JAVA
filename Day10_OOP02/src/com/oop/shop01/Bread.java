package com.oop.shop01;

public class Bread extends Product{
	
	
	public Bread() {
		super();
	}
	public Bread (String product_no, String name, int price) {
		super(product_no, name, price);
	}
	public double getRatePrice() {
		return this.getPrice() * 0.5;
	}
}
