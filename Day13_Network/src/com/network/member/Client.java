package com.network.member;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (Socket client = new Socket("192.168.219.102", 8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());) {

			String hi = dis.readUTF();
			System.out.println(hi);

			while (true) {
				System.out.println("==== menu ���� ====");
				System.out.println("1. ȸ������");
				System.out.println("2. Login");
				System.out.println("3. program exit");
				System.out.print(">> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();

				if (menu.equals("1")) {

					newId: while (true) {
						System.out.println("=== ȸ�� ���� ===");
						System.out.print("���ο� ID �Է� : ");
						String id = sc.nextLine();
						System.out.print("���ο� PW �Է� : ");
						String pw = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.flush();

						String rs = dis.readUTF();
						if (rs.equals("Fail")) {
							System.out.println("���̵� Ȥ�� ��й�ȣ�� �����մϴ�." + "�ٽ� �Է��ϼ���.");
						} else {
							System.out.println("ȸ�� ���� �Ϸ�");
							break newId;
						}
					}
				} else if (menu.equals("2")) {

					login: while (true) {
						System.out.println("=== login ===");
						System.out.print("ID : ");
						String id = sc.nextLine();
						System.out.print("PW : ");
						String pw = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.flush();

						// ��� �ޱ�
						String rs = dis.readUTF();
						if (rs.equals("SUCCESS")) {
							System.out.println("login success");
							break login;
						} else {
							System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�." + "�ٽ� �Է� �ϼ���");
						}
					}
					service: while (true) {
						System.out.println("\n====== ���� menu =======");
						System.out.println("1. ������ �");
						System.out.println("2. ������ ����");
						System.out.println("3. ������ �ζǹ�ȣ");
						System.out.println("4. �α׾ƿ� ");
						System.out.print("menu ���� >> ");
						menu = sc.nextLine();
						dos.writeUTF(menu);
						dos.flush();

						if (menu.equals("4")) {
							System.out.println("�α׾ƿ��մϴ�.");
							break service;
						}
						String rs = dis.readUTF();
						System.out.println(rs);
					}
				} else if (menu.equals("3")) {
					System.out.println("program exit");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
