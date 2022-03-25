package com.network.download01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		/*
		 * 서버가 전송한 파일 받기
		 * client의 HDD에 파일을 저장(출력)
		 */
		String path ="C:\\Users\\이호준\\Desktop\\client\\";	
		try(Socket client = new Socket("192.168.219.103",8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());){
			
			// size를 받아 배열 만들기
			int size = dis.readInt();
			byte[] arr = new byte[size];
			
			dis.read(arr);
			System.out.println(arr.length);
			try(FileOutputStream fos = new FileOutputStream(path + "image.jpg");){
				fos.write(arr);
				fos.flush();
				System.out.println("download success!!");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
