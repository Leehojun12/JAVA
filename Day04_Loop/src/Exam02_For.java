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
		for(int i = 1; i <= input; i++) {
			if(i == 3) {
				continue;
			}System.out.print(i);
		}
			
	}
}
