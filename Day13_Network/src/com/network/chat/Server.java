package com.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		/*
		 * server ���� -> client ����
		 * 1. client ȯ���λ� ����
		 * 2. client -> �г��� ����
		 * 3. server -> "~�� ����"
		 * 
		 * 4. client�� ���� �޼��� ����
		 * 5. server���� �޼����� �޾� "~�� �޼��� : �޼��� ���� "
		 * 6. server�� client���� �޼��� ����
		 * 7. client���� �޼����� �޾� "server �޼��� : �޼��� ����"
		 * 
		 * 4~7 ���� ���� �ݺ�
		 */
		Scanner sc = new Scanner(System.in);
		try(ServerSocket server = new ServerSocket(8000);
			Socket sock = server.accept();
			DataInputStream dis = new DataInputStream(sock.getInputStream());
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());){
			
			//ȯ���λ� ������
			String hi = "�����Ͻ� �� ȯ���մϴ�~~~!!!!";
			dos.writeUTF(hi);
			dos.flush();
			
			// �г��� �ޱ�
			String nickname = dis.readUTF();
			System.out.println(nickname + "�� ����");
			
			try{
			while(true) {
			//�޼��� �ޱ�
			String msg = dis.readUTF();
			System.out.println(nickname + "�� �޼��� : " + msg);
			
			//�޼��� ����
			System.out.print("�޼��� �Է� : ");
			String message = sc.nextLine();
			dos.writeUTF(message);
			dos.flush();
				}
			}catch(Exception e) {
				System.out.println("������ ����� �ϼ���.");
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
