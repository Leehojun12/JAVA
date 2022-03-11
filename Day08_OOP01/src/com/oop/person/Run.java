package com.oop.person;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== ȸ�� ���� �Է� ====");
		System.out.print("������ȣ�� �Է��ϼ��� (4�ڸ� ����) >> ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("�̸��� �Է��ϼ��� >> ");
		String name = sc.nextLine();
		System.out.print("����ó�� �Է��ϼ��� >> ");
		String contact = sc.nextLine();

		Person p = new Person(id, name, contact);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getContact());
		p.setName("\nLarry\n");
		p.setContact("01012344321\n");
		p.printAll();
	}
}
