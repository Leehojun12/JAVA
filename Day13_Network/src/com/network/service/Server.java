package com.network.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class Server {
	public static HashSet<Integer> getLotto() {
		// 1~45 ������ 6���� ������ ��ȣ �̾Ƴ��� ��ȯ���ֱ�
		// (Math.random() * (�ִ밪 - �ּڰ� + 1) + �ּڰ�)
		
		Random rand = new Random();
		//nextInt() -> 0~N ������ ������ ���� ��ȯ���ִ� �Լ�
		
		// �÷��� -> �ߺ����� �ʴ� ���� �����ϴ� �����, ���� �������� ����ȴ�
		
		 HashSet<Integer> lotto = new HashSet<>();
		
		 while(lotto.size() < 6) {
			 lotto.add(rand.nextInt(45)+1); // ����ҿ� ����
		 }
		return lotto;
	}
	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());) {

			String hi = "���� �ϽŰ� ȯ�� �մϴ�.";
			dos.writeUTF(hi);
			dos.flush();

			String nickname = dis.readUTF();
			System.out.println(nickname + "�� ����");

			while (true) {
				String menu = dis.readUTF();
				System.out.println(nickname + "���� " + menu + "���� �����߽��ϴ�.");
				String rs ="";
				if (menu.equals("1")) {
					rs = "\n*** ������ � ***\n\n�����ڸ� : ��� �ִ� �µ�"
							+ "\n�繰���� �������� ������ ���ÿ� �Һ� �þ�� ���Դϴ�.\n������ �Һ� �� ���� �ƴ϶� �ڽ��� �ʿ�� �ϴ� �Ϳ� �����ϵ��� �ϼ���.\n���� �ʿ��� ���� ���� ���� ���°� �߻��� ���� �ֽ��ϴ�.\n"
							+ "\n������ڸ� : �����ϸ� ���� ����"
							+ "\n������ �ϵ� �� �� �� ���� ������ ���� �ӿ� �����մϴ�.\n�׸�ŭ �ڽŰ��� �������� ���� �����µ� �������� ���̳׿�.\n�ֺ� ����鿡�� ����ϰ� ���� �׸�ŭ ����� Ŀ���� �˴ϴ�.\n"
							+ "\n���ڸ� : ������ �ݹ�"
							+ "\n�ڽ��� ������ �� ������ ���߽�ų �ʿ䰡 �ֽ��ϴ�.\n�̰� ���� ����Ÿ��⸸ �ϰ� Ȯ���ϰ� ������ ���� ���ϸ� ������ �����ϴ�.\n������ ������ ����ϰ� �ִٸ� ���� �̷�� ���� ���ڽ��ϴ�.\n"
							+ "\nȲ���ڸ� : ����ϰ� ����ϰ�"
							+ "\n������� ������ �Ѵٰ� �ϱ�� �ϴµ� �� ����� ����ġ ���� �� �ֽ��ϴ�.\n������ �׷��ٰ� �ؼ� ������ ���� �� �˴ϴ�.\n���ݸ� �� ����� �ϵ��� �ϼ���. ����� ���� �� ���Դϴ�.\n"
							+ "\n�����ڸ� : �����ϰ� ���� ����!!"
							+ "\n���࿡ ���� �����ϰ� �ִ� �ϵ��� �������� �ϴٸ� �ƿ� ���⸦ �ϴ� �͵� ����� �� �� �ֽ��ϴ�.\n���� �ʴ� ���� ����� �ִ� �ͺ��� �����ϰ� ���Ӱ� ���𰡸� �����ϴ� �͵� ����Դϴ�.";
					

				} else if (menu.equals("2")) {
					rs = "\n*** ������ ����*** \n\n�������� 3�� ���� / �帲 \n�̼����� : ����\n�ʹ̼����� : ����\n�ڿܼ� : ����\n�ϸ� : 18:47";
					
				} else if (menu.equals("3")) {
					rs = getLotto().toString();
					
				} else if (menu.equals("4")) {
					System.out.println("Service�� �����ϰڽ���");
					break;
				}
				dos.writeUTF(rs);
				dos.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
