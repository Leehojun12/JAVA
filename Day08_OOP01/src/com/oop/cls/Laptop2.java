package com.oop.cls;

public class Laptop2 {

	private String brand;
	private String color;
	private int price;
	private double size;
	
	// 기본 생성자
	// 4개의 멤버필드를 매개변수로 받는 생성자
	public Laptop2() {}
	public Laptop2(String brand, String color, int price, double size) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getcolor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSize() {
		return this.size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	
}
