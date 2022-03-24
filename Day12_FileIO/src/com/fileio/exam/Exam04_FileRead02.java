package com.fileio.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam04_FileRead02 {
	public static void main(String[] args) {
		// FileReader : text file character ������ �о���� Ŭ����(�� ���ھ�)
		// BufferedReader : �����͸� �� �� ������ �о�鿩�� �� �ְ� ����
		try(FileReader fr = new FileReader("test.txt");
				BufferedReader br = new BufferedReader(fr);){
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
			
			String line ="";
			while((line = br.readLine()) != null) {// readLine() : ���پ� �д´�.
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
