package com.network.download02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		String path_down = "C:\\Users\\��ȣ��\\Desktop\\server_download\\";
		String path_up	= "C:\\Users\\��ȣ��\\Desktop\\server_upload\\";
		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			System.out.println(sock.getLocalAddress() + " ���� ");

			while (true) {
				String menu = dis.readUTF();
				if (menu.equals("1")) {
					File file = new File(path_down);
					File[] files = file.listFiles();
					// file�� �� ���� ����
					dos.writeInt(files.length);
					for (File f : files) {
						// �ش� ������ �̸��� ��ȯ���ִ� �޼���
						System.out.println(f.getPath());
						// client���� �� �̸����� ����
						dos.writeUTF(f.getName());
					}
					dos.flush();

					// client�� ��û�� ���ϸ�
					String fileName = dis.readUTF();
					System.out.println(fileName);

					// client�� ��û�� ������ �������� �������ֱ�
					try (FileInputStream fis = new FileInputStream(path_down + fileName);) {
						byte[] arr = fis.readAllBytes();

						dos.writeInt(arr.length);
						dos.write(arr);
						dos.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (menu.equals("2")) {
					int size = dis.readInt();
					byte[] arr = new byte[size];
					
					String fileName = dis.readUTF();
					dis.readFully(arr);
					
					try(FileOutputStream fos = new FileOutputStream(path_up + System.currentTimeMillis()+"__" + fileName)){
						fos.write(arr);
						fos.flush();
					}catch(Exception e) {
						e.printStackTrace();
						}				
				} else if (menu.equals("3")) {
					System.out.println("client�� �ý��� ���� �߽��ϴ�");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
