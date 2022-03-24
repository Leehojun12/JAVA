package com.fileio.exam;

import java.io.FileOutputStream;

public class Exam03_FileWrite01 {
	// 프로그램 입장에서 파일을 출력하는 것이기 때문에 OutputStream 필요
	public static void main(String[] args) {
		
	try(FileOutputStream fos = new FileOutputStream("output.txt")){  // 저장할 파이르이 경로
		// 만약 기존의 파일에 이어서 내용을 작성하고 싶다면 true 인자값
//		fos.write('D');
		byte[] fileContents = {'a','b','c','d'};
		fos.write(fileContents);
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
