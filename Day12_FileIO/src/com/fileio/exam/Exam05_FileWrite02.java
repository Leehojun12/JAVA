package com.fileio.exam;

import java.io.FileWriter;

public class Exam05_FileWrite02 {
	public static void main(String[] args) {
		
		String str = "전날(21일) 9만6천257명보다 4만명 넘게 급증하며,\r\n"
				+ " 역대 최다였던 지난 16일(18만1천994명)에 이어 2번째로 신규 확진자가 많았다.\r\n"
				+ "누적 확진자는 292만5천633명이 됐다. \r\n"
				+ "이는 전체 경기도 인구(지난해 12월 말 기준 1천392만5천862명:주민등록인구+등록외국인)의 21%에 해당한다.\r\n";
		
		try(FileWriter fw = new FileWriter("newKorean.txt");){
			fw.write(str);
			fw.flush(); //
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
