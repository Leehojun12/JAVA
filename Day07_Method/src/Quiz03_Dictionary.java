import java.util.Scanner;

public class Quiz03_Dictionary {

	public static String dict(String N) {
		String eng = " ";
		if (N.equals("���")) {
			eng = "APPLE";
		} else if (N.equals("����")) {
			eng = "GRAPE";
		} else if (N.equals("�ٳ���")) {
			eng = "BANANA";
		} else {
			eng = "��ϵ��� ���� �ܾ�";
		}
		System.out.println("�Է��� " + N + "��(��) " + eng + " �Դϴ�.");
		return N;
	}

	public static void dict1(String N) {
		String kor = "";
		if (N.equals("APPLE")) {
			kor = "���";
		} else if (N.equals("GRAPE")) {
			kor = "����";
		} else if (N.equals("BANANA")) {
			kor = "�ٳ���";
		} else {
			kor = "��ϵ��� ���� �ܾ�";
		}
		System.out.println("�Էµ� " + N + "��(��) " + kor + " �Դϴ�.");
	}

	public static void main(String[] args) {

		// ����ڿ���
		// ==== ���ϴ� ������ �̸��� �Է��ϼ���. ====
		// >>
		// -> dict() �޼��带 �̿��ؼ� ����ڰ� �Է��� ���� ���� �ܾ�� �ٲ㼭 ��ȯ���ִ� �޼��带 ����
		// -> ��������� "�Է��� 00�� ����� 00�Դϴ�."
		// -> ���, �ٳ��� ���� ���� ���� �Է��ϸ� "������ ��ϵ� �ܾ �����ϴ�."

		Scanner sc = new Scanner(System.in);
		String N = null;
		System.out.println("==== ���ϴ� ������ �̸��� �Է��ϼ���. ====");
		System.out.println("1. �ѱ۷� �˻�");
		System.out.println("2. ����� �˻�");
		System.out.print("�޴� ���� >> ");
		int menu = Integer.parseInt(sc.nextLine());
		if (menu == 1) {
			System.out.print("���ϴ� ���� �̸��� �Է� >> ");
			N = sc.nextLine();
			dict(N);
		} else {
			System.out.print("���ϴ� ���� �̸��� �Է� >> ");
			N = sc.nextLine();
			dict1(N);
		}
	}
}
