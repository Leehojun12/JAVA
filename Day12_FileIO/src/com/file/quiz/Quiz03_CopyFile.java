package com.file.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Quiz03_CopyFile {
	
	public static void copyFile(String from, String to) {		
		try(FileReader fr = new FileReader(from);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(to)){
			String line ="";
			while((line = br.readLine()) !=null) {
				System.out.println(line);
				fw.write(line + "\n");
			}
			fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		copyFile("Information.txt","B.txt");
		// A.txt 파일을 복사해서 B.txt 파일로 만들기
		// A.txt 의 데이터를 입력 -> 그 데이터를 B.txt로 출력
		
//		try(FileInputStream fis = new FileInputStream("A.txt");
//				FileOutputStream fos = new FileOutputStream("B.txt")){
//			
//			byte[] temp = new byte[1024];
//			fis.read(temp);
//			System.out.println(new String(temp));
//			fos.write(temp);
//			
//			
//			
//		}catch(Exception e) {
//			System.out.println("오류 발생");
//			e.printStackTrace();
//		}
		
		// Reader Writer -> 수정
	}
}
