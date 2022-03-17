package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dao.StudentDAO;
import com.stdmanager.dto.StudentDTO;

public class Run02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentDTO[] stdlist = new StudentDTO[10];
		StudentDAO dao = new StudentDAO();	
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
				if (count < stdlist.length) {
					System.out.println("�л� ���� ���");
					System.out.print("��ȣ�� �Է��ϼ��� >> ");
					no = Integer.parseInt(sc.nextLine());
					System.out.print("�̸��� �Է��ϼ��� >> ");
					name = sc.nextLine();
					System.out.print("���̸� �Է��ϼ��� >> ");
					age = Integer.parseInt(sc.nextLine());
					System.out.print("������ �Է��ϼ���(��/��) >> ");
					gender = sc.nextLine();

					StudentDTO std = new StudentDTO(no, name, age, gender);
					
					dao.insert(std);
				}
			} else if (menu.equals("2")) {
				StudentDTO[] list = dao.seletAll();
				for(StudentDTO std : list) {
					if(std != null) {
						System.out.println(std.printAll());
					}
				}
			} else if (menu.equals("3")) {
				System.out.println("==== �л� ���� ���� ====");
				System.out.print("��ȣ�� �Է� �Ͻÿ� >> ");
				index = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �����ϼ��� >> ");
				name = sc.nextLine();
				System.out.print("���̸� �����ϼ��� >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �����ϼ���(��/��) >> ");
				gender = sc.nextLine();
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�.");
				
				dao.modify(new StudentDTO(no, name, age, gender));


			} else if (menu.equals("4")) {
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				index = Integer.parseInt(sc.nextLine());
				System.out.println("�л������� �����Ǿ����ϴ�.");
				dao.delete(index);
				
			} else if (menu.equals("q")) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�޴� ��ȣ�� �ٽ� �Է��ϼ���.");
			}
		}
	}
}
