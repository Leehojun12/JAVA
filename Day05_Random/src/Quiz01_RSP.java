import java.util.Scanner;

public class Quiz01_RSP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== ���������� ���� ====");

		vending: while (true) {

			System.out.println("�Ʒ��� ���� �� �ϳ��� �����ϼ���.");

			System.out.println("1.���� 2.���� 3.�� (4. ���ʹ� ���� ��ư)");

			System.out.print(">>");

			int input = Integer.parseInt(sc.nextLine());

			int computer = (int) (Math.random() * (3 - 1 + 1) + 1);

			switch (input) {

			case 1:

				if (computer == 1) {

					System.out.println("��ǻ�� : ���� ����� : ����\n");

					System.out.println("�����ϴ�.");

				} else if (computer == 2) {

					System.out.println("��ǻ�� : ���� ����� : ����\n");

					System.out.println("�����ϴ�.");

				} else {

					System.out.println("��ǻ�� : �� ����� : ����\n");

					System.out.println("�̰���ϴ�.");

				}

				break;

			case 2:

				if (computer == 1) {

					System.out.println("��ǻ�� : ���� ����� : ����\n");

					System.out.println("�̰���ϴ�.");

				} else if (computer == 2) {

					System.out.println("��ǻ�� : ���� ����� : ����\n");

					System.out.println("�����ϴ�.");

				} else {

					System.out.println("��ǻ�� : �� ����� : ����\n");

					System.out.println("�����ϴ�.");

				}

				break;

			case 3:

				if (computer == 1) {

					System.out.println("��ǻ�� : ���� ����� : ��\n");

					System.out.println("�����ϴ�.");

				} else if (computer == 2) {

					System.out.println("��ǻ�� : ���� ����� : ��\n");

					System.out.println("�̰���ϴ�.");

				} else {

					System.out.println("��ǻ�� : �� ����� : ��\n");

					System.out.println("�����ϴ�.");

				}

				break;

			default:

				System.out.println("����Ǿ����ϴ�.");

				break vending;

			}

		}

	}

}