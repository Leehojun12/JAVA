package com.oop.cls;

public class Car {

	/*
	 * �Ӽ� : brand, speed, oil 
	 * ��� : �õ� On/Off speed up/down
	 * 
	 * ��������(ĸ��ȭ) : ����ڰ� �����ϸ� �ȵǴ� �����͵��� ���������� ����ų� ������ �����ϴ� ��
	 * -> 1. ���������� ���
	 * -> 2. getter / setter
	 *  private ���������� ��� -> �ܺο��� ������ �Ұ�
	 *  -> getter : read-only
	 *  -> setter : write-only
	 */
	
	private String brand;
	private int speed;
	private int oil;
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
//		this.brand = brand; // this -> �ڱ� �ڽ��� ����(eclipse ���ο��� ���� �ϴ� ��)
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
		System.out.println("�õ� On");
	}
	public void powerOff() {
		System.out.println("�õ� Off");
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
