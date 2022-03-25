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

		String path_down = "C:\\Users\\이호준\\Desktop\\server_download\\";
		String path_up	= "C:\\Users\\이호준\\Desktop\\server_upload\\";
		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());) {

			System.out.println(sock.getLocalAddress() + " 접속 ");

			while (true) {
				String menu = dis.readUTF();
				if (menu.equals("1")) {
					File file = new File(path_down);
					File[] files = file.listFiles();
					// file의 수 먼저 전송
					dos.writeInt(files.length);
					for (File f : files) {
						// 해당 파일의 이름을 반환해주는 메서드
						System.out.println(f.getPath());
						// client에세 이 이름들을 전송
						dos.writeUTF(f.getName());
					}
					dos.flush();

					// client가 요청한 파일명
					String fileName = dis.readUTF();
					System.out.println(fileName);

					// client가 요청한 파일을 서버에서 전송해주기
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
					System.out.println("client가 시스템 종료 했습니다");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
