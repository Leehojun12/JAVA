package com.collection.exam;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
		//ArrayList : ���� �迭
		
		//1. ����
		String[] arr = new String[5];
		ArrayList list = new ArrayList<>();
		// 2. apple �� �߰�
		arr[0] = "apple";
		list.add("apple"); // add��� �޼��带 Ȱ���� 0�� index�κ��� ���������� �� �߰�

		//3. �� ���
		System.out.println(arr[0]);
		System.out.println(list.get(0));
		
		arr[1] = "banana";
		arr[2] = "mango";
		list.add("banana");
		list.add("mango");
		//4. ���̰� ���
		System.out.println(arr.length);
		System.out.println(list.size());
		
		//5. ����
		arr[1] = null;
		list.remove(1);
		System.out.println(arr.length);
		System.out.println(list.size());
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.toString());
	}
}
