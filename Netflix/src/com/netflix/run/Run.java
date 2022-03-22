package com.netflix.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.netflix.dto.Basic;
import com.netflix.dto.MemberShip;
import com.netflix.dto.Premium;
import com.netflix.dto.Standard;
import com.netflix.dao.NetflixDAO;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NetflixDAO dao = new NetflixDAO();
		ArrayList<MemberShip> ml = dao.selectAll();
		int count = 0;
		String id = null;
		String nickname = null;
		String signup_date = null;
		int point = 0;

		while (true) {
			System.out.println("*** Netflix ȸ�� ���� �ý��� ***");
			System.out.println("1.�ű� ȸ�� ���");
			System.out.println("2.ȸ�� ��� ���");
			System.out.println("3.ȸ�� ���� �˻�");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� ����");
			System.out.println("6.�ý��� ����");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				while (true) {
					System.out.println("ȸ����� ����");
					System.out.println("1. Basic");
					System.out.println("2. Standard");
					System.out.println("3. Premium");
					System.out.print(">> ");
					int input = Integer.parseInt(sc.nextLine());

					System.out.print("�ű� ȸ�� ID(7�� �̳�) : ");
					id = sc.nextLine();
					if (dao.ExistID(id)) {
						System.out.println("�����ϴ� ID�Դϴ�.");
					}
					System.out.print("�ű� ȸ�� �г���(4�� �̳�) : ");
					nickname = sc.nextLine();
					if (dao.ExistNickname(nickname)) {
						System.out.println("�����ϴ� Nickname�Դϴ�.");
					}
					System.out.print("�ű� ȸ�� ������(210505 ����) : ");
					signup_date = sc.nextLine();
					System.out.print("�ű� ȸ�� ����Ʈ : ");
					point = Integer.parseInt(sc.nextLine());
					if (input == 1 || input == 2 || input == 3) {
						if (input == 1) {
							dao.insert(new Basic(id, nickname, signup_date, point));
						} else if (input == 2) {
							dao.insert(new Standard(id, nickname, signup_date, point));
						} else if (input == 3) {
							dao.insert(new Premium(id, nickname, signup_date, point));
						}
						break;
					} else {
						System.out.println("�ٽ� �Է����ּ���");
					}

				}

			} else if (menu == 2) {
				System.out.println("ID\t���\t�г���\t������\t����Ʈ");
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}

			} else if (menu == 3) {
				System.out.println("1. Id�� �˻�");
				System.out.println("2. �г������� �˻�");
				int input = Integer.parseInt(sc.nextLine());
				if (input == 1) {
					System.out.print("�˻� �� ID �Է� :");
					id = sc.nextLine();
					dao.searchID(id);
				} else if (input == 2) {
					System.out.print("�˻� �� Nickname �Է� : ");
					nickname = sc.nextLine();
					dao.searchNickname(nickname);
				}
			} else if (menu == 4) {
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}
				System.out.print("������ ȸ���� ID �Է� : ");
				id = sc.nextLine();
				System.out.print(" ������ �г��� : ");
				nickname = sc.nextLine();
				System.out.print("������ ����Ʈ : ");
				point = Integer.parseInt(sc.nextLine());
				dao.modify(id, nickname, point);
			} else if (menu == 5) {
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}
				System.out.print("������ ȸ���� ID �Է� : ");
				id = sc.nextLine();
				dao.delete(id);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			} else if (menu == 6) {
				System.out.println("�ý��� ����");
				break;
			} else {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���");
			}
		}
	}
}
