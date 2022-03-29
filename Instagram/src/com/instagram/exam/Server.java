package com.instagram.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		AccountDAO dao = new AccountDAO();
		FeedDAO feeddao = new FeedDAO();

		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			String hi = "���� �ϽŰ� ȯ�� �մϴ�.";
			dos.writeUTF(hi);
			dos.flush();

			String rev_nick = "";
			while (true) {
				String menu = dis.readUTF();
				if (menu.equals("1")) {// ȸ������

					newId: while (true) {
						String id = dis.readUTF();
						String pw = dis.readUTF();
						String nickname = dis.readUTF();
						System.out.println("User ȸ������ Request");
						System.out.println("id : " + id);
						System.out.println("pw : " + pw);
						System.out.println("nickname : " + nickname);

						if (dao.ExistID(id)) {
							dos.writeUTF("Fail");
						} else if (dao.ExistNick(nickname)) {
							dos.writeUTF("fail");
						} else {
							dao.insert(id, pw, nickname);
							dos.writeUTF("ȸ�� ���� �Ϸ�");
							dos.flush();
							rev_nick = nickname;
							break newId;
						}
					}
				} else if (menu.equals("2")) {// login
					login: while (true) {
						String id = dis.readUTF();
						String pw = dis.readUTF();
						System.out.println("id : " + id);
						System.out.println("pw : " + pw);

						if (dao.checkLogin(id, pw)) {
							dos.writeUTF("SUCCESS");
							break login;
						} else {
							dos.writeUTF("FAIL");
						}
						dos.flush();
					}

					fed: while (true) {
						String menu1 = dis.readUTF();
						System.out.println(rev_nick + "����\t" + menu1 + "�� �����߽��ϴ�.");
						if (menu1.equals("1")) {
							String title = dis.readUTF();
							String content = dis.readUTF();
							feeddao.insert(title, content, rev_nick);
						} else if (menu1.equals("2")) {
							String menu2 = dis.readUTF();
							if (menu2.equals("1")) {
								System.out.println("��ü �ǵ� ��� Request");
								String info = feeddao.selectall();
								dos.writeUTF(info);
								dos.flush();
							} else if (menu2.equals("2")) {
								System.out.println("���� �ǵ� Ȯ�� Request");
								int seq = dis.read();
								String select_info = feeddao.select(seq);
								dos.writeUTF(select_info);
								dos.flush();
								
							}
						} else if (menu1.equals("3")) {

						} else if (menu1.equals("4")) {

						} else if (menu1.equals("0")) {
							System.out.println("�α׾ƿ�");
							break fed;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
