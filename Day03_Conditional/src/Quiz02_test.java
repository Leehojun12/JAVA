import java.util.Scanner;

public class Quiz02_test {
	public static void main(String[] args) {
		System.out.println("=== ����� �˾ƺ��� �ɸ��׽�Ʈ ===");

		Scanner sc = new Scanner(System.in);
		String red = "���� ���� �������� ��ġ�� ����� �νη� ��!!!";
		String yellow = "�̻����̰� ������ ����� ������ ����ϱ� �ٶ�� Ÿ��!!!";
		String green = "����� ��ü���� ������ ��ȣ��!!!";
		String orange = "��õ������ �λ��� ���� ����� ������!!!";

		System.out.println("������, ������, ���, �����");
		System.out.print("ù ��° ���� ���� : ");

		String input = sc.nextLine();

		if (input.equals("������")) {
			System.out.println(red + "\n���� �����⺸�� �����ϴ� �������� �米���̸� �������� �־��, " + "�ٸ� ������ ���� ������ ��ȭ�� �ʿ��ؿ�");
		} else if (input.equals("������")) {
			System.out.println(orange + "\n��� ���̵��� �ɵ������� ������ ���� ������� ��̰� �մϴ�.");
		} else if (input.equals("���")) {
			System.out.println(green + "\n�ɷ����̰� ������ Ÿ���̿���.\n" + "�ٸ� �ֺ���Ȳ�̳� ����� ���� ���� ���ɼ��� ���� �־��.");
		} else if (input.equals("�����")) {
			System.out.println(yellow + "���ؾ��� �پ �� ���� ���� �Ͽ� �����ϸ�" + "," + "å�Ӱ� ������ �ʿ���ϴ� ���� �� ��︳�ϴ�.");
		} else {
			System.out.println("�̼��� �������� �ʾƿ�");
		}
	}
}
