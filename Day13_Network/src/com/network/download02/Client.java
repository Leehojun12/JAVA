package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path ="C:\\Users\\이호준\\Desktop\\client\\";
		try(Socket client = new Socket("192.168.219.103",8000);
			DataInputStream dis = new DataInputStream(client.getInputStream());
					DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			
			System.out.println("==== file download program ====");
			// 몇 개의 file이 넘어오는지..
			int count = dis.read();
			for(int i= 0; i<count;i++) {
				System.out.println(dis.readUTF());
			}
			
			System.out.println("다운로드 할 파일명 입력(확장자 포함)");
			System.out.print(">> ");
			String fileName = sc.nextLine();
			
			// 서버에 다운로드할 파일명 전송
			dos.writeUTF(fileName);
			dos.flush();
			
			int size = dis.readInt();
			byte[] arr = new byte[size];
			dis.read(arr);
			try(FileOutputStream fos = new FileOutputStream(path + fileName)){
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
