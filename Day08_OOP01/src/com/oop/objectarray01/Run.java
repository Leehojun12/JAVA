package com.oop.objectarray01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 노트북(Laptop)형 배열
//		Laptop[] lapArr = new Laptop[5];
//		lapArr[0] = new Laptop("LG", 200000, "white");
//		System.out.println(lapArr[0].getBrand());
//		lapArr[1] = new Laptop("MAC", 2000000,"Space Grey");
//		System.out.println(lapArr[1].printAll());
//		lapArr[2] = new Laptop("SAMSUNG",20000,"Grey");
//		System.out.println(lapArr[2].printAll());
//		lapArr[3] = new Laptop("LG",10000,"Blue");
//		lapArr[4] = new Laptop("LG", 500000, "sky");
//		int형 배열
//		int[] arr = new int[5];
//		arr[0] = 10;
//		
//		lapArr[4] = lapArr[3];
//		lapArr[0].setPrice(12000000);
//		
		int count = 0;
		Laptop[] lapArr = new Laptop[3];
		while (true) {

			System.out.println("======= lapArr =======");
			System.out.println("1. 등록");
			System.out.println("2. 조회(전체)");
			System.out.println("3. 개별조회");
			System.out.println("4. 종료");
			System.out.print("menu 선택 하시오. >>");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				if (count < lapArr.length) {
					System.out.print("brand 입력 : ");
					String input = sc.nextLine();
					System.out.print("가격 입력 : ");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("색 입력 : ");
					String color = sc.nextLine();

					lapArr[count++] = new Laptop(input, price, color);
				} else {
					System.out.println("laptop 등록이 안되어 종료합니다.");
					continue;
				}
			} else if (menu == 2) {
				for (int i = 0; i < lapArr.length; i++) {
					if (lapArr[i] != null) {
						System.out.println(lapArr[i].printAll());
					}
				}
			} else if (menu == 3) {
				System.out.print("조회할 제품의 번호를 입력 : ");
				int index = Integer.parseInt(sc.nextLine());
					if (index < 0 || index > lapArr.length) {
						System.out.println("다시 입력해주세요");
				} else {
					if(lapArr[index] != null) {
						System.out.println(lapArr[index].printAll());
					}else {
						System.out.println("등록된 노트북이 없습니다.");
						}
					}
			} else if (menu == 4) {
				System.out.println("종료~");
				break;
			}else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
		}
	}
}
