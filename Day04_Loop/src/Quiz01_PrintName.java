import java.util.Scanner;

public class Quiz01_PrintName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; ; i++) {
			System.out.println("** ������ �����Ϸ��� q�� �Է��ϼ���. **");
			System.out.print(" �г����� �Է��� �ּ��� >> ");
			String input = sc.nextLine();
			if(input.equals("manager"))
				System.out.println("�Ŵ����� ���̾��?");	
			else if (input.equals("q"))
				break;
			else
			System.out.println(i + " : " + input + "�� �������!");
		}
	}
}
