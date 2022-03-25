package com.network.download01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// 서버에 있는 파일을 클라이언트가 다운로드
		/*
		 * 서버 가동 -> client 접속 -> client 소켓 생성
		 * 서버의 HDD에 있는 파일을 서버 프로그램으로 읽어오기(입력)
		 * 불러들여온 파일을 client에 전송
		 */
		String path = "C:\\Users\\이호준\\Desktop\\server\\";
		String fileName ="Lsa.jpg";
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				FileInputStream fis = new FileInputStream(path + fileName);
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());){
			
			byte[] arr = fis.readAllBytes(); // file의 모든 걸 읽어 오겠다
			System.out.println(arr.length);
			dos.writeInt(arr.length);
			dos.write(arr);
			dos.flush();
			// client에게 파일전송
			// 1. data의 크기를먼저 전송 -> client가 size를 받아 배열을 만들고
			// 2. data를 전송 -> 위의 배열에다가 데이터를 받아준다.
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
