import java.util.Scanner;

public class Exam01_Scanner {
	public static void main(String[] args) {
		
		/* Scanner : ��¿����θ� ���� console â�� �Էµ� �����ϰ� ���ִ� �ڹ� ����
		 * import : �ܺηκ��� �ʿ��� ������ �������� �۾�(ctrl + shift + o) 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		System.out.println("input : "+ input);
		// next() : ù���� �پ�� Ȥ�� ����Ű �ձ����� ���ڸ� ���

//		String input1 = sc.nextLine();
//		System.out.println(input1);
		// nextLine() : ����Ű �ձ��� ��� ���ڸ� ���
		System.out.print("�̸��� �Է� �Ͻÿ� : ");
		String name = sc.next();
		System.out.print("���̸� �Է� �Ͻÿ� : ");
		int age = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		String job = sc.next();
		System.out.println(name + " "+ age +" "+ job);	
	}
}
