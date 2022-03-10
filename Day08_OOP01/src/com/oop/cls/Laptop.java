package com.oop.cls;

public class Laptop {
		/*
		 * 추상화 : 노트북이 가지고 있는 특성, 기능을 추려내는 작업 
		 * 
		 * 특성 : 브랜드, 생상, 가격, 사이즈
		 * 기능 : 전원 On/Off
		 */
		
		//맴버변수(맴버필드)를 특성을 기준으로 해서 작성
		String brand;
		String color;
		int price;
		double size;
		
		// 기능 -> 메서드(맴버 메서드)
		public String powerOn() {
			return "전원이 켜졌습니다.";
		}
		public String powerOff() {
			return "전원이 종료합니다.";
		}
}
