package com.collection.exam;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		
		String[] arr = new String[3];
		ArrayList list = new ArrayList<>(); // Object형 배열
		
		list.add("apple");
		list.add(10);
		list.add(true);
		list.add('A');
		System.out.println(list.toString());
		// 배열 -> 같은 자료형의 데이터를 묶어놓은 집합
		/*
		 * String, boolean, 실수, 정수....
		 * Object -> 자바의 모든 클래스 / 모든 것들은 Object 상속받음
		 * 다형성 : 다양한 클래스들의 성질을 가질수 있는 것 
		 */
		String a = "mango";
		char temp = a.charAt(0);
		System.out.println(temp);
		
		char temp1 = ((String)list.get(0)).charAt(0);
		System.out.println(temp1);
	}
}
