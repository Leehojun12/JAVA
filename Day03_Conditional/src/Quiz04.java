import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== ���� ��Ģ���� ���α׷�(1 ~ 100 ���� �Է�) =====");
		System.out.print("ù ��° ������ �Է��ϼ���. >> ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ������ �Է��ϼ���. >> ");
		int num2= Integer.parseInt(sc.nextLine());
		if((num1 > 0 && num1 < 100) && (num2 > 0 && num2 < 100)) {
			System.out.print("�����ڸ� �Է����ּ���. >> ");
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
				System.out.println("�߸��� ������ �Դϴ�. �ٽ� �Է����ּ���.");
			}
		}else {
			System.out.println("�߸��� �Է��Դϴ�. ���� ���� �ٽ� �Է����ּ���");
		}
	}
}
