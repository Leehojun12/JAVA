import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		// 배열 삭제
		// 배열은 처음 만들 때 사이즈 고정

		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3};
		// int의 초기값인 0을 이용해 의미없는 값으로 만들어 버리기.
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
		
//		String[] temp = {"abc","가나다","50"};
//		temp[0] = null;
//		for(String s :temp) {
//			if(s != null)
//			System.out.print(s + " ");
//		}
		
		// int 형 배열 안에서 사용자가 입력한 값만 삭제하기.
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		// 사용자가 입력한 값이 들어있는 인덱스를 0으로 바꾸시오.
		System.out.print("입력하시요. >> ");
		try {
		int input = sc.nextInt();
		intArr[input] = 0;
		System.out.println(intArr[input]);
		}catch(Exception e) {
			System.out.println("오류");
		}
		for(int i = 0; i < intArr.length;i++) {
			System.out.print(i + " ");
		}
		
		
	}
}
