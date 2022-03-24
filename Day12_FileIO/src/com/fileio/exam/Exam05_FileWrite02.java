package com.fileio.exam;

import java.io.FileWriter;

public class Exam05_FileWrite02 {
	public static void main(String[] args) {
		
		String str = "����(21��) 9��6õ257���� 4���� �Ѱ� �����ϸ�,\r\n"
				+ " ���� �ִٿ��� ���� 16��(18��1õ994��)�� �̾� 2��°�� �ű� Ȯ���ڰ� ���Ҵ�.\r\n"
				+ "���� Ȯ���ڴ� 292��5õ633���� �ƴ�. \r\n"
				+ "�̴� ��ü ��⵵ �α�(������ 12�� �� ���� 1õ392��5õ862��:�ֹε���α�+��Ͽܱ���)�� 21%�� �ش��Ѵ�.\r\n";
		
		try(FileWriter fw = new FileWriter("newKorean.txt");){
			fw.write(str);
			fw.flush(); //
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
