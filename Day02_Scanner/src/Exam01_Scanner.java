import java.nio.charset.Charset;
import java.util.Scanner;

public class Exam01_Scanner {
	public static void main(String[] args) {
		
		/* Scanner : 출력용으로만 쓰던 console 창에 입력도 가능하게 해주는 자바 도구
		 * import : 외부로부터 필요한 도구를 가져오는 작업(ctrl + shift + o) 
		 *  -> 입력을 종료하는 엔터키가 버퍼에 남아서 다음 입력시에 영향을 끼칠 수 있음
		 */
		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		System.out.println("input : "+ input);
		// next() : 첫번쨰 뛰어쓰기 혹은 엔터키 앞까지의 문자만 출력

//		String input1 = sc.nextLine();
//		System.out.println(input1);
		// nextLine() : 엔터키 앞까지 모든 문자를 출력
//		System.out.print("이름을 입력 하시오 : ");
//		String name = sc.next();
//		System.out.print("나이를 입력 하시오 : ");
//		int age = sc.nextInt();
//		System.out.print("직업을 입력하시오 : ");
//		String job = sc.next();
//		System.out.println(name + " "+ age +" "+ job);
		
		// nextLine() 을 사용 하면 String -> 형변환해서 사용 (Integer) --parsing 변환-- ((int 형식))
//		int input = Integer.parseInt(sc.nextLine());
//		System.out.println(input);
		
		// nextLine()을 이용해 String -> boolean
		System.out.println("true 혹은 false 를 입력 : ");
		boolean b = Boolean.parseBoolean(sc.nextLine());
		System.out.println(b);
		
		// nextLine()을 이용해 String -> char (한 글자)
//		System.out.println("성별을 입력 : ");
//		char c = sc.nextLine().charAt(0);
//		System.out.println(c);
	}
}
