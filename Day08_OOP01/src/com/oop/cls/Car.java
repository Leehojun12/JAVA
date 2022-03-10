package com.oop.cls;

public class Car {

	/*
	 * 속성 : brand, speed, oil 
	 * 기능 : 시동 On/Off speed up/down
	 * 
	 * 정보은닉(캡슐화) : 사용자가 접근하면 안되는 데이터들을 내부적으로 숨기거나 접근을 제한하는 것
	 * -> 1. 접근제한자 사용
	 * -> 2. getter / setter
	 *  private 접근제한자 사용 -> 외부에서 접근이 불가
	 *  -> getter : read-only
	 *  -> setter : write-only
	 */
	
	private String brand;
	private int speed;
	private int oil;
	
	/*
	 * 생성자(Constructor)
	 * - 리턴 타입이 없음
	 * - 클래스명과 이름이 같음
	 *  인스턴스가 만들어질 때 초기화 해주는 역할
	 *  - 기본 생성자(default constructor)는 명시하지 않아도 JVM이 알아서 생성해줌
	 *  -> 다만 매개변수가 있는 생성자를 정의하는 순간부터는 JVM이 기본생성자를 만들어주지 않음
	 *  -> 생성자 또한 메서드이기 때문에 오버로딩이 가능
	 */
	public Car() {} // 기본 생성자는 JVM이 알아서 안해주기때문에 메서드를 항상 만들어줘야됨
	
	public Car(String brand, int speed, int oil) {
		this.brand = brand;
		this.speed = speed;
		this.oil = oil;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
//		this.brand = brand; // this -> 자기 자신을 참조(eclipse 내부에서 접근 하는 것)
		if(brand.equals("BMW")) {
			this.brand = "Hyundai";
		}else {
			this.brand = brand;
		}
	}
	public int getspeed() {
		return this.speed;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public int getoil() {
		return this.oil;
	}
	public void setoil(int oil) {
		this.oil = oil;
	}
	
	
	public void powerOn() {
		System.out.println("시동 On");
	}
	public void powerOff() {
		System.out.println("시동 Off");
	}
	public void speedUp() {
		System.out.println("speed Up");
		speed++;
	}
	public void speedDown() {
		System.out.println("speed Down");
		speed--;
	}
	
}
