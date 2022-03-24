package com.network.basic;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		// 1. ������ ���� ����
		// ServerSocket : client ����ŭ socket�� �������ִ� ����
		try(ServerSocket server = new ServerSocket(8000); // () -> ���� ��Ʈ ��ȣ
			Socket sock = server.accept();){ 
			// 2. client�� ��û�� ������ client ���� ���� ����
			// client�� ���� ���� �������� ������ ����ϴٰ� ���� ����
			
			System.out.println("new client ����");
			System.out.println("������ IP : " + sock.getLocalAddress());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
