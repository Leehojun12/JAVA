package com.oop.shop01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 아이스크림 재고 관리 프로그램
		/*
		 * 가게에 메뉴가 추가될때마다 따라오는 문제점
		 * 메뉴가 추가될 때마다 생성자, getter/setter, 멤버필드 -> 똑같은 코드 반복
		 * index, add, print 메서드가 연쇄적으로 증가 -> 코드 결합도 증가
		 * 저장소(배열) 사이즈 문제
		 */
		Scanner sc = new Scanner(System.in);
		IceCream[] iceCream = new IceCream[3];
		Shop baskin = new Shop("BaskinRobbins31", "09:00","21:00", iceCream);
		// 아이스크림 등록, 아이스크림 목록 확인, 가게 정보 확인, 프로그램 종료
		while(true) {
			System.out.println("***** Baskin 재고 관리 프로그램 *****");
			System.out.println("1. 아이스크림 등록");
			System.out.println("2. 아이스크림 목록 확인");
			System.out.println("3. 가게정보 확인");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				System.out.print("품번을 입력하세요 >> ");
				String product_no = sc.nextLine();
				System.out.print("이름을 입력 하세요 >> ");
				String name = sc.nextLine();
				System.out.print("가격을 입력 하세요 >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				baskin.addIceCream(new IceCream(product_no, name, price));
				
				}
			else if(menu == 2) {
				System.out.println(baskin.printIceCream());
			}
			else if(menu == 3) {
				
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
