public class Exam02_Array {
	public static void main(String[] args) {
		// �迭�� ���� / ����
		// CRUD -> CREATE, READ, UPDATE, DELETE
//		int[] arr1 = {1,2,3,4,5};
//		System.out.println("arr1�� ���� �� : " + arr1[0]);
//		arr1[0] = 10;
//		System.out.println("arr1�� ���� �� : " + arr1[0]);
		
		// charArr�ȿ� ����ִ� hello�� �� �� �� �� �� �� ����
		char[] charArr = {'h','e','l','l','o'};
		System.out.println("==== ���� �� ====");
		for(char i : charArr) {
		System.out.print(i + " ");
		}
		char[] charArr1 = {'��','��','��','��','��'};
		for(int i =0; i< charArr.length;i++) {
			charArr[i] = charArr1[i];
		}
		System.out.println("\n==== ���� �� ====");
		for(char i : charArr) {
			System.out.print(i + " ");
			}
		
	}
}
		