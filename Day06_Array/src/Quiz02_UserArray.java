import java.util.Scanner;

public class Quiz02_UserArray {
	public static void main(String[] args) {
		
		// ����ڿ��� �Է¹��� ������ŭ int �� �迭�� ũ�⸦ �Ҵ�
		// �׸��� 1���� ���������� ���� ����
		
		//NumberFormatException
		// try~ catch��: ����(����) ó��

			
		try {
			// ������ �߻��� �� �ִ� ������ �ִ� �ڵ带 �� ���ʿ� �־���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�. >> ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println(arr[10]);
		}catch(Exception e){
			// ���࿡ try �� ������ �ڵ忡�� ������ �߻��ߴٸ�
			// �������ְ� ���� �ڵ峪 �۾��� �� ���ʿ��� ����
			System.out.println("a");
		}
//		for(int i=0; i<arr.length;i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
	}
}
