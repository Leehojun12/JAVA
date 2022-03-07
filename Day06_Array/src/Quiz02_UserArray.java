import java.util.Scanner;

public class Quiz02_UserArray {
	public static void main(String[] args) {
		
		// 사용자에게 입력받은 정수만큼 int 형 배열의 크기를 할당
		// 그리고 1부터 순차적으로 값을 저장
		
		//NumberFormatException
		// try~ catch문: 예외(에러) 처리

			
		try {
			// 에러가 발생할 수 있는 소지가 있는 코드를 이 안쪽에 넣어줌.
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오. >> ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println(arr[10]);
		}catch(Exception e){
			// 만약에 try 문 안쪽의 코드에서 에러가 발생했다면
			// 실행해주고 싶은 코드나 작업을 이 안쪽에서 해줌
			System.out.println("a");
		}
//		for(int i=0; i<arr.length;i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
	}
}
