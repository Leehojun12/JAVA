import java.util.Scanner;

public class Exam02_For {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. >> ");
		int input = Integer.parseInt(sc.nextLine());
		
		// 1���� ����ڰ� �Է��� ������ ����ϴ� �ڵ�
//		for(int i = 0; i <= input; i++) {
//			System.out.println(i);
//		}
		
		// 1���� ����ڰ� �Է��� ������ ����� �Ұǵ� Ȧ���� ���
//		for(int i=1; i <= input; i++) {
//			if(i%2 == 1)
//				System.out.print(i);
//		}
		
		// �������� �̿��� i�� 2�� �������Ѽ� Ȧ���� �����
//		for(int i=1; i<=input; i+=2) {
//			System.out.print(i);			
//		}
		
		// 1~5���� ���ڸ� ���ʴ�� ����ϴµ� 3�� ���� ���
//		for (int i = 1; i <= input; i++) {
//			if (i != 3)
//				System.out.print(i);
//		}
		for(int i = 1; i <= input; i++) {
			if(i == 3) {
				continue;
			}System.out.print(i);
		}
			
	}
}
