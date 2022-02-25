public class Exam01_Types {
	public static void main(String[] args) {
		 // 변수 선언 / 값 대입
		int a = 10; // 정수 
		System.out.println(a);
		
		int b; // 공간을 만든다
		//System.out.println(b); 공간에 비어 있기 떄문에 불가능
		b = 20; // 공간에 입력 값을 넣고 채워 넣는다.
		System.out.println(b);
		b = 30; // 덮어 씌우기 
		System.out.println("두번째 b :" + b);
		
//		 변수명의 길이에 제한은 없지만 보통은 짧게... / 의미 있게 짓는다.
//		 특수문자도 시작 X 
//		 변수명 첫 글자는 숫자로 시작하면 X
//		 syntax error = 자바 문법에 맞지 않는다 라는 말
//		 변수안에 들어있는 데이터의 성질에 맞게 이름을 정한다.
//		 int numInt = 40; // numInt --> camel case  단어가 바뀔 때 대문자로 써준다
		
		boolean t = true; // --> 논리적 자료형 boolean 참(true) , 거짓(false)을 저장하는 자료형
		boolean f = false;
		System.out.println(t);
		System.out.println(f);
		
		 //char(캐릭터) : 문자를 저장하는 자료형('' 싱글 쿼테이션을 이용) 
		char c1 = 'a'; // 97
		char c2 = 'b';
		char c3 = '5';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// byte = -128 ~ 127
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);

		// short = -32,768 ~ 32,767
		short s1 = -32768;
		short s2 = 32767;
		System.out.println(s1);
		System.out.println(s2);
		
		// int형 -> 정수의 대표타입
		System.out.println(100);
	
		//long
		long l1 = 321321321;
		System.out.println(l1);
		long l2 = 321321321321L; // int형의 범위를 넘어선 경우 L을 입력, long 변수성질 
		System.out.println(l2);
		
		// 실수형 float -> 데이터의 끝에 f를 붙여줘 float 형임을 명시
		float f1 = 3.14f;
		System.out.println(f1);
		
		// double -> 실수의 대표타입 
		double d1 = 3.14;
		System.out.println(d1);
	}
}