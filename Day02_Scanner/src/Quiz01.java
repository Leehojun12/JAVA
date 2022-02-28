import java.util.Scanner;

public class Quiz01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("인사말을 입력하세요.");
		System.out.print(">> ");
		String greet = sc.nextLine();
		
		System.out.println("이름을 입력하세요. ");
		System.out.print(">> ");
		String name = sc.nextLine();
		
		System.out.println("영문 이름을 입력하세요.");
		System.out.print(">> ");
		String ename = sc.nextLine();
		
		System.out.println("나이을 입력하세요.");
		System.out.print(">> ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("체온 측젗 결과를 입력하세요.");
		System.out.print(">> ");
		//float temp = sc.nextFloat();
		double temp = Double.parseDouble(sc.nextLine());
		
		System.out.println(greet +"\n저의 이름은 "+ name +"입니다. " + "영어 이름은 " + ename+ "입니다.\n"+ "제 나이는 "+age+"살 입니다.\n"+"오늘의 체온 측정결과는 "+temp+"입니다.");
	}
	
}
