package com.instagram.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (Socket client = new Socket("192.168.219.104", 8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());) {

			String hi = dis.readUTF();
			System.out.println(hi);
			
			String rev_nick = "";
			while (true) {
				System.out.println("==== menu ���� ====");
				System.out.println("1. ȸ������");
				System.out.println("2. Login");
				System.out.println("0. program exit");
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
						System.out.print("���ο� NickName �Է� : ");
						String nickname = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.writeUTF(nickname);
						dos.flush();

						String rs = dis.readUTF();
						if (rs.equals("Fail")) {
							System.out.println("���̵� �����մϴ�." + "�ٽ� �Է��ϼ���.");
						} else if (rs.equals("fail")) {
							System.out.println("�г����� �����մϴ�." + "�ٽ� �Է��ϼ���.");
						} else {
							System.out.println("ȸ�� ���� �Ϸ�");
							rev_nick = nickname;
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
							System.out.println(rev_nick + "�� �������.");
							break login;
						} else {
							System.out.println("���̵� ��ġ���� �ʽ��ϴ�." + "�ٽ� �Է� �ϼ���");
						}
					}
					fed: while (true) {
						System.out.println("==== Instagram ====");
						System.out.println("1. �ǵ� ���");
						System.out.println("2. �ǵ� Ȯ��");
						System.out.println("3. ������ ���");
						System.out.println("4. ������ Ȯ��");
						System.out.println("0. �ν�Ÿ�׷� ����");
						System.out.print(">> ");
						String menu1 = sc.nextLine();
						dos.writeUTF(menu1);
						dos.flush();
						if (menu1.equals("1")) {
							System.out.println("������ �Է��ϼ���(10�� �̳�)");
							String title = sc.nextLine();
							System.out.println("������ �Է��ϼ���");
							String content = sc.nextLine();
							dos.writeUTF(title);
							dos.writeUTF(content);
							dos.flush();
						} else if (menu1.equals("2")) {
							System.out.println("1. ��ü �ǵ� ���");
							System.out.println("2. ���� �ǵ� Ȯ��");
							System.out.print("�ǵ� ���� : ");
							String menu2 = sc.nextLine();
							dos.writeUTF(menu2);
							dos.flush();
							if(menu2.equals("1")) {
								String info = dis.readUTF();
								System.out.println("\n==== ��ü �ǵ� ��� ====\n"+
													"�۹�ȣ\t�г���\t����\n"+info);
							}else if(menu2.equals("2")) {
								System.out.print("Ȯ���� �ǵ��� ��ȣ �Է� : ");
								int seq = Integer.parseInt(sc.nextLine());
								dos.write(seq);
								dos.flush();
								String select_info = dis.readUTF();
								System.out.println("\n==== ���� �ǵ� ��� ====\n"+
													"�۹�ȣ\t�г���\t����\t����\n"+select_info);
										
							}
						} else if (menu1.equals("3")) {

						} else if (menu1.equals("4")) {

						} else if (menu1.equals("0")) {
							System.out.println(rev_nick + "���� �α׾ƿ�");
							break fed;
						}
					}
				} else if (menu.equals("0")) {
					System.out.println("program exit");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
