import java.util.Scanner;

public class Exam02_if {
	public static void main(String[] args) {

//		System.out.print("수를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
//		int input = Integer.parseInt(sc.nextLine());
//		if(input < 50) System.out.println("1");
//		else System.out.println("2");

		// 입력된 수가 0-50 사이라면 1 출력
		// 51 -100 2 출력
//		if(input >= 0 && input <= 50) System.out.println(1);
//		else if(input > 50 && input <= 100) System.out.println(2);

		// 입력된 정수에 따라 해당하는 결과를 출력
		/*
		 * 100점 : 학업 우수상 70-99점 : 시험 통과 69점 이하 : 재시험 ~ 그중 30점 이하 : 보충학습
		 */

		System.out.print("점수를 입력 하시오 : ");
		int score = Integer.parseInt(sc.nextLine());
		if (score == 100) {
			System.out.println("학업 우수상!!!");
		} else if (score >= 70 && score < 100) {
			System.out.println("시험 통과!!!");
		} else if (score < 70) {
			System.out.println("---재시험---");
			if (score <= 30)
				System.out.println("보충학습까지~~~!!");
		}
	}
}
