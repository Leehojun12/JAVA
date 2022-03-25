package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\이호준\\Desktop\\server\\";
		String Name = "Lsa.jpg";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				FileInputStream fis = new FileInputStream(path + Name);){
			
			System.out.println(sock.getLocalAddress() + " 접속 ");
			File file = new File(path);
			File[] files = file.listFiles();
			// file의 수 먼저 전송
			dos.write(files.length);
			for(File f :files) {
				// 해당 파일의 이름을 반환해주는 메서드 
				System.out.println(f.getPath());
				// client에세 이 이름들을 전송
				dos.writeUTF(f.getName());
			}
			dos.flush();
			
			// client가 요청한 파일명
			String fileName = dis.readUTF();
			System.out.println(fileName);
			
			// client가 요청한 파일을 서버에서 전송해주기
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
