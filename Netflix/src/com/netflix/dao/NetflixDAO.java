package com.netflix.dao;

import java.util.ArrayList;

import com.netflix.dto.MemberShip;

public class NetflixDAO {

	private ArrayList<MemberShip> ml = new ArrayList<>();

	public void insert(MemberShip ms) {
		ml.add(ms);
	}

	public ArrayList<MemberShip> selectAll() {
		return ml;
	}

	public boolean ExistID(String id) {
		for (int i = 0; i < ml.size(); i++) {
			return true;
		}
		return false;
	}

	public boolean ExistNickname(String nickname) {
		for (int i = 0; i < ml.size(); i++) {
			return true;
		}
		return false;
	}

	public void searchID(String id) {
		for (int i = 0; i < ml.size(); i++) {
			if (ml.get(i).getId().equals(id)) {
				System.out.println(ml.get(i));
			}
		}
	}

	public void searchNickname(String nickname) {
		for (int i = 0; i < ml.size(); i++) {
			if (ml.get(i).getNickname().equals(nickname)) {
				System.out.println(ml.get(i));
			}
		}
	}

	public void modify(String id, String nickname, int point) {
		for (int i = 0; i < ml.size(); i++) {
			if (ml.get(i).getId().equals(id)) {
				ml.get(i).setNickname(nickname);
				ml.get(i).setPoint(point);
				break;
			}
		}
	}

	public void delete(String id) {
		for (int i = 0; i < ml.size(); i++) {
			if (ml.get(i).getId().equals(id)) {
				ml.remove(i);
				break;
			}
		}

	}
}
