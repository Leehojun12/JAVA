public class Current {
	public static void main(String[] args) {
		
		// ����Ÿ�ڿ��� = �꼺��
		// ������ ������ �������� ����� �������� �ð��� ��
		// -> System.currentTimeMillis() -> ����ð��� long�� �����ͷ� �̾���
		long start = System.currentTimeMillis(); 
		for(int i =0; i < 9999999; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end -start)/1000 + "��");
	}
}
