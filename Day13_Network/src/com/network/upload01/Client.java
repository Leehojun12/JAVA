package com.network.upload01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\��ȣ��\\Desktop\\client\\";
		try(Socket client = new Socket("192.168.219.103",8000);
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			System.out.println("���ε��� ���ϸ��� �Է��ϼ���(Ȯ��� ����)");
			System.out.print(">> ");
			String fileName = sc.nextLine();
			
			try(FileInputStream fis = new FileInputStream(path + fileName);){
				// client HDD �κ��� ���� �о����
				byte[] arr = fis.readAllBytes();
				
				// ���ε��� ������ ũ��
				dos.writeInt(arr.length);
				// ���ϸ��� ������ �������� Ȯ���ڸ� ���������� �������� �ʾƵ� �ǵ���
				dos.writeUTF(fileName);
				// ���� ����
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
