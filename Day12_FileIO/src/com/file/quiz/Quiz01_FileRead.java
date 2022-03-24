package com.file.quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Quiz01_FileRead {
	public static void main(String[] args) {
		
		// ���ۿ��� ���ϴ� ª�� ����� �� �ó�, ����, ���� , �Ҽ�, �ϳ��� ���ؼ� ������Ʈ �������� txt ���Ϸ� ���� -> �� ������ �о�鿩 �ַܼ� ���
		
//		try(FileInputStream fis = new FileInputStream("Information.txt")){
//			System.out.println(fis.read());
//			byte[] fileContents = new byte[1024];
//			fis.read(fileContents);
//			System.out.println(new String(fileContents));
//			
//		}catch(Exception e) {
//			System.out.println("������ �Ͼ� �����ϴ�.");
//			e.printStackTrace();
//		}
		
		// FileReader/BufferedReader�� ����ؼ� �б�� ����
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
