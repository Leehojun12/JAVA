public class Exam03_stock {
	public static void main(String[]args) {
		/* 주식 매매 프로그램 */

		System.out.println("========= 주식마켓 ========");
		System.out.println("1. 삼성전자 (1주: "+ 40000+")");
		System.out.println("2. 테슬라 (1주: "+ 60000+")");
		System.out.println("3. 카카오 (1주: "+ 30000+")");
		System.out.println("잔고 : "+ 200000+"원");
		System.out.println("=========================");
		
		System.out.println("삼성전자 1주 매수");
		System.out.println("잔고 : "+ (200000 - 40000) +"원");
		
		System.out.println("테슬라 2주 매수");
		System.out.println("잔고 : " +(200000 - 40000 - 120000) +"원");
		
		System.out.println("카카오 1주 매수");
		System.out.println("잔고 : " + (200000- 40000 - 120000 - 30000)+"원");
	}
}
