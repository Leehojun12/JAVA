package com.file.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04_Notepad {
	public static boolean ExistFile(String inputFile) {
		ArrayList<String> list = new ArrayList<>();

		for(int i=0;i<list.size();i++) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
		System.out.println("*** �ܼ� �޸��� ***");
		System.out.println("1. �޸��ϱ�");
		System.out.println("2. �޸��� ����");
		System.out.println("3. �޸� �����ϱ�");
		System.out.println("4. �޸� �����ϱ�");
		System.out.println("5. ���α׷� ����");
		System.out.print(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		String inputFile="";
		if(menu == 1) {
			System.out.println("�޸� �Է�");
			System.out.print(">> ");
			String memo = sc.nextLine();
			System.out.println("������ ������ �̸��� �Է��ϼ���.");
			System.out.print(">> ");
			inputFile = sc.nextLine();
			if(ExistFile(inputFile)) {
				System.out.println("�����ϴ� ���ϸ��Դϴ�");
				break;
			}
			try(FileWriter fw = new FileWriter(inputFile)){
				String str = memo;
				fw.write(str);
				fw.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
			list.add(inputFile);
		}else if(menu == 2) {
			System.out.println("==== ����� �޸� ��� ====");
			if(list.size() == 0) {
				System.out.println("����� �޸� �����ϴ�.");
			}else {
				for(int i =0; i<list.size();i++) {
					System.out.println(list.get(i));
				}
				System.out.println("��� ������ �̸��� �Է��ϼ���.");
				System.out.print(">> ");
				inputFile = sc.nextLine();
			try(FileReader fr = new FileReader(inputFile);
				BufferedReader br = new BufferedReader(fr);){
				String line = "";
				while((line = br.readLine())!= null){
					System.out.println(line);
				}
			}catch(Exception e) {
					System.out.println("����� �޸� �����ϴ�.");
				e.printStackTrace();
				}
			}
		}else if(menu == 3) {
			System.out.println("==== ����� �޸� ��� ====");
			for(int i =0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("������ ���� �̸��� �Է��Ͻÿ�.");
			System.out.print(">> ");
			inputFile = sc.nextLine();
			System.out.println("���� ����� �����ϼ���.");
			System.out.println("1. �����");
			System.out.println("2. �̾��");
			System.out.print(">> ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("������ ������ �Է��ϼ���.");
			System.out.print(">> ");
			String memo =sc.nextLine();
			if(num == 1) {
				try(FileWriter fw = new FileWriter(inputFile);){
					fw.write(memo);
					fw.flush();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if(num == 2) {
				try(FileWriter fw = new FileWriter(inputFile,true);){
					fw.write(memo);
					fw.flush();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("�����Ϸ�");
			
		}else if(menu == 4) {
			
		}
		else if(menu == 5) {
			System.out.println("���α׷� ����");
			break;
		}else {
			System.out.println("menu�� �ٽ� �Է��ϼ���");
			}
		}
	}
}
