import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요. >> ");
		String str = sc.nextLine();
		System.out.println(str);
		char c = str.charAt(0);
		char c1 = str.charAt(1);
		char c2 = str.charAt(2);
		System.out.println("첫 번째 문자 : "+ c);
		System.out.println("두 번째 문자 : "+ c1);
		System.out.println("세 번째 문자 : "+ c2);
	}
}
