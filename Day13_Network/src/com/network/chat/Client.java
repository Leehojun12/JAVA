package com.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try(Socket client = new Socket("175.209.39.152",8099);
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			// 환영인사 받기
			String hi = dis.readUTF();
			System.out.println(hi);
			
			// 메세지 전송
			System.out.print("닉네입 입력 >>");
			String nickname = sc.nextLine();
			dos.writeUTF(nickname);
			dos.flush();
			
			try {
			while(true) {
			// 메세지 전송
			System.out.print("메세지 입력 >> ");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
			dos.flush();
			
			//메세지 받기
			String message = dis.readUTF();
			System.out.println("서버 메세지 :" +message);
			
			}
		}catch(Exception e) {
			System.out.println("서버를 재부팅 하세요.");
			e.printStackTrace();
			}			
		}catch(Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}
