package com.oop.jukebox;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" �١� ��ũ�ڽ� �١�");
		System.out.println("�÷��� �ϰ� ���� ������ �������ּ���.");
		System.out.println("1. Seagull - Everet Almond");
		System.out.println("2. Blueming Love poem - IU");
		System.out.println("3. H.O.T - ĵ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� ���� >> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		FileInputStream fis = null; // file�� �ҷ��������ؼ� �ʿ��� FileInputStream
		try{
		if(menu == 1) {
			fis = new FileInputStream("C:\\User\\��ȣ��\\Desktop\\Seagull - Everet Almond.mp3");
		}else if(menu == 2) {
			fis = new FileInputStream("C:\\Users\\��ȣ��\\Desktop\\������-03-Blueming-Love poem-192.mp3");
		}else if(menu == 3) {
			fis = new FileInputStream("C:\\Users\\��ȣ��\\Desktop\\H.O.T.-10-ĵ�� (Candy)-SM Best Album 2-128.mp3");
		}else {
			System.out.println("��ũ�ڽ� ���� Goodbye!!~~");
			}
		
		Player playMP3 = new Player(fis);
		
		playMP3.play();
		fis.close();
		
		}catch(Exception e) {
			e.printStackTrace(); // Test�ϴ� ���� ������ �߻����� �� ��� �߻��ߴ��� �˷��ִ� �ڵ�
			System.out.println("���� ��� ����");
		}
		
		
	}
}
