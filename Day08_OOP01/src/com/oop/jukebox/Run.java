package com.oop.jukebox;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ☆☆ 쥬크박스 ☆☆");
		System.out.println("플레이 하고 싶은 음악을 선택해주세요.");
		System.out.println("1. Seagull - Everet Almond");
		System.out.println("2. Blueming Love poem - IU");
		System.out.println("3. H.O.T - 캔디");
		System.out.println("4. 프로그램 종료");
		System.out.print("음악 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		FileInputStream fis = null; // file을 불러오기위해서 필요한 FileInputStream
		try{
		if(menu == 1) {
			fis = new FileInputStream("C:\\User\\이호준\\Desktop\\Seagull - Everet Almond.mp3");
		}else if(menu == 2) {
			fis = new FileInputStream("C:\\Users\\이호준\\Desktop\\아이유-03-Blueming-Love poem-192.mp3");
		}else if(menu == 3) {
			fis = new FileInputStream("C:\\Users\\이호준\\Desktop\\H.O.T.-10-캔디 (Candy)-SM Best Album 2-128.mp3");
		}else {
			System.out.println("쥬크박스 종료 Goodbye!!~~");
			}
		
		Player playMP3 = new Player(fis);
		
		playMP3.play();
		fis.close();
		
		}catch(Exception e) {
			e.printStackTrace(); // Test하는 동안 에러가 발생했을 때 어디에 발생했는지 알려주는 코드
			System.out.println("음악 재생 오류");
		}
		
		
	}
}
