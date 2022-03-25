package com.network.upload01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\��ȣ��\\Desktop\\server\\";
		try(ServerSocket server = new ServerSocket(8000);
			Socket sock = server.accept();
			DataInputStream dis = new DataInputStream(sock.getInputStream());){
				
			int size = dis.readInt();
			byte[] arr = new byte[size];
			
			// ���ϸ� �޾��ֱ�
			String fileName = dis.readUTF();
			// ���� �ޱ�
			dis.readFully(arr);
			
			try(FileOutputStream fos = new FileOutputStream(path + System.currentTimeMillis()+"__" + fileName)){
				fos.write(arr);
				fos.flush();
			}catch(Exception e) {
				e.printStackTrace();
				}				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
