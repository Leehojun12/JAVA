import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Quiz03_venecia {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== ����ġ�� ���ӿ� ���� �� ȯ���մϴ� ====");
		System.out.println("1.���� ����");
		System.out.println("2.���� ����");
		System.out.print("�޴��� �����ϼ��� >> ");
		int menu = Integer.parseInt(sc.nextLine());
		String[] word = { "������ħ", "������", "�μ�����", "�̱ۺ���", "�͸��䰢", "���굹��", "�ݱ�����", "�ٶ����", "�������" };
		String input = null;
		int a = 0;
		game: while (true) {

			long start = System.currentTimeMillis();
			switch (menu) {
			case 1:
				System.out.println("\n���� start!\n");
				while (a < word.length) {

					for (String w : word) {
						System.out.print(w + " ");
					}
					System.out.print("\n�Է� >>");
					input = sc.nextLine();
					for (int i = 0; i < word.length; i++) {
						if (input.equals(word[i])) {
							word[i] = " ";
							a++;
						} else {
							continue;
						}
					}
				}
				long end = System.currentTimeMillis();
				if (end > 30) {
					System.out.println("�÷��� �ð� : " + (end - start) / 1000 + "��");
					System.out.println("Lose!!");
					System.out.println("��������");
					break game;
				} else {
					System.out.println("Clear!");
					System.out.println("==== Goodbye Venezia;) ====");
				}
				break game;
			case 2:
				System.out.println("==== Goodbye Venezia;) ====");
				return;
			default:
				System.out.println("�ٽ� �Է� �Ͻÿ�.");
			}
		}
	}
}
