public class Exam03_ParamArg {
	
	
	public static char getA() {
		return 'A';
	}
	
	public static void greeting() {
		System.out.println("�ȳ��ϼ���~");
	}
	
	public static void main(String[] args) {
		/*
		 * getA() A��� �ϴ� ���� ��ȯ�ް� ����
		 * �Ű����� ���ڰ��� �ݵ�� �־�� �ϴ°� �ƴ� -> �ʼ� X
		 * ���� ���� ���� ���� �ִ� -> void�� ����ϰ� �Ǹ� return�� ��� ���Ѵ� 
		 * void : ���ϰ��� ���� ��� �޼��� ���Ǻο� �����ִ� Ư���� �޼���
		 */
//		System.out.println(getA());
		
		greeting();
	}
}
