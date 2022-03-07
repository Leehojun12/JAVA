public class Quiz01_AtoZ {
	public static void main(String[] args) {
		
		//char 형 배열 26칸짜리 만들어서 알파벳 A부터 Z까지 저장
		// 가능하면 출력까지. ** 아스키코드 활용
		
		char[] arr = new char[26];
		// 일반적인 for문에서는 조건식을 통해 언제까지 반복해줄지 지정하는게 가능
		for(int i=0; i<arr.length;i++) {
			arr[i] = (char)(65+i);
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		
		// foreach : 향상된 for문
		// 무조건 0번부터 끝번까지 순차적으로 하나도 놓치지 않고 거쳐간다
		// char i의 0번째 배열에는 'A'가 찍힌다 그리고 'B'... 
		
		for(char i : arr){
			System.out.print(i + " ");
		}
	}
}
