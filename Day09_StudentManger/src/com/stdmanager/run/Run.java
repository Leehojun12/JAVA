package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dto.Student;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] std = new Student[3];
		int count = 0;
		int no = 0;
		String name = null;
		int age = 0;
		String gender = null;
		int index = 0;
		while (true) {
			System.out.println("==== �л� ���� ���α׷� ====");
			System.out.println("�޴��� �����ϼ���. (���� ��ư : q)");
			System.out.println("1. �л����� ���");
			System.out.println("2. �л���� Ȯ��");
			System.out.println("3. �л����� ����");
			System.out.println("4. �л����� ����");
			System.out.print(">> ");
			String menu = sc.nextLine();
			if (menu.equals("1")) {
				if (count < std.length) {
					System.out.println("�л� ���� ���");
					System.out.print("��ȣ�� �Է��ϼ��� >> ");
					no = Integer.parseInt(sc.nextLine());
					System.out.print("�̸��� �Է��ϼ��� >> ");
					name = sc.nextLine();
					System.out.print("���̸� �Է��ϼ��� >> ");
					age = Integer.parseInt(sc.nextLine());
					System.out.print("������ �Է��ϼ���(��/��) >> ");
					gender = sc.nextLine();

					std[count++] = new Student(no, name, age, gender);
				}
			} else if (menu.equals("2")) {
				System.out.println("==== �л� ��� Ȯ�� ====");
				for (int i = 0; i < std.length; i++) {
					if (std[i] != null) {
						System.out.println(std[i].printAll());
					}
				}
			} else if (menu.equals("3")) {
				System.out.println("==== �л� ���� ���� ====");
				System.out.print("��ȣ�� �Է� �Ͻÿ� >> ");
				index = Integer.parseInt(sc.nextLine());
				// if(index == ) {
				System.out.print("�̸��� �����ϼ��� >>");
				std[index - 1].setName(sc.nextLine());
				System.out.print("���̸� �����ϼ��� >>");
				std[index - 1].setAge(Integer.parseInt(sc.nextLine()));
				System.out.print("������ �����ϼ��� >>");
				std[index - 1].setGender(sc.nextLine());
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�.");
				// }

			} else if (menu.equals("4")) {
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				index = Integer.parseInt(sc.nextLine());
				System.out.println("�л������� �����Ǿ����ϴ�.");
				std[index - 1] = null;
			} else if (menu.equals("q")) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�޴� ��ȣ�� �ٽ� �Է��ϼ���.");
			}
		}
	}
}
