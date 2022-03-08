public class Exam03_ParamArg {
	
	
	public static char getA() {
		return 'A';
	}
	
	public static void greeting() {
		System.out.println("안녕하세요~");
	}
	
	public static void main(String[] args) {
		/*
		 * getA() A라고 하는 값을 반환받고 싶음
		 * 매개변수 인자값은 반드시 있어야 하는게 아님 -> 필수 X
		 * 리턴 값이 없을 수도 있다 -> void를 사용하게 되면 return을 사용 안한다 
		 * void : 리턴값이 없음 경우 메서드 정의부에 적어주는 특수한 메서드
		 */
//		System.out.println(getA());
		
		greeting();
	}
}
