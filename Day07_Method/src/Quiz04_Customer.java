import java.util.Scanner;

public class Quiz04_Customer {

	public static String getCustomer(String name) {
		return name + "�� �������!";
	}

	public static String getCustomer(int num) {
		return "�մ�" + num + "�� �����Ͽ����ϴ�.";
	}

	public static String getCustomer(double temp) {
		if (temp < 35.0)
			return "ü���� �ʹ� �����ϴ�.";
		else if (temp >= 36 && temp <= 36.7)
			return "���� ü���Դϴ�.";
		else {
			return "ü���� �ʹ� �����ϴ�.";
		}
	}

	public static String getCustomer(boolean order) {
		if (order == true) {
			return "���� �մ��Դϴ�.";
		} else{
			return "���� �մ��Դϴ�.";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== �մ� ���� ���α׷� ===");
		System.out.print("1. �̸��� �Է��� �ּ��� >> ");
		String name = sc.nextLine();
		System.out.println(getCustomer(name));
		System.out.print("2. �ο����� �Է��� �ּ��� >> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(getCustomer(num));
		System.out.print("3. ���� ü���� �Է��� �ּ���. >> ");
		double temp = sc.nextDouble();
		System.out.println(getCustomer(temp));
		System.out.print("4. ����Ļ� ���θ� �Է��� �ּ��� >> ");
		boolean order = sc.nextBoolean();
		System.out.println(getCustomer(order));

		/*
		 * 4���� ��� getCustomer()��� �̸����� �޼���� �����ε��� ���� 1. ����ڰ� �̸��� �Է��ϸ� '~�� �ȳ��ϼ���!' ��� -
		 * �޼��� 2. ����ڰ� �ο����� �Է��ϸ� '�մ� ~�� �����Ͽ����ϴ�. 3. ����ڰ� ü��(�Ǽ�)�� �Է��ϸ� '���� ������ �մ��� ü���� ~��
		 * �Դϴ�.' 4. ����ڰ� True�� �Է��ϸ� ����մ� false�̸� ���� �մ�
		 */
	}
}
