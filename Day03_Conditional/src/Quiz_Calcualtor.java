import java.util.Scanner;

public class Quiz_Calcualtor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ���� ���α׷� ====");
		System.out.print("���� �Է� 1 >> ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� �Է� 2 >> ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("������( +, - , * , /)");
		System.out.print("�����ȣ�� �Է��Ͻÿ�. > ");
		String a = sc.nextLine();
		if(a.equals("+")) System.out.println("num1 + num2 = "+ (num1 + num2));
		else if(a.equals("-")) System.out.println("num1 - num2 = "+ (num1 - num2));
		else if(a.equals("*")) System.out.println("num1 * num2 = "+ (num1 / num2));
		else System.out.println("num1 / num2 = "+ (num1 / num2));
		
	}
}
