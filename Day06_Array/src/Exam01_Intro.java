public class Exam01_Intro {
	public static void main(String[] args) {
		/*
		 * �迭(Array) : ���� �ڷ����� ����
		 * -> ���� �ڷ��� �������� ��Ƽ� �ϳ��� �̸����� ����
		 *
		 * int[] -> int�� �迭�� �ǹ�(�ڷ���)
		 * arr -> ������ 
		 * new -> heap ������ ���� -> �迭�� �����ڷ���
		 * int[5] -> heap ������ 5ĭ¥�� ���� (����)�� ����ڴ�
		 * -> �迭�� ������ ���� �ݵ�� ������ ��������� ǥ��
		 * �迭�� size(5)�� ũ��� index(4)�� ũ�Ⱑ �ٸ���
		 * System.out.println(arr); -> arr�� �ּҰ�
		 */
		// 30������ �̷��� ��
		// ��~�� (30��)
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		System.out.println(arr);
//		System.out.println("arr[0] : "+ arr[0]);
//		System.out.println("arr[0] : "+ arr[1]);
//		System.out.println("arr[0] : "+ arr[2]);
//		System.out.println("arr[0] : "+ arr[3]);
//		System.out.println("arr[0] : "+ arr[4]);
		
		// �迭 ������ �Բ� �ʱ�ȭ
		
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,5};
		double[] arr4 = {0.5, 1.1, 1.45};
//		System.out.println(arr4[2]);
		String[] arr5 = {"a","b","c"};
//		System.out.println(arr5[2]);
		
		// �̹� �迭�� ����� �����͸� ��� �������� �۾�
//		int[] temp = new int[] {1,2,3,4,5};
//		for(int i =0; i < temp.length;i++) {
//			System.out.print(arr[i]);
//		}
		int[] temp2 = new int[5];
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = i+1;
			System.out.print(temp2[i]);
		}
		System.out.println("\n"+ temp2.length);
	}
}
