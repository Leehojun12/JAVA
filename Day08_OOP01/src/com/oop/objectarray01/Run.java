package com.oop.objectarray01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ��Ʈ��(Laptop)�� �迭
//		Laptop[] lapArr = new Laptop[5];
//		lapArr[0] = new Laptop("LG", 200000, "white");
//		System.out.println(lapArr[0].getBrand());
//		lapArr[1] = new Laptop("MAC", 2000000,"Space Grey");
//		System.out.println(lapArr[1].printAll());
//		lapArr[2] = new Laptop("SAMSUNG",20000,"Grey");
//		System.out.println(lapArr[2].printAll());
//		lapArr[3] = new Laptop("LG",10000,"Blue");
//		lapArr[4] = new Laptop("LG", 500000, "sky");
//		int�� �迭
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
			System.out.println("1. ���");
			System.out.println("2. ��ȸ(��ü)");
			System.out.println("3. ������ȸ");
			System.out.println("4. ����");
			System.out.print("menu ���� �Ͻÿ�. >>");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				if (count < lapArr.length) {
					System.out.print("brand �Է� : ");
					String input = sc.nextLine();
					System.out.print("���� �Է� : ");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("�� �Է� : ");
					String color = sc.nextLine();

					lapArr[count++] = new Laptop(input, price, color);
				} else {
					System.out.println("laptop ����� �ȵǾ� �����մϴ�.");
					continue;
				}
			} else if (menu == 2) {
				for (int i = 0; i < lapArr.length; i++) {
					if (lapArr[i] != null) {
						System.out.println(lapArr[i].printAll());
					}
				}
			} else if (menu == 3) {
				System.out.print("��ȸ�� ��ǰ�� ��ȣ�� �Է� : ");
				int index = Integer.parseInt(sc.nextLine());
					if (index < 0 || index > lapArr.length) {
						System.out.println("�ٽ� �Է����ּ���");
				} else {
					if(lapArr[index] != null) {
						System.out.println(lapArr[index].printAll());
					}else {
						System.out.println("��ϵ� ��Ʈ���� �����ϴ�.");
						}
					}
			} else if (menu == 4) {
				System.out.println("����~");
				break;
			}else {
				System.out.println("�޴��� �ٽ� �������ּ���");
			}
		}
	}
}
