public class Exam01_Intro {
	
	public static int plus(int a, int b) {
		// 매개변수의 자료형과 인자값의 자료형과 수는 반드시 일치
		int rs = a + b;
		return rs; // return을 만나는 순간 결과 값과 함께 메서드 영역을 벗어나 버림.
	}	// 정의부
	public static void main(String[] args) {
		System.out.println(plus(1,5)); // 호출부 

		/*
		 * 코드 상에 제어문(id, while, for, switch)을 제외하고 코드 옆에 () 소괄호가 오면 무조건 메서드
		 * 
		 * Method : 자바에서 기능을 이야기 함
		 * -> 어떤 특정한 작업을 수행하기 위해서 모아놓은 명령문의 집합
		 * -> function(함수)
		 * 
		 * 구상
		 * - 정의부 : 메서드를 정의하는 영역 / 어떤 기능을 수행하게 될지에 대한 코드가 들어가는 영역
		 * public 반환 자료형 메서드명(매개변수...){
		 * 			처리할 코드
		 * 			(리턴값);
		 * }
		 * 
		 * - 호출부 : 정의된 메서드 호출하는 영역 -> 즉 이미 정의된 메서드를 호출해서 그 기능을 쓰겠다 선언하는 영역
		 * 매서드명(인자값...);
		 * 메서드 -> 가용성 가독성, 재사용성이 좋다
		 */
//		// 1, 5를 더한 결과 값을 출력하세요.
//		System.out.println(1 + 5);
//		// 2, 6을 더한 결과 값을 출력하세요.
//		System.out.println(2 + 6);
//		// 100, 200을 더한 결과 값을 출력하세요.
//		System.out.println(100 + 200);		
	}
}
