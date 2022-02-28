import java.util.Scanner;

public class Exam01_Intro {
	public static void main(String[] args) {
		
		/*
		 * 조건문 : 조건에 따라서 특정 코드를 실행시킬 수도, 시키지 않을 수 있음 
		 * if(조건식){ 조건식 : true/ false 결과 값만 나와야 함
		 * 			조건식이 true라면 실행할 코드
		 * 			조건식이 false라면 실행 하지 않는 코드
		 * 		}
		 * if : 만일 ~ 라면
		 * if - else if
		 *  : if부터 else if까지 하나의 조건 묶음
		 *  위쪽부터 검사해 내려오면서 하나라도 조건이 충족하는 순간 조건의 묶음을 나가버린다. -> 조건검사 종료
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하시오. >> ");
//		 int a = Integer.parseInt(sc.nextLine());
//		 if(a == 1) System.out.println("입력한 수는 1입니다.");
//		 else if(a == 2) System.out.println("입력한 수는 2입니다.");
//		 else System.out.println("다시 입력하시오.");
		 
		System.out.println("========= 문자열 프로그램 =========");
		System.out.print("단어를 쓰시오. >>");
		String a = sc.nextLine();
		if(a.equals("사과")) System.out.println("apple");
		else if(a.equals("바나나"))System.out.println("Banana");
		else if(a.equals("포도"))System.out.println("Grape");
		else System.out.println("등록된 단어가 없습니다.");
		
		 
	}
}
