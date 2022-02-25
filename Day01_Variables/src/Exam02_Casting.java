public class Exam02_Casting {
	public static void main(String[]args) {
		/*
		 * ����ȯ(Casting) : �������� �ڷ����� ��ȯ�ϴ� �� 
		 * -> �����ڰ� �������� Ÿ���� ������ �������� ������ �� 
		 * 
		 * �ڵ� ����ȯ(promotion) : ���� �ڷ������� ū �ڷ������� ��ȯ�� �̷������ ���
		 * ���� ����ȯ(down casting) : ū �ڷ������� ���� �ڷ������� ��ȯ�� �̷������ ��� (������ �ս�)
		 * 
		 */
		
//		byte b1 = 127;
//		System.out.println("b1 : "+ b1);
//		short s1 = b1;
//		System.out.println("s1 : "+ s1);
//		int i1 = s1;
//		System.out.println("i1 : "+ i1);
//		long l1 = i1;System.out.println(a * b);
//		System.out.println("l1 : "+ l1);
		
		long l2 = 123456789123456789L;
		System.out.println("l2 : "+ l2);
		int i2 = (int)l2;
		System.out.println("i2 : "+ i2);
		short s2 = (short)i2;
		System.out.println("s2 : "+ s2);
		byte b2 = (byte)s2;
		System.out.println("b2 : "+ b2);
		
		//���� -> �Ǽ��� ����ȯ
		int i3 = 50;
		float f3 = i3;
		System.out.println("f3 : "+ f3);
		
		// �Ǽ� -> ������ ����ȯ
		double d4 = 3.14;
		int i4 = (int)d4;
		System.out.println("i4 : "+i4);
		
		// char -> �����δ� ���������� ���ڿ� ��Ī�Ǵ� ����(�ڵ�)�� �������
		char c5 = 'a';
		System.out.println("c5 : "+c5);
		int i5 = c5;
		System.out.println("i5 : "+ i5);
		
	}
}