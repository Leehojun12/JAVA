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

		String path_down = "C:\\Users\\��ȣ��\\Desktop\\client_download\\";
		String path_up = "C:\\Users\\��ȣ��\\Desktop\\client_upload\\";
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

				// �� ���� file�� �Ѿ������..
				if (menu.equals("1")) {
					int count = dis.readInt();
					for (int i = 0; i < count; i++) {
						System.out.println(dis.readUTF());
					}

					System.out.println("�ٿ�ε� �� ���ϸ� �Է�(Ȯ���� ����)");
					System.out.print(">> ");
					String fileName = sc.nextLine();

					// ������ �ٿ�ε��� ���ϸ� ����
					dos.writeUTF(fileName);
					dos.flush();

					// ������ ������ ���� �ޱ�
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
						System.out.println("���ε� �� ���ϸ� �Է�(Ȯ���� ����)");
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
