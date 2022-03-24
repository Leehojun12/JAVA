package com.network.basic;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		// 1. 서버용 소켓 생성
		// ServerSocket : client 수만큼 socket을 생성해주는 공장
		try(ServerSocket server = new ServerSocket(8000); // () -> 내부 포트 번호
			Socket sock = server.accept();){ 
			// 2. client의 요청을 수락할 client 전용 소켓 생성
			// client의 실제 접속 감지됐을 때까지 대기하다가 소켓 생성
			
			System.out.println("new client 접속");
			System.out.println("접속한 IP : " + sock.getLocalAddress());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
