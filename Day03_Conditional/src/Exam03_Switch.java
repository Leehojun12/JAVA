import java.util.Scanner;

public class Exam03_Switch {
	public static void main(String[] args) {
		/*
		 * switch : 조건문 if문과 유사
		 * 			대소관계가 아니라 equals 비교
		 * switch(값){
		 * 		case 조건 : 실행코드
		 * 		case 조건 : 실행코드
		 * 		case 조건 : 실행코드
		 * 	}
		 */
		// "사과"라는 문자열을 3개의 문자열과 비교하여 코드를 실행
//		switch("사과") {
//			case "바나나" : 
//				System.out.println("바나나입니다.");
//				break;
//			case "사과" :	 
//				System.out.println("사과입니다.");
//				break;
//			case "파인애플" :
//				System.out.println("파인애플입니다.");
//				break;
//			}
		// 1을 1입력하면 1을 출력하고 2를 입력하면 2를 출력 3을 입력하면 3을 출력하시오.
		
		System.out.print("수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("잘못된 오류");
		}
	}
}
