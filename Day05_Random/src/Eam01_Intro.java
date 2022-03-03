import java.util.Scanner;

public class Eam01_Intro {
	public static void main(String[] args) {
		/*
		 * 랜덤한 수 생성 -> Math.random() : 0.0 ~ 1.0 사이의 난수를 생성
		 * System.out.print(Math.random());
		 *
		 * 지정한 숫자 범위 내에서 랜덤한 수를 뽑아내고 싶을때 (Math.random() * (최대값 - 최소값 + 1)) + 최소값
		 */

//		for(int i = 0; i < 5; i++) {
//			System.out.println(Math.random());
//		}
//		for(int i = 0; i<50; i++) {
//		System.out.print( (char)(Math.random() * (122 - 65 + 1)) + 65 +" ");
//		}

		// 퀴즈 : 1 ~ 10 사이의 랜덤값을 컴퓨터가 뽑아내면 -> 사용자가 홀/짝 중 하나를 입력
		// -> 홀인지 짝인지 여부에 따라 사용자에게 정답! 혹은 실패!

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = (int) (Math.random() * (10 - 1 + 1) + 1);
			// 초기화 : 변수에 초기값(default값)을 주는 것

			// String rs = "";
			String rs = null; // rs라는 장소에 비어있는 않게 만들어주는 것
			if (a % 2 == 1) {
				rs = "홀";
			} else if (a % 2 == 0) {
				rs = "짝";
			}
			System.out.print("홀/짝을 입력하시오 >> ");
			String input = sc.nextLine();
			if (input.equals(rs)) {
				System.out.println("정답!");
				System.out.println("Random으로 나온 수 : " + a);
			} else {
				System.out.println("실패");
				System.out.println("Random으로 나온 수 : " + a);
				System.out.println("게임종료");
				break;
			}
		}
	}
}
