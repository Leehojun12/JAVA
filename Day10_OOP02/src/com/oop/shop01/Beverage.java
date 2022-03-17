package com.oop.shop01;

public class Beverage extends Product{

	public Beverage() {
		super();
		
	}
	public Beverage(String product_no, String name, int price) {
		super(product_no, name, price);
	}
	public double getRatePrice() {
		return this.getPrice() *0.03;
	}
	
}
