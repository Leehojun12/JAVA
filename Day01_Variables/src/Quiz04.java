import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. >> ");
		String str = sc.nextLine();
		System.out.println(str);
		char c = str.charAt(0);
		char c1 = str.charAt(1);
		char c2 = str.charAt(2);
		System.out.println("ù ��° ���� : "+ c);
		System.out.println("�� ��° ���� : "+ c1);
		System.out.println("�� ��° ���� : "+ c2);
	}
}
