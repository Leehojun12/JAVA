package com.oop.cls;

public class Laptop {
		/*
		 * �߻�ȭ : ��Ʈ���� ������ �ִ� Ư��, ����� �߷����� �۾� 
		 * 
		 * Ư�� : �귣��, ����, ����, ������
		 * ��� : ���� On/Off
		 */
		
		//�ɹ�����(�ɹ��ʵ�)�� Ư���� �������� �ؼ� �ۼ�
		String brand;
		String color;
		int price;
		double size;
		
		// ��� -> �޼���(�ɹ� �޼���)
		public String powerOn() {
			return "������ �������ϴ�.";
		}
		public String powerOff() {
			return "������ �����մϴ�.";
		}
}
