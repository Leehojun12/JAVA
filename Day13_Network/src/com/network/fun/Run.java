package com.network.fun;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String rootpath = "C:\\Users\\이호준\\Desktop\\tead\\";
		try(Socket client = new Socket("15.165.159.46",8000);
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());){
			
			while(true) {
				System.out.print("메뉴 >> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();
				
				if(menu.equals("1")) {
					System.out.println("업로드할 파일명을 입력하세요(확장명 포함)");
					System.out.print(">> ");
					String fileName = sc.nextLine();
					dos.writeUTF(fileName);
					dos.flush();
					
					try (FileInputStream fis = new FileInputStream(rootpath + fileName);) {
						byte[] arr = fis.readAllBytes();

						dos.writeInt(arr.length);
						dos.writeUTF(fileName);
						dos.write(arr);
						dos.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else if(menu.equals("2")) {
					System.out.println("종료");
					break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
