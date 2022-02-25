
public class Quiz01_Casting {
	public static void main(String[] args) {
	 
		//퀴즈 1 : 주어진 값을 모두 int 형으로 변환해서 모두 더한 값을 출력 
		char a ='2';
		double b = 5.6;
		long c = 1250000L;
		int d = 10000;
		
		int rs;
		//rs = a + (int)b + (int)c + d;
		rs = (int)(a + b+ c + d);
		System.out.println("rs : "+ rs);
	}
}
