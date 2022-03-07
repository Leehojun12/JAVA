public class Current {
	public static void main(String[] args) {
		
		// 한컴타자연습 = 산성비
		// 게임을 시작한 순간부터 종료된 순간까지 시간을 잼
		// -> System.currentTimeMillis() -> 현재시간을 long형 데이터로 뽑아줌
		long start = System.currentTimeMillis(); 
		for(int i =0; i < 9999999; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end -start)/1000 + "초");
	}
}
