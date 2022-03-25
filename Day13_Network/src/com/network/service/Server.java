package com.network.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class Server {
	public static HashSet<Integer> getLotto() {
		// 1~45 사이의 6개의 랜던한 번호 뽑아내서 반환해주기
		// (Math.random() * (최대값 - 최솟값 + 1) + 최솟값)
		
		Random rand = new Random();
		//nextInt() -> 0~N 사이의 랜덤한 수를 반환해주는 함수
		
		// 컬렉션 -> 중복되지 않는 값만 저장하는 저장소, 값이 무작위로 저장된다
		
		 HashSet<Integer> lotto = new HashSet<>();
		
		 while(lotto.size() < 6) {
			 lotto.add(rand.nextInt(45)+1); // 저장소에 저장
		 }
		return lotto;
	}
	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataInputStream dis = new DataInputStream(sock.getInputStream());
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());) {

			String hi = "접속 하신걸 환영 합니다.";
			dos.writeUTF(hi);
			dos.flush();

			String nickname = dis.readUTF();
			System.out.println(nickname + "님 접속");

			while (true) {
				String menu = dis.readUTF();
				System.out.println(nickname + "님이 " + menu + "번을 선택했습니다.");
				String rs ="";
				if (menu.equals("1")) {
					rs = "\n*** 오늘의 운세 ***\n\n물병자리 : 용기 있는 태도"
							+ "\n재물운이 나쁘지는 않지만 동시에 소비도 늘어나는 때입니다.\n무조건 소비를 할 것이 아니라 자신이 필요로 하는 것에 집중하도록 하세요.\n정작 필요한 때에 돈이 없는 사태가 발생할 수도 있습니다.\n"
							+ "\n물고기자리 : 무심하면 손해 막심"
							+ "\n무엇을 하든 잘 될 것 같은 느낌이 마음 속에 가득합니다.\n그만큼 자신감도 강해지고 일의 추진력도 높아지는 날이네요.\n주변 사람들에게 살뜰하게 굴면 그만큼 행운이 커지게 됩니다.\n"
							+ "\n양자리 : 참견은 금물"
							+ "\n자신의 관심을 한 곳으로 집중시킬 필요가 있습니다.\n이곳 저곳 기웃거리기만 하고 확실하게 집중을 하지 못하면 성과도 없습니다.\n진로의 변경을 고민하고 있다면 조금 미루는 것이 좋겠습니다.\n"
							+ "\n황소자리 : 꿋꿋하고 꿋꿋하게"
							+ "\n나름대로 열심히 한다고 하기는 하는데 그 결과가 신통치 않을 수 있습니다.\n하지만 그렇다고 해서 싫증을 내면 안 됩니다.\n조금만 더 노력을 하도록 하세요. 결실을 보게 될 것입니다.\n"
							+ "\n전갈자리 : 과감하게 새로 시작!!"
							+ "\n만약에 지금 진행하고 있는 일들이 지지부진 하다면 아예 포기를 하는 것도 방법이 될 수 있습니다.\n되지 않는 일을 붙잡고 있는 것보다 과감하고 새롭게 무언가를 시작하는 것도 방법입니다.";
					

				} else if (menu.equals("2")) {
					rs = "\n*** 오늘의 날씨*** \n\n어제보다 3도 높음 / 흐림 \n미세먼지 : 보통\n초미세먼지 : 나쁨\n자외선 : 보통\n일몰 : 18:47";
					
				} else if (menu.equals("3")) {
					rs = getLotto().toString();
					
				} else if (menu.equals("4")) {
					System.out.println("Service를 종료하겠습둥");
					break;
				}
				dos.writeUTF(rs);
				dos.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
