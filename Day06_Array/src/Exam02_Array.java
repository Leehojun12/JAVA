public class Exam02_Array {
	public static void main(String[] args) {
		// 배열의 수정 / 삭제
		// CRUD -> CREATE, READ, UPDATE, DELETE
//		int[] arr1 = {1,2,3,4,5};
//		System.out.println("arr1의 수정 전 : " + arr1[0]);
//		arr1[0] = 10;
//		System.out.println("arr1의 수정 후 : " + arr1[0]);
		
		// charArr안에 담겨있는 hello를 안 녕 하 세 요 로 수정
		char[] charArr = {'h','e','l','l','o'};
		System.out.println("==== 수정 전 ====");
		for(char i : charArr) {
		System.out.print(i + " ");
		}
		char[] charArr1 = {'안','녕','하','세','요'};
		for(int i =0; i< charArr.length;i++) {
			charArr[i] = charArr1[i];
		}
		System.out.println("\n==== 수정 후 ====");
		for(char i : charArr) {
			System.out.print(i + " ");
			}
		
	}
}
		