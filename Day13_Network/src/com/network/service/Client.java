package com.network.service;

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

			System.out.print("�г��� �Է� >>");
			String nickname = sc.nextLine();
			dos.writeUTF(nickname);
			dos.flush();

			// ������ ���� ���������� �ִ� ���񽺸޴��� �����.
			// 1. ������ � / 2. ������ ���� / 3. ������ �ζ� ��ȣ
			// 4. ���α׷� ����
			while (true) {
				System.out.println("\n====== ���� menu =======");
				System.out.println("1. ������ �");
				System.out.println("2. ������ ����");
				System.out.println("3. ������ �ζǹ�ȣ");
				System.out.println("4. ���α׷� ���� ");
				System.out.print("menu ���� >> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				
				if (menu.equals("4")) {
					System.out.println("Service�� �����Ͽɴϴ�.");
					break;
				}

				// ��û�� ���񽺿� ���� �����
				String rs = dis.readUTF();
				System.out.println(rs);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
