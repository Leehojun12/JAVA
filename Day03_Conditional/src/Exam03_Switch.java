import java.util.Scanner;

public class Exam03_Switch {
	public static void main(String[] args) {
		/*
		 * switch : ���ǹ� if���� ����
		 * 			��Ұ��谡 �ƴ϶� equals ��
		 * switch(��){
		 * 		case ���� : �����ڵ�
		 * 		case ���� : �����ڵ�
		 * 		case ���� : �����ڵ�
		 * 	}
		 */
		// "���"��� ���ڿ��� 3���� ���ڿ��� ���Ͽ� �ڵ带 ����
//		switch("���") {
//			case "�ٳ���" : 
//				System.out.println("�ٳ����Դϴ�.");
//				break;
//			case "���" :	 
//				System.out.println("����Դϴ�.");
//				break;
//			case "���ξ���" :
//				System.out.println("���ξ����Դϴ�.");
//				break;
//			}
		// 1�� 1�Է��ϸ� 1�� ����ϰ� 2�� �Է��ϸ� 2�� ��� 3�� �Է��ϸ� 3�� ����Ͻÿ�.
		
		System.out.print("���� �Է��Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("�߸��� ����");
		}
	}
}
