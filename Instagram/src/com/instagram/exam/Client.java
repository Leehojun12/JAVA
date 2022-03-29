package com.instagram.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try (Socket client = new Socket("192.168.219.104", 8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());) {

			String hi = dis.readUTF();
			System.out.println(hi);
			
			String rev_nick = "";
			while (true) {
				System.out.println("==== menu 선택 ====");
				System.out.println("1. 회원가입");
				System.out.println("2. Login");
				System.out.println("0. program exit");
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
						System.out.print("새로운 NickName 입력 : ");
						String nickname = sc.nextLine();

						dos.writeUTF(id);
						dos.writeUTF(pw);
						dos.writeUTF(nickname);
						dos.flush();

						String rs = dis.readUTF();
						if (rs.equals("Fail")) {
							System.out.println("아이디 존재합니다." + "다시 입력하세요.");
						} else if (rs.equals("fail")) {
							System.out.println("닉네임이 존재합니다." + "다시 입력하세요.");
						} else {
							System.out.println("회원 가입 완료");
							rev_nick = nickname;
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
							System.out.println(rev_nick + "님 어서오세요.");
							break login;
						} else {
							System.out.println("아이디 일치하지 않습니다." + "다시 입력 하세요");
						}
					}
					fed: while (true) {
						System.out.println("==== Instagram ====");
						System.out.println("1. 피드 등록");
						System.out.println("2. 피드 확인");
						System.out.println("3. 프로필 등록");
						System.out.println("4. 프로필 확인");
						System.out.println("0. 인스타그램 종료");
						System.out.print(">> ");
						String menu1 = sc.nextLine();
						dos.writeUTF(menu1);
						dos.flush();
						if (menu1.equals("1")) {
							System.out.println("제목을 입력하세요(10자 이내)");
							String title = sc.nextLine();
							System.out.println("내용을 입력하세요");
							String content = sc.nextLine();
							dos.writeUTF(title);
							dos.writeUTF(content);
							dos.flush();
						} else if (menu1.equals("2")) {
							System.out.println("1. 전체 피드 목록");
							System.out.println("2. 개별 피드 확인");
							System.out.print("피드 선택 : ");
							String menu2 = sc.nextLine();
							dos.writeUTF(menu2);
							dos.flush();
							if(menu2.equals("1")) {
								String info = dis.readUTF();
								System.out.println("\n==== 전체 피드 목록 ====\n"+
													"글번호\t닉네임\t제목\n"+info);
							}else if(menu2.equals("2")) {
								System.out.print("확인할 피드의 번호 입력 : ");
								int seq = Integer.parseInt(sc.nextLine());
								dos.write(seq);
								dos.flush();
								String select_info = dis.readUTF();
								System.out.println("\n==== 개별 피드 목록 ====\n"+
													"글번호\t닉네임\t제목\t내용\n"+select_info);
										
							}
						} else if (menu1.equals("3")) {

						} else if (menu1.equals("4")) {

						} else if (menu1.equals("0")) {
							System.out.println(rev_nick + "님이 로그아웃");
							break fed;
						}
					}
				} else if (menu.equals("0")) {
					System.out.println("program exit");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
