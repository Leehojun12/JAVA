public class Exam03_Swap {
	public static void main(String[] args) {
		
//		char[] arr = new char[] {'A', 'B'};
//		System.out.println(arr[0] + " " + arr[1]);
//		// A 와 B의 순서 뒤집기
//		
//		char temp;
//		temp = arr[0];
//		System.out.println(temp);
//		arr[0] = arr[1];
//		System.out.println(arr[0]);
//		arr[1] =temp;
//		System.out.println(arr[1]);
//		System.out.println(arr[0] + " " + arr[1]);
		
		// hello 가 담긴 char 배열 만들기
		char[] hello = {'h','e','l','l','o'};
		// -> 뒤집어서 olleh 가 담기도록 만들어 보세요.
		for(char i : hello) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		char tmp;
		for(int i = 0; i < (hello.length)/2; i++) {
			tmp = hello[i];
			hello[i] = hello[hello.length-1-i];
			hello[hello.length-1-i] = tmp;
		}
		System.out.println("==== 수정 후 ====");
		for(char i : hello) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
				
	}
}
