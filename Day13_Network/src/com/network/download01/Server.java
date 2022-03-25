package com.network.download01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// ������ �ִ� ������ Ŭ���̾�Ʈ�� �ٿ�ε�
		/*
		 * ���� ���� -> client ���� -> client ���� ����
		 * ������ HDD�� �ִ� ������ ���� ���α׷����� �о����(�Է�)
		 * �ҷ��鿩�� ������ client�� ����
		 */
		String path = "C:\\Users\\��ȣ��\\Desktop\\server\\";
		String fileName ="Lsa.jpg";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				FileInputStream fis = new FileInputStream(path + fileName);
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());){
			
			byte[] arr = fis.readAllBytes(); // file�� ��� �� �о� ���ڴ�
			System.out.println(arr.length);
			dos.writeInt(arr.length);
			dos.write(arr);
			dos.flush();
			// client���� ��������
			// 1. data�� ũ�⸦���� ���� -> client�� size�� �޾� �迭�� �����
			// 2. data�� ���� -> ���� �迭���ٰ� �����͸� �޾��ش�.
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
