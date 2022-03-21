package com.oop.shop01;

// 상위 클래스(부모 클래스)
// 추상메서드를 하나라도 가진 클래스는 반드시 추상 클래스가 되어야한다
// 추상 클래스 -> 더이상 직접 new를 사용 X
public abstract class Product {
	private String product_no;
	private String name;
	private int price;
	
	public Product() {} 
	public Product(String product_no, String name, int price) {
		this.product_no = product_no;
		this.name = name;
		this.price = price;
	}
	public String getProduct_no() {
		return product_no;
	}
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//0.02%의 할인률이 적용된 가격을 반환해주는 메서드
//	public double getRatePrice() {
//		return this.price * 0.02;
//	}
	// 추상메서드 : 메서드의 몸통을 만들지 않고 틀만 만들어 놓는 메서드
	// -> 반드시 자식 메서드에서 재정의하여 사용해야하는 메서드
//	public abstract double getRatePrice(){
//	}
}
