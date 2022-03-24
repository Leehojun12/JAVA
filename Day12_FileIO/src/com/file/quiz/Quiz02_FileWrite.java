package com.file.quiz;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Quiz02_FileWrite {
	public static void main(String[] args) {
		
		String str = "전날(21일) 9만6천257명보다 4만명 넘게 급증하며,\r\n"
				+ " 역대 최다였던 지난 16일(18만1천994명)에 이어 2번째로 신규 확진자가 많았다.\r\n"
				+ "누적 확진자는 292만5천633명이 됐다. \r\n"
				+ "이는 전체 경기도 인구(지난해 12월 말 기준 1천392만5천862명:주민등록인구+등록외국인)의 21%에 해당한다.";
		//str에 담긴 데이터를 newText.txt 파일에 저장해보세요.
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
