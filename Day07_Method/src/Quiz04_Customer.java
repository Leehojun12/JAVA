import java.util.Scanner;

public class Quiz04_Customer {

	public static void getCustomer(String name) {
		System.out.println(name + "님 어서오세요!");
	}

	public static void getCustomer(int num) {
		System.out.println("손님" + num + "명 입장하였습니다.");
	}

	public static void getCustomer(double temp) {
		if (temp < 35.0)
			System.out.println("체온이 너무 낮습니다.");
		else if (temp >= 36 && temp <= 36.7)
			System.out.println("정산 체온입니다.");
		else {
			System.out.println("체온이 너무 높습니다.");
		}
	}

	public static void getCustomer(boolean order) {
		if (order == true) {
			System.out.println("매장 손님입니다.");
		} else if (order == false) {
			System.out.println("포장 손님입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 손님 맞이 프로그램 ===");
		System.out.print("1. 이름을 입력해 주세요 >> ");
		String name = sc.nextLine();
		getCustomer(name);
		System.out.print("2. 인원수를 입력해 주세요 >> ");
		int num = Integer.parseInt(sc.nextLine());
		getCustomer(num);
		System.out.print("3. 현재 체온을 입력해 주세요. >> ");
		double temp = sc.nextDouble();
		getCustomer(temp);
		System.out.print("4. 매장식사 여부를 입력해 주세요 >> ");
		boolean order = sc.nextBoolean();
		getCustomer(order);

		/*
		 * 4가지 모두 getCustomer()라는 이름으로 메서드로 오버로딩을 적용 1. 사용자가 이름을 입력하면 '~님 안녕하세요!' 출력 -
		 * 메서드 2. 사용자가 인원수를 입력하면 '손님 ~명 입장하였습니다. 3. 사용자가 체온(실수)을 입력하면 '현재 입장한 손님의 체온은 ~도
		 * 입니다.' 4. 사용자가 True를 입력하면 매장손님 false이면 포장 손님
		 */
	}
}
