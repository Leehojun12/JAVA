package com.network.upload01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\이호준\\Desktop\\client\\";
		try(Socket client = new Socket("192.168.219.103",8000);
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			System.out.println("업로드할 파일명을 입력하세요(확장명 포함)");
			System.out.print(">> ");
			String fileName = sc.nextLine();
			
			try(FileInputStream fis = new FileInputStream(path + fileName);){
				// client HDD 로부터 파일 읽어오기
				byte[] arr = fis.readAllBytes();
				
				// 업로드할 파일의 크기
				dos.writeInt(arr.length);
				// 파일명을 보내서 서버에서 확장자를 고정적으로 정해주지 않아도 되도록
				dos.writeUTF(fileName);
				// 파일 전송
				dos.write(arr);
				dos.flush();
				 
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
