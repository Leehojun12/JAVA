package com.oop.shop01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// ���̽�ũ�� ��� ���� ���α׷�
		/*
		 * ���Կ� �޴��� �߰��ɶ����� ������� ������
		 * �޴��� �߰��� ������ ������, getter/setter, ����ʵ� -> �Ȱ��� �ڵ� �ݺ�
		 * index, add, print �޼��尡 ���������� ���� -> �ڵ� ���յ� ����
		 * �����(�迭) ������ ����
		 */
		Scanner sc = new Scanner(System.in);
		IceCream[] iceCream = new IceCream[3];
		Shop baskin = new Shop("BaskinRobbins31", "09:00","21:00", iceCream);
		// ���̽�ũ�� ���, ���̽�ũ�� ��� Ȯ��, ���� ���� Ȯ��, ���α׷� ����
		while(true) {
			System.out.println("***** Baskin ��� ���� ���α׷� *****");
			System.out.println("1. ���̽�ũ�� ���");
			System.out.println("2. ���̽�ũ�� ��� Ȯ��");
			System.out.println("3. �������� Ȯ��");
			System.out.println("4. ���α׷� ����");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				System.out.print("ǰ���� �Է��ϼ��� >> ");
				String product_no = sc.nextLine();
				System.out.print("�̸��� �Է� �ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("������ �Է� �ϼ��� >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				baskin.addIceCream(new IceCream(product_no, name, price));
				
				}
			else if(menu == 2) {
				System.out.println(baskin.printIceCream());
			}
			else if(menu == 3) {
				
			}
			else if(menu == 4) {
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("menu ��ȣ�� �ٽ� �Է��Ͻÿ�");
			}
		}
	}
}
