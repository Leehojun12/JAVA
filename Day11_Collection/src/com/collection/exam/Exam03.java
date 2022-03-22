package com.collection.exam;

import java.util.ArrayList;

public class Exam03 {
	public static void main(String[] args) {
		
		ArrayList tempArr = new ArrayList<>();
		//제네릭(Generic) -> ArrayList도 배열 -> ArrayList에 저장할 자료형을 명시해주는것
		ArrayList<String> strList = new ArrayList<>();
		
		tempArr.add("apple");
		tempArr.add(10);
		tempArr.add(true);
		
		//제네릭을 사용하면 저장할 데이터의 타입을 걸러주는 역할을 함
		strList.add("apple");
		
		// apple 값에서 a 값만 뽑아내고 싶다.
		char a = ((String)tempArr.get(0)).charAt(0);
		System.out.println(a);
		
		// 제네릭을 사용하게 되면 강제형변환X
		char a2 = strList.get(0).charAt(0);
		System.out.println(a2);
		
		/*
		 * 기본 자료형 ArrayList
		 * 기본 자료형 (boolean, char, byte, short, int, float, double, long)
		 * -> 기본 자료형은 클래스가 X -> 자바에서 지정해놓은 특수한 기본 자료형
		 * 
		 * Wrapper Class
		 * -> 기본 자료형들을 감싸고 있는 클래스 -> 기본 자료형을 마치 클래스처럼 사용하는게 가능하도록 해줌.
		 * int -> Integer
		 * double -> Double
		 * float -> Float
		 * char -> Character
		 */
		
		String temp = "a";
		int x = 10;
	
		//int 형 arrayList 를 만들어보세요
		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(10);
		ilist.add(50);
		System.out.println(ilist.get(0) + " : " + ilist.get(1));
		
		
	}
}
