package com.stdmanager.run;

import java.util.Scanner;

import com.stdmanager.dto.Student;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] std = new Student[3];
		int count = 0;
		int no = 0;
		String name = null;
		int age = 0;
		String gender = null;
		int index = 0;
		while (true) {
			System.out.println("==== 학생 관리 프로그램 ====");
			System.out.println("메뉴를 선택하세요. (종료 버튼 : q)");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생목록 확인");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.print(">> ");
			String menu = sc.nextLine();
			if (menu.equals("1")) {
				if (count < std.length) {
					System.out.println("학생 정보 등록");
					System.out.print("번호를 입력하세요 >> ");
					no = Integer.parseInt(sc.nextLine());
					System.out.print("이름를 입력하세요 >> ");
					name = sc.nextLine();
					System.out.print("나이를 입력하세요 >> ");
					age = Integer.parseInt(sc.nextLine());
					System.out.print("성별을 입력하세요(남/여) >> ");
					gender = sc.nextLine();

					std[count++] = new Student(no, name, age, gender);
				}
			} else if (menu.equals("2")) {
				System.out.println("==== 학생 목록 확인 ====");
				for (int i = 0; i < std.length; i++) {
					if (std[i] != null) {
						System.out.println(std[i].printAll());
					}
				}
			} else if (menu.equals("3")) {
				System.out.println("==== 학생 정보 수정 ====");
				System.out.print("번호를 입력 하시오 >> ");
				index = Integer.parseInt(sc.nextLine());
				// if(index == ) {
				System.out.print("이름을 수정하세요 >>");
				std[index - 1].setName(sc.nextLine());
				System.out.print("나이를 수정하세요 >>");
				std[index - 1].setAge(Integer.parseInt(sc.nextLine()));
				System.out.print("성별을 수정하세요 >>");
				std[index - 1].setGender(sc.nextLine());
				System.out.println("학생정보 수정이 완료되었습니다.");
				// }

			} else if (menu.equals("4")) {
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				index = Integer.parseInt(sc.nextLine());
				System.out.println("학생정보가 삭제되었습니다.");
				std[index - 1] = null;
			} else if (menu.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("메뉴 번호를 다시 입력하세요.");
			}
		}
	}
}
