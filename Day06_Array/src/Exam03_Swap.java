public class Exam03_Swap {
	public static void main(String[] args) {
		
//		char[] arr = new char[] {'A', 'B'};
//		System.out.println(arr[0] + " " + arr[1]);
//		// A �� B�� ���� ������
//		
//		char temp;
//		temp = arr[0];
//		System.out.println(temp);
//		arr[0] = arr[1];
//		System.out.println(arr[0]);
//		arr[1] =temp;
//		System.out.println(arr[1]);
//		System.out.println(arr[0] + " " + arr[1]);
		
		// hello �� ��� char �迭 �����
		char[] hello = {'h','e','l','l','o'};
		// -> ����� olleh �� ��⵵�� ����� ������.
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
		System.out.println("==== ���� �� ====");
		for(char i : hello) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
				
	}
}
