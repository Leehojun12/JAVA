package com.fileio.exam;

import java.io.FileInputStream;

public class Exam02_FileRead01 {
	public static void main(String[] args) {
		
		// try~with~resource
		// try(��ü �ڵ��ݳ��� ���ְ� ���� ������) -> try���� ������ �˾Ƽ� ��ü�� �ݳ�
		try(FileInputStream fis = new FileInputStream("test.txt")){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		// ���� �Է� -> Stream -> InputStream
		FileInputStream fis= null;
		try {
			//���ϰ� ���õ� ��ü �ν��Ͻ��� ���巶�� ������ ��ü �ݳ��� �������� ����� ��
			 fis = new FileInputStream("test.txt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally { // ���� try�� ���ʿ��� ���ܰ� �߻��ϴ��� finally ������ �ڵ�� ������ ���� ��.
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
