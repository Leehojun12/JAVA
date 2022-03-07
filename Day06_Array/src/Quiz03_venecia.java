import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Quiz03_venecia {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 베네치아 게임에 오신 걸 환영합니다 ====");
		System.out.println("1.게임 시작");
		System.out.println("2.게임 종료");
		System.out.print("메뉴를 선택하세요 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		String[] word = { "마부위침", "흘깃흘깃", "부서지다", "싱글벙글", "귀모토각", "사흘돌이", "반근착절", "바람언덕", "백전백승" };
		String input = null;
		int a = 0;
		game: while (true) {

			long start = System.currentTimeMillis();
			switch (menu) {
			case 1:
				System.out.println("\n게임 start!\n");
				while (a < word.length) {

					for (String w : word) {
						System.out.print(w + " ");
					}
					System.out.print("\n입력 >>");
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
					System.out.println("플레이 시간 : " + (end - start) / 1000 + "초");
					System.out.println("Lose!!");
					System.out.println("게임종료");
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
				System.out.println("다시 입력 하시오.");
			}
		}
	}
}
