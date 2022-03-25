package com.network.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (Socket client = new Socket("192.168.219.102", 8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());) {

			String hi = dis.readUTF();
			System.out.println(hi);

			System.out.print("닉네입 입력 >>");
			String nickname = sc.nextLine();
			dos.writeUTF(nickname);
			dos.flush();

			// 서버를 통해 제공받을수 있는 서비스메뉴를 띄워줌.
			// 1. 오늘의 운세 / 2. 오늘의 날씨 / 3. 오늘의 로또 번호
			// 4. 프로그램 종료
			while (true) {
				System.out.println("\n====== 서비스 menu =======");
				System.out.println("1. 오늘의 운세");
				System.out.println("2. 오늘의 날씨");
				System.out.println("3. 오늘의 로또번호");
				System.out.println("4. 프로그램 종료 ");
				System.out.print("menu 선택 >> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				
				if (menu.equals("4")) {
					System.out.println("Service를 종료하옵니다.");
					break;
				}

				// 요청한 서비스에 대한 결과값
				String rs = dis.readUTF();
				System.out.println(rs);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
