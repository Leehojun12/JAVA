package com.instagram.exam;

import java.util.ArrayList;

public class AccountDAO {
	private ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();

	public void insert(String id, String pw, String nickname) {
		list.add(new AccountDTO(id, pw, nickname));
	}
	public boolean ExistID(String id) {
		for (AccountDTO dto : list) {
			if (dto.getId().equals(id)) {
				return true;
			}
		}return false;
	}
	public boolean ExistNick(String nickname) {
		for (AccountDTO dto : list) {
			if(dto.getNickname().equals(nickname)) {
				return true;
			}
		}return false;
	}

	public boolean checkLogin(String id, String pw) {
		for (AccountDTO dto : list) {
			if (dto.getId().equals(id) && dto.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
}
