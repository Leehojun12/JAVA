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
			
			// server한테 메세지 받기
			String msg = dis.readUTF();
			System.out.println("message : " + msg);
			
			
			// server에게 메세지 보내기
			while(true) {
			System.out.print("메세지 입력하세요 >> ");
			String message = sc.nextLine();
			dos.writeUTF(message);
			dos.flush();
			if(message.equals("q")) {
				System.out.println("종료 합니다");
				break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
