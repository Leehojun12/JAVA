import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {
		/*
		 * while(���ǽ�){
		 * 		������ �ڵ�
		 * }
		 * -> for���� ���� ���� (�ݺ�) -> �ʱ�� X ������ X
		 * -> ���� �������� �ڵ带 �ݺ��ؾ����� �𸦶�
		 * -> Ư���� ���� �Ͼ�� ������ �ڵ带 ����ؼ� �ݺ��ؾ� �� ��
		 */
		
		// ����ڰ� q ��� �Է��� ������ ��� 1�� ����ϼ���.
		// While���� ����� �� Ư�������� �����Ǹ� ��Ʈ�� ������ϴ� �б⹮
		Scanner sc = new Scanner(System.in);
		
		String input ="";
		while(!input.equals("q")) {
			System.out.print("�Է� >> ");
			input = sc.nextLine();
			System.out.println("���� �ʽ��ϴ�");
			
		}
//		while(true) {
//			System.out.print("�Է� >> ");
//			String input = sc.nextLine();
//			if(input.equals("q"))
//				break;
//			System.out.println(1);
//		}
	}
}
