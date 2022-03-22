package com.collection.exam;

import java.util.ArrayList;

public class Exam03 {
	public static void main(String[] args) {
		
		ArrayList tempArr = new ArrayList<>();
		//���׸�(Generic) -> ArrayList�� �迭 -> ArrayList�� ������ �ڷ����� ������ִ°�
		ArrayList<String> strList = new ArrayList<>();
		
		tempArr.add("apple");
		tempArr.add(10);
		tempArr.add(true);
		
		//���׸��� ����ϸ� ������ �������� Ÿ���� �ɷ��ִ� ������ ��
		strList.add("apple");
		
		// apple ������ a ���� �̾Ƴ��� �ʹ�.
		char a = ((String)tempArr.get(0)).charAt(0);
		System.out.println(a);
		
		// ���׸��� ����ϰ� �Ǹ� ��������ȯX
		char a2 = strList.get(0).charAt(0);
		System.out.println(a2);
		
		/*
		 * �⺻ �ڷ��� ArrayList
		 * �⺻ �ڷ��� (boolean, char, byte, short, int, float, double, long)
		 * -> �⺻ �ڷ����� Ŭ������ X -> �ڹٿ��� �����س��� Ư���� �⺻ �ڷ���
		 * 
		 * Wrapper Class
		 * -> �⺻ �ڷ������� ���ΰ� �ִ� Ŭ���� -> �⺻ �ڷ����� ��ġ Ŭ����ó�� ����ϴ°� �����ϵ��� ����.
		 * int -> Integer
		 * double -> Double
		 * float -> Float
		 * char -> Character
		 */
		
		String temp = "a";
		int x = 10;
	
		//int �� arrayList �� ��������
		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(10);
		ilist.add(50);
		System.out.println(ilist.get(0) + " : " + ilist.get(1));
		
		
	}
}
