import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {
		/*
		 * while(조건식){
		 * 		실행할 코드
		 * }
		 * -> for문과 같은 역할 (반복) -> 초기식 X 증감식 X
		 * -> 보통 언제까지 코드를 반복해야할지 모를때
		 * -> 특별한 일이 일어나기 전까지 코드를 계속해서 반복해야 할 때
		 */
		
		// 사용자가 q 라고 입력할 때까지 계속 1을 출력하세요.
		// While문을 사용할 때 특정조건이 충족되면 세트로 써줘야하는 분기문
		Scanner sc = new Scanner(System.in);
		
		String input ="";
		while(!input.equals("q")) {
			System.out.print("입력 >> ");
			input = sc.nextLine();
			System.out.println("같지 않습니다");
			
		}
//		while(true) {
//			System.out.print("입력 >> ");
//			String input = sc.nextLine();
//			if(input.equals("q"))
//				break;
//			System.out.println(1);
//		}
	}
}
