public class Exam03_stock {
	public static void main(String[]args) {
		/* 주식 매매 프로그램 */
		
		int a = 40000;
		int b = 60000;
		int c = 30000;
		int d = 200000;

		System.out.println("========= 주식마켓 ========");
		System.out.println("1. 삼성전자 (1주: "+ a +")");
		System.out.println("2. 테슬라 (1주: "+ b +")");
		System.out.println("3. 카카오 (1주: "+ c +")");
		System.out.println("잔고 : "+ d +"원");
		System.out.println("=========================");
		
		System.out.println("삼성전자 1주 매수");
		System.out.println("잔고 : "+ (d - a) +"원");
		
		System.out.println("테슬라 2주 매수");
		System.out.println("잔고 : " +(d - a - b*2) +"원");
		
		System.out.println("카카오 1주 매수");
		System.out.println("잔고 : " + (d- a - b*2 - c)+"원");
	}
}
