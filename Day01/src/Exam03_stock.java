public class Exam03_stock {
	public static void main(String[]args) {
		/* �ֽ� �Ÿ� ���α׷� */
		
		int a = 40000;
		int b = 60000;
		int c = 30000;
		int d = 200000;

		System.out.println("========= �ֽĸ��� ========");
		System.out.println("1. �Ｚ���� (1��: "+ a +")");
		System.out.println("2. �׽��� (1��: "+ b +")");
		System.out.println("3. īī�� (1��: "+ c +")");
		System.out.println("�ܰ� : "+ d +"��");
		System.out.println("=========================");
		
		System.out.println("�Ｚ���� 1�� �ż�");
		System.out.println("�ܰ� : "+ (d - a) +"��");
		
		System.out.println("�׽��� 2�� �ż�");
		System.out.println("�ܰ� : " +(d - a - b*2) +"��");
		
		System.out.println("īī�� 1�� �ż�");
		System.out.println("�ܰ� : " + (d- a - b*2 - c)+"��");
	}
}
