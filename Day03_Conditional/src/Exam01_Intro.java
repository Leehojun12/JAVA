import java.util.Scanner;

public class Exam01_Intro {
	public static void main(String[] args) {
		
		/*
		 * ���ǹ� : ���ǿ� ���� Ư�� �ڵ带 �����ų ����, ��Ű�� ���� �� ���� 
		 * if(���ǽ�){ ���ǽ� : true/ false ��� ���� ���;� ��
		 * 			���ǽ��� true��� ������ �ڵ�
		 * 			���ǽ��� false��� ���� ���� �ʴ� �ڵ�
		 * 		}
		 * if : ���� ~ ���
		 * if - else if
		 *  : if���� else if���� �ϳ��� ���� ����
		 *  ���ʺ��� �˻��� �������鼭 �ϳ��� ������ �����ϴ� ���� ������ ������ ����������. -> ���ǰ˻� ����
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��Ͻÿ�. >> ");
//		 int a = Integer.parseInt(sc.nextLine());
//		 if(a == 1) System.out.println("�Է��� ���� 1�Դϴ�.");
//		 else if(a == 2) System.out.println("�Է��� ���� 2�Դϴ�.");
//		 else System.out.println("�ٽ� �Է��Ͻÿ�.");
		 
		System.out.println("========= ���ڿ� ���α׷� =========");
		System.out.print("�ܾ ���ÿ�. >>");
		String a = sc.nextLine();
		if(a.equals("���")) System.out.println("apple");
		else if(a.equals("�ٳ���"))System.out.println("Banana");
		else if(a.equals("����"))System.out.println("Grape");
		else System.out.println("��ϵ� �ܾ �����ϴ�.");
		
		 
	}
}
