package com.oop.shop01;

public class Run02 {
	public static void main(String[] args) {
		
		IceCream ic = new IceCream("001","�ٴҶ�",5000);
		System.out.println(ic.getName());
		
		Bread br = new Bread("002","�ٰ�Ʈ",3000);
		Beverage be = new Beverage("003","������", 4000);
		System.out.println(br.getName());
		System.out.println(be.getName());
		
		System.out.println("���̽�ũ�� ���ΰ��� : " + ic.getRatePrice());
		System.out.println("�� ���ΰ��� : " + br.getRatePrice());
		System.out.println("���� ���ΰ��� : " + be.getRatePrice());
	}
}
