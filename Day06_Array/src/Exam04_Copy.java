public class Exam04_Copy {
	public static void main(String[] args) {
		// �迭 ����
		// ���� ���� / ���� ����
		
		// ���� �ּҰ��� ������ ������ ����Ű�� �ȴٸ� ���� ����
		// �� ���� ������ ���� ���� �����ϸ� �ٸ� ���� ������ �ּҰ��� �����͵� �����ȴ�
		int[] arr = {1,2,3};
//		System.out.println("���� �� : " + arr[0]);
//		int[] arr1 = arr;
//		arr1[0] = 10;
//		System.out.println("���� �� : " + arr[0]);
		
		// ���� ����
		// ���� �迭 �ȿ� ����ִ� ���� ���簡 �̷����� ��
		// ���� �����Ϳ� ������ ��ġ�� ����
		int[] arr2 = new int[3];
		for(int i = 0; i < 3; i++){
			arr2[i] = arr[i];
		}
		arr2[0]=10;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr2);
		System.out.println(arr2[0]);
	}
}
