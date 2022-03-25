package com.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		/*
		 * server 가동 -> client 접속
		 * 1. client 환영인사 전송
		 * 2. client -> 닉네임 전송
		 * 3. server -> "~님 접속"
		 * 
		 * 4. client가 먼저 메세지 전송
		 * 5. server에서 메세지를 받아 "~님 메세지 : 메세지 내용 "
		 * 6. server가 client에게 메세지 전송
		 * 7. client에게 메세지를 받아 "server 메세지 : 메세지 내용"
		 * 
		 * 4~7 까지 과정 반복
		 */
		Scanner sc = new Scanner(System.in);
		try(ServerSocket server = new ServerSocket(8000);
			Socket sock = server.accept();
			DataInputStream dis = new DataInputStream(sock.getInputStream());
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());){
			
			//환영인사 보내기
			String hi = "접속하신 걸 환영합니다~~~!!!!";
			dos.writeUTF(hi);
			dos.flush();
			
			// 닉네임 받기
			String nickname = dis.readUTF();
			System.out.println(nickname + "님 접속");
			
			try{
			while(true) {
			//메세지 받기
			String msg = dis.readUTF();
			System.out.println(nickname + "님 메세지 : " + msg);
			
			//메세지 전송
			System.out.print("메세지 입력 : ");
			String message = sc.nextLine();
			dos.writeUTF(message);
			dos.flush();
				}
			}catch(Exception e) {
				System.out.println("서버를 재부팅 하세요.");
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
