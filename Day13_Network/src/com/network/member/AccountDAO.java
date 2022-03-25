package com.network.member;

import java.util.ArrayList;

// ������ ���� �����, ��� Ŭ����
public class AccountDAO {
	private ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();

	public void insert(String id, String pw) {
		list.add(new AccountDTO(id, pw));
	}

	public boolean Exist(String id) {
		for (AccountDTO dto : list) {
			if (dto.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkLogin(String id, String pw) {
		// list�� 0�� �ε������� for���� ���鼭 �� �ε����� ����ִ� AccountDTO�� �ν��Ͻ���
		// . ��� getId() / getPw() �޼��带 �Ἥ ������
		// �����Ϳ� Ŭ���̾�Ʈ�� �Ѱ��� �Ű����� id,pw�� ��
		for (AccountDTO dto : list) {
			if (dto.getId().equals(id) && dto.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
}
