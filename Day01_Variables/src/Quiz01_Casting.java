
public class Quiz01_Casting {
	public static void main(String[] args) {
	 
		//���� 1 : �־��� ���� ��� int ������ ��ȯ�ؼ� ��� ���� ���� ��� 
		char a ='2';
		double b = 5.6;
		long c = 1250000L;
		int d = 10000;
		
		int rs;
		//rs = a + (int)b + (int)c + d;
		rs = (int)(a + b+ c + d);
		System.out.println("rs : "+ rs);
	}
}
