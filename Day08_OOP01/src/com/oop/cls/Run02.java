package com.oop.cls;

public class Run02 {
	public static void main(String[] args) {
		
		Car avante = new Car();
	
		avante.setBrand("Hyundai");
		avante.setspeed(50);
		avante.setoil(100);
		System.out.println(
				avante.getBrand() +
				" : " + avante.getspeed() + 
				" : " + avante.getoil());
		Car morning = new Car("KIA", 100 ,50);
		System.out.println(morning.getBrand()
				+ " : "+ morning.getspeed()
				+ " : "+ morning.getoil());
		
		
		
//		avante.brand = "Hyundai";
//		avante.setBrand("BMW");
//		System.out.println(avante.getBrand());
//		
//		avante.setoil(50);
//		System.out.println(avante.getoil());
//		avante.setspeed(120);
//		System.out.println(avante.getspeed());
//		avante.speed = 0;
//		avante.oil = 10;
//		
//		System.out.println(avante.brand);
//		System.out.println(avante.oil);
//		System.out.println(avante.speed);
//		
//		avante.powerOn();
//		avante.speedUp();
//		System.out.println(avante.speed);
//		avante.speedDown();
//		System.out.println(avante.speed);
//		avante.powerOff();
	}
}
