import java.util.Scanner;

public class Quiz01_PrintName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("** 입장을 종료하려면 q를 입력하세요. **");
			System.out.print(" 닉네임을 입력해 주세요 >> ");
			String input = sc.nextLine();
			if (input.equals("manager"))
				System.out.println("매니저님 오셨어요?");
			else if (input.equals("q"))
				break;
			else
				System.out.println(input + "님 어서오세요!");
		}
	}
}
