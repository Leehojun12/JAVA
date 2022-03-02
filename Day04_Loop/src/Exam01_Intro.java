public class Exam01_Intro {
	public static void main(String[] args) {
		/*
		 * 반복문 : 조건문처럼 프로그램(코드)의 흐름을 제어할 수 있는 문법
		 *  -> 조건식을 충족하는 동안은 해당 범위(범위)의 코드가 반복되서 실행 됨.
		 *  -> 반면 조건식으 불충족하는 순간 그 범위를 벗어나 코드의 흐름이 원래대로 아래로 흘러 내려간다.
		 *  
		 *  for(초기식; 조건식; 증감식){
		 *  		실행할 코드
		 *  }
		 *  while(조건식){
		 *  		실행할 코드
		 *  }
		 */
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		for(int i = 0; i < 5; i++){
//			System.out.println(i);
//		}
		// 1- 100까지 for문을 이용해 출력
//		for(int i = 1; i < 101; i++) {
//			System.out.print(i);
//		}
		// 100-1까지 for문을 이용해 출력
		for(int i = 100; i > 0; i--) {
			System.out.print(i);
		}
	}
}
