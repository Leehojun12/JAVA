import java.util.Scanner;

public class Quiz03_VendingMachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Balance = 2000;
		int coca = 0;
		int sprite = 0;
		int plum = 0;
		vending:while(true) {		
			System.out.println("===== 자판기 시뮬레이터 =====");
			System.out.print("1.콜라(1000) ");
			System.out.print("2.사이다(800) ");
			System.out.print("3.매실차(1500) ");
			System.out.print("[0.소지품 확인] ");
			System.out.println("10.자판기 종료");
			System.out.print("음료수를 선택하세요. >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 0:
				System.out.println("\n===== 소지품 목록 =====");
				System.out.println("소지금 : " + Balance);
				System.out.println("콜라 : " + coca);
				System.out.println("사이다 : " + sprite);
				System.out.println("매실차 : " + plum);
				break;
			case 1:
				if(Balance >= 1000) {
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 +1");
					System.out.println("소지금 -1000");
					coca += 1;
					Balance -= 1000;
				}
				else {
					System.out.println("잔액이 부족합니다");
				}
				break;
			case 2:
				if(Balance >= 800) {
					System.out.println("사이다를 구매했습니다.");
					System.out.println("사이다 +1");
					System.out.println("소지금 -800");
					sprite += 1;
					Balance -= 800;
				}
					else {
					System.out.println("잔액이 부족합니다");
					}
				break;
			case 3:
				if(Balance >= 1500) {
					System.out.println("매실차를 구매했습니다.");
					System.out.println("매실차 +1");
					System.out.println("소지금 -1500");
					plum += 1;
					Balance -= 1500;
				}else {
					System.out.println("잔액이 부족합니다");
				}
				break;
			case 10:
				System.out.println("자판기 종료");
				break vending;
			default:
				System.out.println("입력한 숫자를 다시 확인해주세요.");
			}
		}
	}
}
