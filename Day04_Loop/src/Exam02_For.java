import java.util.Scanner;

public class Exam02_For {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오. >> ");
		int input = Integer.parseInt(sc.nextLine());
		
		// 1부터 사용자가 입력한 값까지 출력하는 코드
//		for(int i = 0; i <= input; i++) {
//			System.out.println(i);
//		}
		
		// 1부터 사용자가 입력한 값까지 출력을 할건데 홀수만 출력
//		for(int i=1; i <= input; i++) {
//			if(i%2 == 1)
//				System.out.print(i);
//		}
		
		// 증감식을 이용해 i를 2씩 증가시켜서 홀수로 만들기
//		for(int i=1; i<=input; i+=2) {
//			System.out.print(i);			
//		}
		
		// 1~5까지 숫자를 차례대로 출력하는데 3만 빼고 출력
//		for (int i = 1; i <= input; i++) {
//			if (i != 3)
//				System.out.print(i);
//		}
//		for(int i = 1; i <= input; i++) {
//			if(i == 3) {
//				continue;
//			}System.out.print(i);
//		}
		
		// 사용자에게 입력값을 받을 것
		// 1부터 입력값까지의 전체 합을 출력
		// 입력 값 : 5
		// 1 + 2 + 3 + 4 + 5
		
		// 지역변수 : 반복문/조건문 혹은 메서드(기능)의 {}안 범위에서만 사용할 수 있는 변수
		// 같은 지역에서 선언된 변수는 얼마든지 같은 영역에서 가져다 사용하는 것 가능
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println(sum);
		
			
	}
}
