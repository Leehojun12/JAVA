public class Exam01_Types {
	public static void main(String[] args) {
		 // ���� ���� / �� ����
		int a = 10; // ���� 
		System.out.println(a);
		
		int b; // ������ �����
		//System.out.println(b); ������ ��� �ֱ� ������ �Ұ���
		b = 20; // ������ �Է� ���� �ְ� ä�� �ִ´�.
		System.out.println(b);
		b = 30; // ���� ����� 
		System.out.println("�ι�° b :" + b);
		
//		 �������� ���̿� ������ ������ ������ ª��... / �ǹ� �ְ� ���´�.
//		 Ư�����ڵ� ���� X 
//		 ������ ù ���ڴ� ���ڷ� �����ϸ� X
//		 syntax error = �ڹ� ������ ���� �ʴ´� ��� ��
//		 �����ȿ� ����ִ� �������� ������ �°� �̸��� ���Ѵ�.
//		 int numInt = 40; // numInt --> camel case  �ܾ �ٲ� �� �빮�ڷ� ���ش�
		
		boolean t = true; // --> ���� �ڷ��� boolean ��(true) , ����(false)�� �����ϴ� �ڷ���
		boolean f = false;
		System.out.println(t);
		System.out.println(f);
		
		 //char(ĳ����) : ���ڸ� �����ϴ� �ڷ���('' �̱� �����̼��� �̿�) 
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
		
		// int�� -> ������ ��ǥŸ��
		System.out.println(100);
	
		//long
		long l1 = 321321321;
		System.out.println(l1);
		long l2 = 321321321321L; // int���� ������ �Ѿ ��� L�� �Է�, long �������� 
		System.out.println(l2);
		
		// �Ǽ��� float -> �������� ���� f�� �ٿ��� float ������ ���
		float f1 = 3.14f;
		System.out.println(f1);
		
		// double -> �Ǽ��� ��ǥŸ�� 
		double d1 = 3.14;
		System.out.println(d1);
	}
}