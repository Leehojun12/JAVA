import java.util.Scanner;

public class Quiz04_Customer {

	public static void getCustomer(String name) {
		System.out.println(name + "�� �������!");
	}

	public static void getCustomer(int num) {
		System.out.println("�մ�" + num + "�� �����Ͽ����ϴ�.");
	}

	public static void getCustomer(double temp) {
		if (temp < 35.0)
			System.out.println("ü���� �ʹ� �����ϴ�.");
		else if (temp >= 36 && temp <= 36.7)
			System.out.println("���� ü���Դϴ�.");
		else {
			System.out.println("ü���� �ʹ� �����ϴ�.");
		}
	}

	public static void getCustomer(boolean order) {
		if (order == true) {
			System.out.println("���� �մ��Դϴ�.");
		} else if (order == false) {
			System.out.println("���� �մ��Դϴ�.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== �մ� ���� ���α׷� ===");
		System.out.print("1. �̸��� �Է��� �ּ��� >> ");
		String name = sc.nextLine();
		getCustomer(name);
		System.out.print("2. �ο����� �Է��� �ּ��� >> ");
		int num = Integer.parseInt(sc.nextLine());
		getCustomer(num);
		System.out.print("3. ���� ü���� �Է��� �ּ���. >> ");
		double temp = sc.nextDouble();
		getCustomer(temp);
		System.out.print("4. ����Ļ� ���θ� �Է��� �ּ��� >> ");
		boolean order = sc.nextBoolean();
		getCustomer(order);

		/*
		 * 4���� ��� getCustomer()��� �̸����� �޼���� �����ε��� ���� 1. ����ڰ� �̸��� �Է��ϸ� '~�� �ȳ��ϼ���!' ��� -
		 * �޼��� 2. ����ڰ� �ο����� �Է��ϸ� '�մ� ~�� �����Ͽ����ϴ�. 3. ����ڰ� ü��(�Ǽ�)�� �Է��ϸ� '���� ������ �մ��� ü���� ~��
		 * �Դϴ�.' 4. ����ڰ� True�� �Է��ϸ� ����մ� false�̸� ���� �մ�
		 */
	}
}
