package com.file.quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Quiz01_FileRead {
	public static void main(String[] args) {
		
		// 구글에서 원하는 짧은 영어로 된 시나, 가사, 뉴스 , 소설, 하나를 구해서 프로젝트 폴더내에 txt 파일로 저장 -> 그 파일을 읽어들여 콘솔로 출력
		
//		try(FileInputStream fis = new FileInputStream("Information.txt")){
//			System.out.println(fis.read());
//			byte[] fileContents = new byte[1024];
//			fis.read(fileContents);
//			System.out.println(new String(fileContents));
//			
//		}catch(Exception e) {
//			System.out.println("오류가 일어 났습니다.");
//			e.printStackTrace();
//		}
		
		// FileReader/BufferedReader를 사용해서 읽기로 수정
		try(FileReader fr = new FileReader("Information.txt");
				BufferedReader br = new BufferedReader(fr);){
				
			String line = "";
				
			while((line = br.readLine())!= null){
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
