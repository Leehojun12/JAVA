import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Balance = 2000;
		int coca = 0;
		int sprite = 0;
		int plum = 0;
		vending:while(true) {		
			System.out.println("===== ���Ǳ� �ùķ����� =====");
			System.out.print("1.�ݶ�(1000) ");
			System.out.print("2.���̴�(800) ");
			System.out.print("3.�Ž���(1500) ");
			System.out.print("[0.����ǰ Ȯ��] ");
			System.out.println("10.���Ǳ� ����");
			System.out.print("������� �����ϼ���. >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 0:
				System.out.println("\n===== ����ǰ ��� =====");
				System.out.println("������ : " + Balance);
				System.out.println("�ݶ� : " + coca);
				System.out.println("���̴� : " + sprite);
				System.out.println("�Ž��� : " + plum);
				break;
			case 1:
				if(Balance >= 1000) {
					System.out.println("�ݶ� �����߽��ϴ�.");
					System.out.println("�ݶ� +1");
					System.out.println("������ -1000");
					coca += 1;
					Balance -= 1000;
				}
				else {
					System.out.println("�ܾ��� �����մϴ�");
				}
				break;
			case 2:
				if(Balance >= 800) {
					System.out.println("���̴ٸ� �����߽��ϴ�.");
					System.out.println("���̴� +1");
					System.out.println("������ -800");
					sprite += 1;
					Balance -= 800;
				}
					else {
					System.out.println("�ܾ��� �����մϴ�");
					}
				break;
			case 3:
				if(Balance >= 1500) {
					System.out.println("�Ž����� �����߽��ϴ�.");
					System.out.println("�Ž��� +1");
					System.out.println("������ -1500");
					plum += 1;
					Balance -= 1500;
				}else {
					System.out.println("�ܾ��� �����մϴ�");
				}
				break;
			case 10:
				System.out.println("���Ǳ� ����");
				break vending;
			default:
				System.out.println("�Է��� ���ڸ� �ٽ� Ȯ�����ּ���.");
			}
		}
	}
}
