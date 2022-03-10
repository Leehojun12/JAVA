public class Exam04_Overloading {
	/*
	 * overloading : 메서드가 정의 됐을때 -> 하나의 기능이 있음
	 * -> 기존에 메서드가 가지고 있는 기능에 추가적인 인자값이나 자료형의 변화를 줘서
	 * 기본적인 베서드의 형태를 다양화 할 수 있는 문법
	 * 메서드의 이름이 같은데... 매개변수의 갯수가 다른경우 -> Overloading된 메서드다!!
	 */
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	// 메서드명이 같지만 매개변수의 자료형이 다름 == 오버로딩
	public static double plus(double a, double b) {
		return a + b;
	}
	
	// 메서드명은 같지만 매개변수의 개수가 다름. == 오버로딩
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	// 메서드명은 같지만 매개변수의 개수와 자료형이 다르다. == 오버로딩
	public static int plus(char char1, char char2, char char3) {
		return char1 + char2 + char3;
	}
	
	// 오버로딩 O
	public static int plus() {
		return 5 + 10;
	}
	
	// 오버로딩이 성립이 안되는경우 X
	// -> 반환타입이 달라지게 되면 아예 다른 메서드로 인식
	// -> 하나의 클래스에는 중복된 이름의 다른 메서드가 존재해서는 안됨.
//	public static void plus(int a, int b) {
//		a + b;
//	}
	
	// 리턴자료형이 달라지고 + 매개변수의 형태도 달라지게 되면 다른 메서드로써 같은 이름을 사용하는게 가능
	// 오버로딩 X
	public static void plus(float a, float b) {
		float rs = a + b;
	}
	
	public static void main(String[] args) {
		// 두 개의 정수를 더하는 메서드
		System.out.println(plus(10, 5));
		
		// 두 개의 실수를 더하는 메서드
		System.out.println(plus(0.2 , 0.5));
		
		// 세 개의 정수를 더하는 메서드
		System.out.println(plus(10, 5, 10));
		
		// 세 개의 char 데이터를 더하는 메서드
		System.out.println(plus('a','b','c'));
	}
}
