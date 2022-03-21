package com.oop.shop01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 아이스크림 재고 관리 프로그램
		/*
		 * 가게에 메뉴가 추가될때마다 따라오는 문제점 
		 * 메뉴가 추가될 때마다 생성자, getter/setter, 멤버필드 -> 똑같은 코드 반복
		 * --> 상속을 통해 문제 해결
		 * index, add, print 메서드가 연쇄적으로 증가 -> 코드 결합도 증가
		 * 저장소(배열) 사이즈 문제
		 */
		Scanner sc = new Scanner(System.in);
		IceCream[] iceCream = new IceCream[3];
		Shop baskin = new Shop("BaskinRobbins31", "09:00","21:00", new Product[10]);
		// 아이스크림 등록, 아이스크림 목록 확인, 가게 정보 확인, 프로그램 종료
		while(true) {
			System.out.println("***** Baskin 재고 관리 프로그램 *****");
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 목록 확인");
			System.out.println("3. 가게정보 확인");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				
				System.out.println("등록할 제품을 선택하세요. ");
				System.out.println("1. 아이스크림");
				System.out.println("2. 빵");
				System.out.println("3. 음료");
				System.out.print(">> ");
				int pd = Integer.parseInt(sc.nextLine());
				
				System.out.print("품번을 입력하세요 >> ");
				String product_no = sc.nextLine();
				System.out.print("이름을 입력 하세요 >> ");
				String name = sc.nextLine();
				System.out.print("가격을 입력 하세요 >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				if(pd == 1) {
					baskin.addProduct(new IceCream(product_no,name,price));
				}else if(pd == 2) {
					baskin.addProduct(new Bread(product_no,name,price));
				}else if(pd == 3) {
					baskin.addProduct(new Beverage(product_no,name,price));
				}				
			}
			else if(menu == 2) {
				System.out.println(baskin.printProduct());
			}
			else if(menu == 3) {
				System.out.println(baskin.getName()
						+ " : " + baskin.getOpenTime()
						+ " : " + baskin.getCloseTime()
						+ " : " + baskin.printProduct());
			}
			else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("menu 번호를 다시 입력하시요");
			}
		}
	}
}
