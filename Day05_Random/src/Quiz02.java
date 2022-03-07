import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		int winScore = 0;
		int loseScore = 0;
		while (true) {
			System.out.println("==== Up & Down Game ====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("Type menu >> ");
			input = Integer.parseInt(sc.nextLine());
			vending: switch (input) {
			case 1:
				int comNum = (int) (Math.random() * (15 - 1 + 1) + 1);
				for (int i = 0; i < 5; i++) {
					System.out.print("Input Number(Use 5time) >> ");
					int inputNumber = Integer.parseInt(sc.nextLine());
					if (inputNumber > comNum) {
						System.out.println("<<Down>>");
					} else if (inputNumber < comNum) {
						System.out.println("<<Up>>");
					} else {
						System.out.println("<<Excellent!!>>");
						winScore++;
						break vending;
					}
				}
				loseScore++;
				System.out.println("Your Lose");
				break;
			case 2:
				System.out.println("Your current score >> " + winScore + " win" + loseScore + " lose\n");
				break;
			case 3:
				System.out.println("게임이 종료되었습니다.");
				return;
			default:
				System.out.println("again please");
			}
		}
	}
}