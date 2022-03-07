import java.util.Scanner;

public class Quiz01_RSP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 가위바위보 게임 ====");

		vending: while (true) {

			System.out.println("아래의 숫자 중 하나를 선택하세요.");

			System.out.println("1.가위 2.바위 3.보 (4. 부터는 종료 버튼)");

			System.out.print(">>");

			int input = Integer.parseInt(sc.nextLine());

			int computer = (int) (Math.random() * (3 - 1 + 1) + 1);

			switch (input) {

			case 1:

				if (computer == 1) {

					System.out.println("컴퓨터 : 가위 사용자 : 가위\n");

					System.out.println("비겼습니다.");

				} else if (computer == 2) {

					System.out.println("컴퓨터 : 바위 사용자 : 가위\n");

					System.out.println("졌습니다.");

				} else {

					System.out.println("컴퓨터 : 보 사용자 : 가위\n");

					System.out.println("이겼습니다.");

				}

				break;

			case 2:

				if (computer == 1) {

					System.out.println("컴퓨터 : 가위 사용자 : 바위\n");

					System.out.println("이겼습니다.");

				} else if (computer == 2) {

					System.out.println("컴퓨터 : 바위 사용자 : 바위\n");

					System.out.println("비겼습니다.");

				} else {

					System.out.println("컴퓨터 : 보 사용자 : 바위\n");

					System.out.println("졌습니다.");

				}

				break;

			case 3:

				if (computer == 1) {

					System.out.println("컴퓨터 : 가위 사용자 : 보\n");

					System.out.println("졌습니다.");

				} else if (computer == 2) {

					System.out.println("컴퓨터 : 바위 사용자 : 보\n");

					System.out.println("이겼습니다.");

				} else {

					System.out.println("컴퓨터 : 보 사용자 : 보\n");

					System.out.println("비겼습니다.");

				}

				break;

			default:

				System.out.println("종료되었습니다.");

				break vending;

			}

		}

	}

}