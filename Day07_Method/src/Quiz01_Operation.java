public class Quiz01_Operation {
	public static int plus(int num1, int num2) {
		int ra = num1 + num2;
		return ra;
	}
	public static int minus(int num1, int num2) {
		int rb = num1 - num2; 
		return rb;
	}
	public static int multi(int num1, int num2) {
		int rc = num1 * num2; 
		return rc;
	}
	public static double divi(int num1, int num2) {
		int rd = num1 / num2; 
		return rd;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(plus(num1 , num2));
		System.out.println(minus(num1 , num2));
		System.out.println(multi(num1 , num2));
		System.out.println(divi(num1 , num2));
		
		// + - * / 를 수행하는 각각의 메서드를 구성해서 결과값을 출력
	}
}
