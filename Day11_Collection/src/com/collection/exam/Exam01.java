package com.collection.exam;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
		//ArrayList : 동적 배열
		
		//1. 생성
		String[] arr = new String[5];
		ArrayList list = new ArrayList<>();
		// 2. apple 값 추가
		arr[0] = "apple";
		list.add("apple"); // add라는 메서드를 활용해 0번 index로부터 순차적으로 값 추가

		//3. 값 출력
		System.out.println(arr[0]);
		System.out.println(list.get(0));
		
		arr[1] = "banana";
		arr[2] = "mango";
		list.add("banana");
		list.add("mango");
		//4. 길이값 출력
		System.out.println(arr.length);
		System.out.println(list.size());
		
		//5. 삭제
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
