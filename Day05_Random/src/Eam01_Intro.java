import java.util.Scanner;

public class Eam01_Intro {
	public static void main(String[] args) {
		/*
		 * ������ �� ���� -> Math.random() : 0.0 ~ 1.0 ������ ������ ����
		 * System.out.print(Math.random());
		 *
		 * ������ ���� ���� ������ ������ ���� �̾Ƴ��� ������ (Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�
		 */

//		for(int i = 0; i < 5; i++) {
//			System.out.println(Math.random());
//		}
//		for(int i = 0; i<50; i++) {
//		System.out.print( (char)(Math.random() * (122 - 65 + 1)) + 65 +" ");
//		}

		// ���� : 1 ~ 10 ������ �������� ��ǻ�Ͱ� �̾Ƴ��� -> ����ڰ� Ȧ/¦ �� �ϳ��� �Է�
		// -> Ȧ���� ¦���� ���ο� ���� ����ڿ��� ����! Ȥ�� ����!

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = (int) (Math.random() * (10 - 1 + 1) + 1);
			// �ʱ�ȭ : ������ �ʱⰪ(default��)�� �ִ� ��

			// String rs = "";
			String rs = null; // rs��� ��ҿ� ����ִ� �ʰ� ������ִ� ��
			if (a % 2 == 1) {
				rs = "Ȧ";
			} else if (a % 2 == 0) {
				rs = "¦";
			}
			System.out.print("Ȧ/¦�� �Է��Ͻÿ� >> ");
			String input = sc.nextLine();
			if (input.equals(rs)) {
				System.out.println("����!");
				System.out.println("Random���� ���� �� : " + a);
			} else {
				System.out.println("����");
				System.out.println("Random���� ���� �� : " + a);
				System.out.println("��������");
				break;
			}
		}
	}
}
