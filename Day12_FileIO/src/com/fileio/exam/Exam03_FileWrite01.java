package com.fileio.exam;

import java.io.FileOutputStream;

public class Exam03_FileWrite01 {
	// ���α׷� ���忡�� ������ ����ϴ� ���̱� ������ OutputStream �ʿ�
	public static void main(String[] args) {
		
	try(FileOutputStream fos = new FileOutputStream("output.txt")){  // ������ ���̸��� ���
		// ���� ������ ���Ͽ� �̾ ������ �ۼ��ϰ� �ʹٸ� true ���ڰ�
//		fos.write('D');
		byte[] fileContents = {'a','b','c','d'};
		fos.write(fileContents);
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
