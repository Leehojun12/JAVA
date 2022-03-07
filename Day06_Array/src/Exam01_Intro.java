public class Exam01_Intro {
	public static void main(String[] args) {
		/*
		 * 배열(Array) : 같은 자료형의 집합
		 * -> 같은 자료형 변수들을 모아서 하나의 이름으로 관리
		 *
		 * int[] -> int형 배열을 의미(자료형)
		 * arr -> 변수명 
		 * new -> heap 영역에 저장 -> 배열은 참조자료형
		 * int[5] -> heap 영역에 5칸짜리 공간 (변수)을 만들겠다
		 * -> 배열을 생성할 때는 반드시 사이즈 명시적으로 표기
		 * 배열은 size(5)의 크기와 index(4)의 크기가 다르다
		 * System.out.println(arr); -> arr의 주소값
		 */
		// 30명으로 이뤄진 반
		// 김~최 (30개)
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
		
		// 배열 생성과 함께 초기화
		
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,5};
		double[] arr4 = {0.5, 1.1, 1.45};
//		System.out.println(arr4[2]);
		String[] arr5 = {"a","b","c"};
//		System.out.println(arr5[2]);
		
		// 이미 배열에 저장된 데이터를 모두 꺼내오는 작업
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
