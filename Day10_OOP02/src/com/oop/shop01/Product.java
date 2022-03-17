package com.oop.shop01;

// ���� Ŭ����(�θ� Ŭ����)
public class Product {
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
	
	//0.02%�� ���η��� ����� ������ ��ȯ���ִ� �޼���
	public double getRatePrice() {
		return this.price * 0.02;
	}
	
}
