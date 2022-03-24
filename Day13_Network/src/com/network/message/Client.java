package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(Socket client = new Socket("192.168.219.103",8000);
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			// server���� �޼��� �ޱ�
			String msg = dis.readUTF();
			System.out.println("message : " + msg);
			
			
			// server���� �޼��� ������
			while(true) {
			System.out.print("�޼��� �Է��ϼ��� >> ");
			String message = sc.nextLine();
			dos.writeUTF(message);
			dos.flush();
			if(message.equals("q")) {
				System.out.println("���� �մϴ�");
				break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
