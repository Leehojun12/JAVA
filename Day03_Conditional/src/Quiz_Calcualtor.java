import java.util.Scanner;

public class Quiz_Calcualtor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 계산기 프로그램 ====");
		System.out.print("숫자 입력 1 >> ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자 입력 2 >> ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자( +, - , * , /)");
		System.out.print("연산기호를 입력하시오. > ");
		String a = sc.nextLine();
		if(a.equals("+")) System.out.println("num1 + num2 = "+ (num1 + num2));
		else if(a.equals("-")) System.out.println("num1 - num2 = "+ (num1 - num2));
		else if(a.equals("*")) System.out.println("num1 * num2 = "+ (num1 / num2));
		else System.out.println("num1 / num2 = "+ (num1 / num2));
		
	}
}
