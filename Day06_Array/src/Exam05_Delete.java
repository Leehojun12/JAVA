import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		// �迭 ����
		// �迭�� ó�� ���� �� ������ ����

		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3};
		// int�� �ʱⰪ�� 0�� �̿��� �ǹ̾��� ������ ����� ������.
//		arr[1] = 0;
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
//		int[] temp = new int[2];
//		for(int i=arr.length; i>1;i--) {
//			if(arr[i] == 2) {
//				continue;
//			}
//			temp[i] = arr[i];
//		}
		
//		String[] temp = {"abc","������","50"};
//		temp[0] = null;
//		for(String s :temp) {
//			if(s != null)
//			System.out.print(s + " ");
//		}
		
		// int �� �迭 �ȿ��� ����ڰ� �Է��� ���� �����ϱ�.
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		// ����ڰ� �Է��� ���� ����ִ� �ε����� 0���� �ٲٽÿ�.
		System.out.print("�Է��Ͻÿ�. >> ");
		try {
		int input = sc.nextInt();
		intArr[input] = 0;
		System.out.println(intArr[input]);
		}catch(Exception e) {
			System.out.println("����");
		}
		for(int i = 0; i < intArr.length;i++) {
			System.out.print(i + " ");
		}
		
		
	}
}
