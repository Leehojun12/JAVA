import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� >> ");
		String name = sc.nextLine();
		System.out.print("�г� >> ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("�� >> ");
		int cls = Integer.parseInt(sc.nextLine());
		System.out.print("��ȣ >> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("����<M/F> >> ");
		String gender = sc.nextLine();
		gender = gender.equals("M")? "���л�" : "���л�" ;
		System.out.println("���� >>");
		double score = Double.parseDouble(sc.nextLine());
		
	}
}
