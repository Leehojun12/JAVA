package com.collection.exam;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		
		String[] arr = new String[3];
		ArrayList list = new ArrayList<>(); // Object�� �迭
		
		list.add("apple");
		list.add(10);
		list.add(true);
		list.add('A');
		System.out.println(list.toString());
		// �迭 -> ���� �ڷ����� �����͸� ������� ����
		/*
		 * String, boolean, �Ǽ�, ����....
		 * Object -> �ڹ��� ��� Ŭ���� / ��� �͵��� Object ��ӹ���
		 * ������ : �پ��� Ŭ�������� ������ ������ �ִ� �� 
		 */
		String a = "mango";
		char temp = a.charAt(0);
		System.out.println(temp);
		
		char temp1 = ((String)list.get(0)).charAt(0);
		System.out.println(temp1);
	}
}
