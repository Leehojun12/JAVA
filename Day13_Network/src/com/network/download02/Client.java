package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path_down = "C:\\Users\\이호준\\Desktop\\client_download\\";
		String path_up = "C:\\Users\\이호준\\Desktop\\client_upload\\";
		try (Socket client = new Socket("192.168.219.103", 8000);
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());) {

			while (true) {
				System.out.println("==== file download program ====");
				System.out.println("1. file download");
				System.out.println("2. file upload");
				System.out.println("3. program exit");
				System.out.print(">> ");
				String menu = sc.nextLine();
				dos.writeUTF(menu);
				dos.flush();

				// 몇 개의 file이 넘어오는지..
				if (menu.equals("1")) {
					int count = dis.readInt();
					for (int i = 0; i < count; i++) {
						System.out.println(dis.readUTF());
					}

					System.out.println("다운로드 할 파일명 입력(확장자 포함)");
					System.out.print(">> ");
					String fileName = sc.nextLine();

					// 서버에 다운로드할 파일명 전송
					dos.writeUTF(fileName);
					dos.flush();

					// 파일의 사이즈 먼저 받기
					int size = dis.readInt();
					byte[] arr = new byte[size];
					dis.readFully(arr);
					try (FileOutputStream fos = new FileOutputStream(path_down + fileName)) {
						fos.write(arr);
						fos.flush();
						System.out.println("download success!!");

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (menu.equals("2")) {
						System.out.println("업로드 할 파일명 입력(확장자 포함)");
						System.out.print(">> ");
						String fileName = sc.nextLine();
						
						try(FileInputStream fis = new FileInputStream(path_up + fileName);){
							
							byte[] arr = fis.readAllBytes();
							
							dos.writeInt(arr.length);
							dos.writeUTF(fileName);
							dos.write(arr);
							dos.flush();
							 				
						}catch(Exception e) {
							e.printStackTrace();
						}
						
				} else if (menu.equals("3")) {
					System.out.println("program exit");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
