import java.util.Scanner;

public class Exam02_if {
	public static void main(String[] args) {

//		System.out.print("���� �Է��Ͻÿ�. : ");
		Scanner sc = new Scanner(System.in);
//		int input = Integer.parseInt(sc.nextLine());
//		if(input < 50) System.out.println("1");
//		else System.out.println("2");

		// �Էµ� ���� 0-50 ���̶�� 1 ���
		// 51 -100 2 ���
//		if(input >= 0 && input <= 50) System.out.println(1);
//		else if(input > 50 && input <= 100) System.out.println(2);

		// �Էµ� ������ ���� �ش��ϴ� ����� ���
		/*
		 * 100�� : �о� ����� 70-99�� : ���� ��� 69�� ���� : ����� ~ ���� 30�� ���� : �����н�
		 */

		System.out.print("������ �Է� �Ͻÿ� : ");
		int score = Integer.parseInt(sc.nextLine());
		if (score == 100) {
			System.out.println("�о� �����!!!");
		} else if (score >= 70 && score < 100) {
			System.out.println("���� ���!!!");
		} else if (score < 70) {
			System.out.println("---�����---");
			if (score <= 30)
				System.out.println("�����н�����~~~!!");
		}
	}
}
