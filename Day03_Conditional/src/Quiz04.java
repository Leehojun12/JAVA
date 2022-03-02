import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 정수 사칙연산 프로그램(1 ~ 100 사이 입력) =====");
		System.out.print("첫 번째 정수를 입력하세요. >> ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 정수를 입력하세요. >> ");
		int num2= Integer.parseInt(sc.nextLine());
		if((num1 > 0 && num1 < 100) && (num2 > 0 && num2 < 100)) {
			System.out.print("연사자를 입력해주세요. >> ");
			String opt =sc.nextLine();
			switch(opt) {
			case "+":
				System.out.println("num1 + num2 = " + (num1 + num2));
				break;
			case "-":
				System.out.println("num1 - num2 = " + (num1 - num2));
				break;
			case "*":
				System.out.println("num1 * num2 = " + (num1 * num2));
				break;
			case "/":
				System.out.println("num1 / num2 = " + (num1 / num2));
				break;
			default:
				System.out.println("잘못된 연산자 입니다. 다시 입력해주세요.");
			}
		}else {
			System.out.println("잘못된 입력입니다. 정수 값을 다시 입력해주세요");
		}
	}
}
