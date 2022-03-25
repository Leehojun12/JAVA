package com.network.member;

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

			while (true) {
				System.out.println("==== menu 선택 ====");
				System.out.println("1. 회원가입");
				System.out.println("2. Login");
				System.out.println("3. program exit");
				System.out.print(">> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();

				if (menu.equals("1")) {

					newId: while (true) {
						System.out.println("=== 회원 가입 ===");
						System.out.print("새로운 ID 입력 : ");
						String id = sc.nextLine();
						System.out.print("새로운 PW 입력 : ");
						String pw = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.flush();

						String rs = dis.readUTF();
						if (rs.equals("Fail")) {
							System.out.println("아이디 혹은 비밀번호가 존재합니다." + "다시 입력하세요.");
						} else {
							System.out.println("회원 가입 완료");
							break newId;
						}
					}
				} else if (menu.equals("2")) {

					login: while (true) {
						System.out.println("=== login ===");
						System.out.print("ID : ");
						String id = sc.nextLine();
						System.out.print("PW : ");
						String pw = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.flush();

						// 결과 받기
						String rs = dis.readUTF();
						if (rs.equals("SUCCESS")) {
							System.out.println("login success");
							break login;
						} else {
							System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다." + "다시 입력 하세요");
						}
					}
					service: while (true) {
						System.out.println("\n====== 서비스 menu =======");
						System.out.println("1. 오늘의 운세");
						System.out.println("2. 오늘의 날씨");
						System.out.println("3. 오늘의 로또번호");
						System.out.println("4. 로그아웃 ");
						System.out.print("menu 선택 >> ");
						menu = sc.nextLine();
						dos.writeUTF(menu);
						dos.flush();

						if (menu.equals("4")) {
							System.out.println("로그아웃합니다.");
							break service;
						}
						String rs = dis.readUTF();
						System.out.println(rs);
					}
				} else if (menu.equals("3")) {
					System.out.println("program exit");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
