package com.file.quiz;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Quiz02_FileWrite {
	public static void main(String[] args) {
		
		String str = "����(21��) 9��6õ257���� 4���� �Ѱ� �����ϸ�,\r\n"
				+ " ���� �ִٿ��� ���� 16��(18��1õ994��)�� �̾� 2��°�� �ű� Ȯ���ڰ� ���Ҵ�.\r\n"
				+ "���� Ȯ���ڴ� 292��5õ633���� �ƴ�. \r\n"
				+ "�̴� ��ü ��⵵ �α�(������ 12�� �� ���� 1õ392��5õ862��:�ֹε���α�+��Ͽܱ���)�� 21%�� �ش��Ѵ�.";
		//str�� ��� �����͸� newText.txt ���Ͽ� �����غ�����.
		try(FileOutputStream fos = new FileOutputStream("newText.txt")){
//			byte[] strByte = new byte[str.length()];
//			for(int i=0; i<strByte.length;i++) {
//				strByte[i]= (byte)str.charAt(i);
//			}
//			fos.write(strByte);
			
			byte[] by=str.getBytes();
			fos.write(by);
		}catch(Exception e) {
			e.printStackTrace();
		}
//		try(FileWriter fw = new FileWriter("new1")){
//			
//			fw.write(str);
//			fw.flush();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
