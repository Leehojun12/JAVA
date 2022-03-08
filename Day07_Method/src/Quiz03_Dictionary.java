import java.util.Scanner;

public class Quiz03_Dictionary {

	public static String dict(String N) {
		String eng = " ";
		if (N.equals("사과")) {
			eng = "APPLE";
		} else if (N.equals("포도")) {
			eng = "GRAPE";
		} else if (N.equals("바나나")) {
			eng = "BANANA";
		} else {
			eng = "등록되지 않은 단어";
		}
		System.out.println("입력한 " + N + "는(은) " + eng + " 입니다.");
		return N;
	}

	public static void dict1(String N) {
		String kor = "";
		if (N.equals("APPLE")) {
			kor = "사과";
		} else if (N.equals("GRAPE")) {
			kor = "포도";
		} else if (N.equals("BANANA")) {
			kor = "바나나";
		} else {
			kor = "등록되지 않은 단어";
		}
		System.out.println("입력된 " + N + "는(은) " + kor + " 입니다.");
	}

	public static void main(String[] args) {

		// 사용자에게
		// ==== 원하는 과일의 이름을 입력하세요. ====
		// >>
		// -> dict() 메서드를 이용해서 사용자가 입력한 과일 영어 단어로 바꿔서 반환해주는 메서드를 구성
		// -> 사용자한테 "입력한 00은 영어로 00입니다."
		// -> 사과, 바나나 딸기 외의 값을 입력하면 "사전에 등록된 단어가 없습니다."

		Scanner sc = new Scanner(System.in);
		String N = null;
		System.out.println("==== 원하는 과일의 이름을 입력하세요. ====");
		System.out.println("1. 한글로 검색");
		System.out.println("2. 영어로 검색");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		if (menu == 1) {
			System.out.print("원하는 과일 이름을 입력 >> ");
			N = sc.nextLine();
			dict(N);
		} else {
			System.out.print("원하는 과일 이름을 입력 >> ");
			N = sc.nextLine();
			dict1(N);
		}
	}
}
