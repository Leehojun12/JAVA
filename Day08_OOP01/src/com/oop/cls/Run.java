package com.oop.cls;

public class Run {
	public static void main(String[] args) {
		
		// 사용자가 정의해 만들어진 클래스는 모두 참조 자료형
		Laptop laptop = new Laptop();
		System.out.println(laptop);
		
		System.out.println(laptop.brand);
		System.out.println(laptop.price);
		System.out.println("================");
		
		laptop.brand = "LG";
		laptop.color ="white";
		laptop.price = 500000;
		laptop.size = 27.0;
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.size);
		
		System.out.println(laptop.powerOn());
		System.out.println(laptop.powerOff());
		
		System.out.println("================");
		laptop.brand = "Apple";
		laptop.color = "Space grey";
		laptop.price = 1000000;
		laptop.size = 17.0;
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.size);
		
		Laptop laptop2 = new Laptop();
		
		laptop2.brand = "Apple";
		laptop2.color = "Space grey";
		laptop2.price = 100000;
		laptop2.size = 17.0;
		
		System.out.println("================");
		System.out.println(laptop);
		System.out.println(laptop2);
		
	}
}
