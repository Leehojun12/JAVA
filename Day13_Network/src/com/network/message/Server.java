package com.network.message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// 서버가동 -> client 접속 -> server에서 client에게 "접속!" 메세지 전송
		
		try(ServerSocket server = new ServerSocket(8000);
			Socket sock = server.accept();
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			DataInputStream dis = new DataInputStream(sock.getInputStream());){
			
			// client에게 메세지 보내기
			String msg = "접속하신 걸 환영합니다~~!!!";
			dos.writeUTF(msg);
			dos.flush();
			
			// client의 message 받기
			while(true) {
				String message = dis.readUTF();
				System.out.println(sock.getLocalAddress()+ " : " + message);
				if(message.equals("q")) {
					System.out.println("client가 종료했습니다.");
					break;
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
