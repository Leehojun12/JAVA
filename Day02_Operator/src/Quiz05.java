import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String name = sc.nextLine();
		System.out.print("학년 >> ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("반 >> ");
		int cls = Integer.parseInt(sc.nextLine());
		System.out.print("번호 >> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("성별<M/F> >> ");
		String gender = sc.nextLine();
		gender = gender.equals("M")? "남학생" : "여학생" ;
		System.out.println("성적 >>");
		double score = Double.parseDouble(sc.nextLine());
		
	}
}
