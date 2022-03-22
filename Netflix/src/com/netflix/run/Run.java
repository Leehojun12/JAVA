package com.netflix.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.netflix.dto.Basic;
import com.netflix.dto.MemberShip;
import com.netflix.dto.Premium;
import com.netflix.dto.Standard;
import com.netflix.dao.NetflixDAO;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NetflixDAO dao = new NetflixDAO();
		ArrayList<MemberShip> ml = dao.selectAll();
		int count = 0;
		String id = null;
		String nickname = null;
		String signup_date = null;
		int point = 0;

		while (true) {
			System.out.println("*** Netflix 회원 관리 시스템 ***");
			System.out.println("1.신규 회원 등록");
			System.out.println("2.회원 목록 등록");
			System.out.println("3.회원 정보 검색");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 정보 삭제");
			System.out.println("6.시스템 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				while (true) {
					System.out.println("회원등급 선택");
					System.out.println("1. Basic");
					System.out.println("2. Standard");
					System.out.println("3. Premium");
					System.out.print(">> ");
					int input = Integer.parseInt(sc.nextLine());

					System.out.print("신규 회원 ID(7자 이내) : ");
					id = sc.nextLine();
					if (dao.ExistID(id)) {
						System.out.println("존재하는 ID입니다.");
					}
					System.out.print("신규 회원 닉네임(4자 이내) : ");
					nickname = sc.nextLine();
					if (dao.ExistNickname(nickname)) {
						System.out.println("존재하는 Nickname입니다.");
					}
					System.out.print("신규 회원 가입일(210505 형식) : ");
					signup_date = sc.nextLine();
					System.out.print("신규 회원 포인트 : ");
					point = Integer.parseInt(sc.nextLine());
					if (input == 1 || input == 2 || input == 3) {
						if (input == 1) {
							dao.insert(new Basic(id, nickname, signup_date, point));
						} else if (input == 2) {
							dao.insert(new Standard(id, nickname, signup_date, point));
						} else if (input == 3) {
							dao.insert(new Premium(id, nickname, signup_date, point));
						}
						break;
					} else {
						System.out.println("다시 입력해주세요");
					}

				}

			} else if (menu == 2) {
				System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}

			} else if (menu == 3) {
				System.out.println("1. Id로 검색");
				System.out.println("2. 닉네임으로 검색");
				int input = Integer.parseInt(sc.nextLine());
				if (input == 1) {
					System.out.print("검색 할 ID 입력 :");
					id = sc.nextLine();
					dao.searchID(id);
				} else if (input == 2) {
					System.out.print("검색 할 Nickname 입력 : ");
					nickname = sc.nextLine();
					dao.searchNickname(nickname);
				}
			} else if (menu == 4) {
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}
				System.out.print("수정할 회원의 ID 입력 : ");
				id = sc.nextLine();
				System.out.print(" 수정할 닉네임 : ");
				nickname = sc.nextLine();
				System.out.print("수정할 포인트 : ");
				point = Integer.parseInt(sc.nextLine());
				dao.modify(id, nickname, point);
			} else if (menu == 5) {
				for (int i = 0; i < ml.size(); i++) {
					System.out.println(ml.get(i).toString());
				}
				System.out.print("삭제할 회원의 ID 입력 : ");
				id = sc.nextLine();
				dao.delete(id);
				System.out.println("삭제가 완료되었습니다.");
			} else if (menu == 6) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요");
			}
		}
	}
}
