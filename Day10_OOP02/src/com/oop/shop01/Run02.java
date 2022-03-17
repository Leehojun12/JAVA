package com.oop.shop01;

public class Run02 {
	public static void main(String[] args) {
		
		IceCream ic = new IceCream("001","바닐라",5000);
		Bread br = new Bread("002","바게트",3000);
		Beverage be = new Beverage("003","생강차", 4000);
		
		System.out.println("아이스크림 할인가격 : " + ic.getRatePrice());
		System.out.println("빵 할인가격 : " + br.getRatePrice());
		System.out.println("음료 할인가격 : " + be.getRatePrice());
	}
}
