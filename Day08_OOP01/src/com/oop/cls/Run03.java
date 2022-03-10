package com.oop.cls;

public class Run03 {
	public static void main(String[] args) {
		
		Laptop2 lap = new Laptop2();
		
		lap.setBrand("»ï¼º");
		lap.setColor("blue");
		lap.setPrice(100000);
		lap.setSize(17.0);
		
		System.out.println(lap.getBrand());
		System.out.println(lap.getcolor());
		System.out.println(lap.getPrice());
		System.out.println(lap.getSize());
	}
}
