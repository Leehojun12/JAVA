public class Exam01_Intro {
	public static void main(String[] args) {
		
		/* ������
		 *  1. ��� ������ ( + - * / % )
		 *	2. ���� ������ ( =, +=, -=, %=, *= )
		 *	3. �� ������ ( <, >, <=, >=, ==, != )
		 *	4. ���� ������ ( ���� ����, ���� ���� )
		 *	5. �� ������ ( && -> and �ΰ��� true, || -> or �� �� �ϳ��� true )
		 *	6. ���� ������ ( ���ǽ�? ��1 : ��2)
		 */
		
		int a = 10;
		int b = 4;
		int c = 4;
	
//		//��� ������
//		System.out.println("========== ��� ������ ============");
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		
//		// �� ������ -> 
//		System.out.println("a > b : " + (a>b));
//		System.out.println("a < b : " + (a<b));
//		System.out.println("a == b : " + (a==b));
//		System.out.println("a != b : " + (a!=b));
//		System.out.println("b <= c : " + (b<=c));
		
		char c1 = 'a'; // 97
		char c2 = 'A'; // 65
		
//		System.out.println("c1 == c2 : " + (c1 == c2));
//		System.out.println("c1 > c2 : "+ (c1 > c2));
		
		// ���� �ڷ����� String ���� ���� �񱳸� �� �� "=="�� ���� X
		// equals() �Լ��� �̿��Ѵ�.
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "def";
		
//		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str3));
		
		// ���� ������
//		c += 3;
//		c -= 2;
//		c *= 2;
//		System.out.println(c);
		
		// ���� ������( ���� / ����)
		int e = 20; 
		int f = 20;
//		System.out.println("���� ������ : "+ e + "/" + f);
//		System.out.println("���� ���� : "+ ++e);
//		System.out.println("���� ���� : "+ e++);
//		System.out.println(e);
		
		// �� ������ (and , or ����, ! ���� ����)
//		System.out.println("a > b && a > c : " + (a > b && a > c)); // �� ������ ������ true
//		System.out.println("a > b || a > c :" +(a > b || a > c)); // �ϳ��� true�� true
		
		// ���� ������( �񱳽�? A : B)
		System.out.println(a < b ? a : b);
	}
}
