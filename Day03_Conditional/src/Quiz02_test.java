import java.util.Scanner;

public class Quiz02_test {
	public static void main(String[] args) {
		System.out.println("=== 색깔로 알아보는 심리테스트 ===");

		Scanner sc = new Scanner(System.in);
		String red = "끊임 없이 에너지가 넘치는 당신은 인싸력 갑!!!";
		String yellow = "이상적이고 논리적인 당신은 남보다 우월하길 바라는 타입!!!";
		String green = "당신은 전체적인 균형의 수호자!!!";
		String orange = "낙천적으로 인생을 즐기는 당신은 긍정왕!!!";

		System.out.println("빨강색, 오렌지, 녹색, 노랑색");
		System.out.print("첫 번째 색깔 선택 : ");

		String input = sc.nextLine();

		if (input.equals("빨강색")) {
			System.out.println(red + "\n남을 따르기보다 리드하는 성격으로 사교적이며 지도력이 있어요, " + "다만 가끔은 논리와 감정의 조화가 필요해요");
		} else if (input.equals("오렌지")) {
			System.out.println(orange + "\n어느 곳이든지 능동적으로 참여해 주위 사람들을 즐겁게 합니다.");
		} else if (input.equals("녹색")) {
			System.out.println(green + "\n능률적이고 성실한 타입이예요.\n" + "다만 주변상황이나 사람에 대해 많은 조심성을 갖고 있어요.");
		} else if (input.equals("노랑색")) {
			System.out.println(yellow + "말솜씨가 뛰어나 언어나 숫자 관련 일에 참여하며" + "," + "책임과 권위를 필요로하는 곳에 잘 어울립니다.");
		} else {
			System.out.println("이세상에 존재하지 않아요");
		}
	}
}
