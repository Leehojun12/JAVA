package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// �������� -> client ���� -> server���� client���� "����!" �޼��� ����
		
		try(ServerSocket server = new ServerSocket(8000);
			Socket sock = server.accept();
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			DataInputStream dis = new DataInputStream(sock.getInputStream());){
			
			// client���� �޼��� ������
			String msg = "�����Ͻ� �� ȯ���մϴ�~~!!!";
			dos.writeUTF(msg);
			dos.flush();
			
			// client�� message �ޱ�
			while(true) {
				String message = dis.readUTF();
				System.out.println(sock.getLocalAddress()+ " : " + message);
				if(message.equals("q")) {
					System.out.println("client�� �����߽��ϴ�.");
					break;
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
