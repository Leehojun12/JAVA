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
		
		// ����ڿ��� �ּҰ� x�� �ִ밪 y�� �޾� -> getRanNum() �ּڰ��� �ִ밪 ���� ������ ������ ��ȯ
	
		System.out.println("�� ������ �Է��Ͻÿ� .");
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		System.out.println(getRanNum(x, y));
		System.out.println(smaller(x,y));
		
		
		
		// �� ���� ���� �Է¹޾� smaller() ��� �޼��带 �̿��ؼ� ������ �� �� ���� ���� ��ȯ�ް� ���
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.println(smaller(a,b));
	}
}
