package com.network.basic;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		// client�� socket ���� �� �ΰ��� ���ڰ� �ʿ�
		// --> 1. ������ IP �ּ�
		// --> 2. �������� ������ ��Ʈ��ȣ 
		// ������ IP�ּ� -> localhost ��� ������ ����
		try(Socket client = new Socket("192.168.219.103",8000);){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
