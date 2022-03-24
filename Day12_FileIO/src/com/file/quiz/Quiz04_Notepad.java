package com.file.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04_Notepad {
	 public static void modifyFile(String fileName, boolean keep, String content) {
	        if (keep) { // 만약 true 값이 넘어오면 이어쓰기
	            try (FileWriter fw = new FileWriter(fileName, true);) {
	                fw.write(content + "\n");
	                fw.flush();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        } else { // 만약 false 값이 넘어오면 덮어쓰기
	            try (FileWriter fw = new FileWriter(fileName);) {
	                fw.write(content + "\n");
	                fw.flush();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
		System.out.println("*** 콘솔 메모장 ***");
		System.out.println("1. 메모하기");
		System.out.println("2. 메모장 보기");
		System.out.println("3. 메모 수정하기");
		System.out.println("4. 메모 삭제하기");
		System.out.println("5. 프로그램 종료");
		System.out.print(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		String inputFile="";
		if(menu == 1) {
			System.out.println("메모 입력");
			System.out.print(">> ");
			String memo = sc.nextLine();
			System.out.println("저장할 파일의 이름을 입력하세요.");
			System.out.print(">> ");
			inputFile = sc.nextLine();
			try(FileWriter fw = new FileWriter(inputFile)){
				String str = memo;
				fw.write(str);
				fw.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
			list.add(inputFile);
		}else if(menu == 2) {
			System.out.println("==== 저장된 메모 목록 ====");
			if(list.size() == 0) {
				System.out.println("저장된 메모가 없습니다.");
			}else {
				for(int i =0; i<list.size();i++) {
					System.out.println(list.get(i));
				}
				System.out.println("열어볼 파일의 이름을 입력하세요.");
				System.out.print(">> ");
				inputFile = sc.nextLine();
			try(FileReader fr = new FileReader(inputFile);
				BufferedReader br = new BufferedReader(fr);){
				String line = "";
				while((line = br.readLine())!= null){
					System.out.println(line);
				}
			}catch(Exception e) {
					System.out.println("저장된 메모가 없습니다.");
				e.printStackTrace();
				}
			}
		}else if(menu == 3) {
			System.out.println("==== 저장된 메모 목록 ====");
			for(int i =0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("수정할 파일 이름을 입력하시오.");
			System.out.print(">> ");
			inputFile = sc.nextLine();
			System.out.println("수정 방식을 선택하세요.");
			System.out.println("1. 덮어쓰기");
			System.out.println("2. 이어쓰기");
			System.out.print(">> ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("수정할 내용을 입력하세요.");
			System.out.print(">> ");
			String memo =sc.nextLine();
			  if (num == 1) {
                  modifyFile(inputFile, false, memo);
              } else if (num == 2) {
                  modifyFile(inputFile, true, memo);
              }

			System.out.println("수정완료");
			
		}else if(menu == 4) {
			
		}
		else if(menu == 5) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("menu를 다시 입력하세요");
			}
		}
	}
}
