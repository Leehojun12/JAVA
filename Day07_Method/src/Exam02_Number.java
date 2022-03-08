import java.util.Scanner;

public class Exam02_Number {

	public static int smaller(int a, int b) {
		int rs = (a<b)?a:b;
		return rs;
	}
	public static int getRanNum(int x, int y) {
		int ranNum = (int)(Math.random()*(x-y+1)+y);
		return ranNum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 최소값 x와 최대값 y를 받아 -> getRanNum() 최솟값과 최대값 범위 사이의 난수를 반환
	
		System.out.println("두 정수를 입력하시오 .");
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		System.out.println(getRanNum(x, y));
		System.out.println(smaller(x,y));
		
		
		
		// 두 개의 수를 입력받아 smaller() 라는 메서드를 이용해서 두정수 중 더 작은 수를 반환받고 출력
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.println(smaller(a,b));
	}
}
