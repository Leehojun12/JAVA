public class Exam04_Overloading {
	/*
	 * overloading : �޼��尡 ���� ������ -> �ϳ��� ����� ����
	 * -> ������ �޼��尡 ������ �ִ� ��ɿ� �߰����� ���ڰ��̳� �ڷ����� ��ȭ�� �༭
	 * �⺻���� �������� ���¸� �پ�ȭ �� �� �ִ� ����
	 * �޼����� �̸��� ������... �Ű������� ������ �ٸ���� -> Overloading�� �޼����!!
	 */
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	// �޼������ ������ �Ű������� �ڷ����� �ٸ� == �����ε�
	public static double plus(double a, double b) {
		return a + b;
	}
	
	// �޼������ ������ �Ű������� ������ �ٸ�. == �����ε�
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	// �޼������ ������ �Ű������� ������ �ڷ����� �ٸ���. == �����ε�
	public static int plus(char char1, char char2, char char3) {
		return char1 + char2 + char3;
	}
	
	// �����ε� O
	public static int plus() {
		return 5 + 10;
	}
	
	// �����ε��� ������ �ȵǴ°�� X
	// -> ��ȯŸ���� �޶����� �Ǹ� �ƿ� �ٸ� �޼���� �ν�
	// -> �ϳ��� Ŭ�������� �ߺ��� �̸��� �ٸ� �޼��尡 �����ؼ��� �ȵ�.
//	public static void plus(int a, int b) {
//		a + b;
//	}
	
	// �����ڷ����� �޶����� + �Ű������� ���µ� �޶����� �Ǹ� �ٸ� �޼���ν� ���� �̸��� ����ϴ°� ����
	// �����ε� X
	public static void plus(float a, float b) {
		float rs = a + b;
	}
	
	public static void main(String[] args) {
		// �� ���� ������ ���ϴ� �޼���
		System.out.println(plus(10, 5));
		
		// �� ���� �Ǽ��� ���ϴ� �޼���
		System.out.println(plus(0.2 , 0.5));
		
		// �� ���� ������ ���ϴ� �޼���
		System.out.println(plus(10, 5, 10));
		
		// �� ���� char �����͸� ���ϴ� �޼���
		System.out.println(plus('a','b','c'));
	}
}
