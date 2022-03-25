package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\��ȣ��\\Desktop\\server\\";
		String Name = "Lsa.jpg";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				FileInputStream fis = new FileInputStream(path + Name);){
			
			System.out.println(sock.getLocalAddress() + " ���� ");
			File file = new File(path);
			File[] files = file.listFiles();
			// file�� �� ���� ����
			dos.write(files.length);
			for(File f :files) {
				// �ش� ������ �̸��� ��ȯ���ִ� �޼��� 
				System.out.println(f.getPath());
				// client���� �� �̸����� ����
				dos.writeUTF(f.getName());
			}
			dos.flush();
			
			// client�� ��û�� ���ϸ�
			String fileName = dis.readUTF();
			System.out.println(fileName);
			
			// client�� ��û�� ������ �������� �������ֱ�
			byte[] arr = fis.readAllBytes();
			if(fileName.equals(Name)) {
				dos.writeInt(arr.length);
				dos.write(arr);
				dos.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
