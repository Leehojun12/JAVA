package com.oop.shop01;

public class Shop { // 아이스크림 가게 재고 관리 프로그램
	// 가게이름 name, openTime, closeTime, iceCream 
	private String name;
	private String openTime;
	private String closeTime;
	private Product[] product;
	private IceCream[] iceCream;
	private Beverage[] beverage;
	private Bread[] bread;
	private int index = 0;
	
	public Shop() {}
	public Shop(String name, String openTime, String closeTime, Product[] product) {
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.product = product;
	}
	public Product[] getProduct() {
		return product;
	}
	public void setProduct(Product[] product) {
		this.product = product;
	}
	public Bread[] getBread() {
		return bread;
	}
	public void setBread(Bread[] bread) {
		this.bread = bread;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public IceCream[] getIceCream() {
		return iceCream;
	}
	public void setIceCream(IceCream[] iceCream) {
		this.iceCream = iceCream;
	}
	public void addProduct(Product product) {
		this.product[index++] = product;
	}
	public String printProduct() {
		String rs = "";
		for(int i = 0; i < this.product.length; i++) {
			if(this.product[i] != null) {
				rs += this.product[i].getProduct_no()
						+ " : " + this.product[i].getName()
						+ " : " + this.product[i].getPrice()
						+ "\n";
			}
		}return rs;
	}
}
