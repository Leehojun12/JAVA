import java.util.Scanner;

public class Quiz01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�λ縻�� �Է��ϼ���.");
		System.out.print(">> ");
		String greet = sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���. ");
		System.out.print(">> ");
		String name = sc.nextLine();
		
		System.out.println("���� �̸��� �Է��ϼ���.");
		System.out.print(">> ");
		String ename = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���.");
		System.out.print(">> ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("ü�� ���� ����� �Է��ϼ���.");
		System.out.print(">> ");
		//float temp = sc.nextFloat();
		double temp = Double.parseDouble(sc.nextLine());
		
		System.out.println(greet +"\n���� �̸��� "+ name +"�Դϴ�. " + "���� �̸��� " + ename+ "�Դϴ�.\n"+ "�� ���̴� "+age+"�� �Դϴ�.\n"+"������ ü�� ��������� "+temp+"�Դϴ�.");
	}
	
}
