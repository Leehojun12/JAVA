public class Exam01_Intro {
	public static void main(String[] args) {
		
		/* 연산자
		 *  1. 산술 연산자 ( + - * / % )
		 *	2. 대입 연산자 ( =, +=, -=, %=, *= )
		 *	3. 비교 연산자 ( <, >, <=, >=, ==, != )
		 *	4. 증감 연산자 ( 전위 연산, 후위 연산 )
		 *	5. 논리 연산자 ( && -> and 두개다 true, || -> or 둘 중 하나만 true )
		 *	6. 삼항 연산자 ( 조건식? 식1 : 식2)
		 */
		
		int a = 10;
		int b = 4;
		int c = 4;
	
//		//산술 연산자
//		System.out.println("========== 산술 연산자 ============");
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		
//		// 비교 연산자 -> 
//		System.out.println("a > b : " + (a>b));
//		System.out.println("a < b : " + (a<b));
//		System.out.println("a == b : " + (a==b));
//		System.out.println("a != b : " + (a!=b));
//		System.out.println("b <= c : " + (b<=c));
		
		char c1 = 'a'; // 97
		char c2 = 'A'; // 65
		
//		System.out.println("c1 == c2 : " + (c1 == c2));
//		System.out.println("c1 > c2 : "+ (c1 > c2));
		
		// 참조 자료형인 String 갑에 대한 비교를 할 떈 "=="을 쓰지 X
		// equals() 함수를 이용한다.
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "def";
		
//		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str3));
		
		// 대입 연산자
//		c += 3;
//		c -= 2;
//		c *= 2;
//		System.out.println(c);
		
		// 증감 연산자( 전위 / 후위)
		int e = 20; 
		int f = 20;
//		System.out.println("원본 데이터 : "+ e + "/" + f);
//		System.out.println("전위 증감 : "+ ++e);
//		System.out.println("후위 증감 : "+ e++);
//		System.out.println(e);
		
		// 논리 연산자 (and , or 연산, ! 부정 연산)
//		System.out.println("a > b && a > c : " + (a > b && a > c)); // 두 조건이 무조건 true
//		System.out.println("a > b || a > c :" +(a > b || a > c)); // 하나가 true면 true
		
		// 삼항 연산자( 비교식? A : B)
		System.out.println(a < b ? a : b);
	}
}
