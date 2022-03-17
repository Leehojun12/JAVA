package com.oop.shop01;

public class Shop { // 아이스크림 가게 재고 관리 프로그램
	// 가게이름 name, openTime, closeTime, iceCream 
	private String name;
	private String openTime;
	private String closeTime;
	private IceCream[] iceCream;
	private Beverage[] beverage;
	private Bread[] bread;
	int ice_index = 0;
	int br_index = 0;
	int be_index = 0;
	
	public Shop() {}
	public Shop(String name, String openTime, String closeTime, IceCream[] iceCream, Bread[] bread, Beverage[] beverage) {
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.iceCream = iceCream;
		this.bread = bread;
		this.beverage = beverage;
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
	public void addIceCream(IceCream iceCream) {
		this.iceCream[ice_index++] = iceCream;
	}
	public String printIceCream() {
		String rs = "";
		for(int i = 0; i < this.iceCream.length; i++) {
			if(this.iceCream[i] != null) {
				rs += this.iceCream[i].getProduct_no()
						+ " : " + this.iceCream[i].getName()
						+ " : " + this.iceCream[i].getPrice()
						+ "\n";
			}
		}return rs;
	}
	public void addBread(Bread bread) {
		this.bread[br_index++] = bread;
	}
	public void printBread() {
		String rs = "";
		for(Bread br : bread) {
			if (br != null) {
				rs += br.getProduct_no() + " : " +
						br.getName() + " : " +
						br.getPrice() +
						"\n";
			}
		}
	}
	public void addBeverage(Beverage beverage) {
		this.beverage[be_index++] = beverage;
	}
	public void printBeverage() {
		String rs = "";
		for(Beverage be : beverage) {
			if (be != null) {
				rs += be.getProduct_no() + " : " +
						be.getName() + " : " +
						be.getPrice() +
						"\n";
			}
		}
	}
}
