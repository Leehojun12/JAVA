public class Quiz01_AtoZ {
	public static void main(String[] args) {
		
		//char �� �迭 26ĭ¥�� ���� ���ĺ� A���� Z���� ����
		// �����ϸ� ��±���. ** �ƽ�Ű�ڵ� Ȱ��
		
		char[] arr = new char[26];
		// �Ϲ����� for�������� ���ǽ��� ���� �������� �ݺ������� �����ϴ°� ����
		for(int i=0; i<arr.length;i++) {
			arr[i] = (char)(65+i);
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		
		// foreach : ���� for��
		// ������ 0������ �������� ���������� �ϳ��� ��ġ�� �ʰ� ���İ���
		// char i�� 0��° �迭���� 'A'�� ������ �׸��� 'B'... 
		
		for(char i : arr){
			System.out.print(i + " ");
		}
	}
}
